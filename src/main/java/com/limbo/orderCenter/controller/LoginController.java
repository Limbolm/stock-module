package com.limbo.orderCenter.controller;

import com.ray.userCenter.entity.UserInfoEntity;
import com.ray.userCenter.service.UserInfoService;
import com.ray.userCenter.util.RedisUtil;
import com.ray.userCenter.util.StringUtils;
import com.ray.userCenter.util.TokenUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;
import java.util.Map;


/**
 * Created by chenxiaopei on 26/11/2017.
 */
@RestController
@RequestMapping(value = "login")
public class LoginController {
    @Autowired
    private UserInfoService userInfoService;
    @Autowired
    private TokenUtil tokenUtil;
    @Autowired
    private RedisUtil redisUtil;
    @Value("${wz.successPage:/}")
    private String successPage;
    //TODO:生成验证码
/*    @RequestMapping()
    public ModelAndView getCheckCodeImage(HttpServletRequest request, HttpServletResponse response) throws IOException {
        // 生成校验码
        String code = ValidateCodeService.createRandomCode(4);

        // 将校验码保存到SessionComponent中
        SessionComponent sc = SessionComponent.getInstance(context);
        sc.setCheckCode(code);

        // 生成校验码图片
        response.setHeader("Pragma", "no-cache");
        response.setDateHeader("Expires", 0);
        response.addHeader("Cache-Control", "no-cache");
        response.addHeader("Cache-Control", "no-store");
        response.addHeader("Cache-Control", "must-revalidate");
        BufferedImage image = validateCodeService.getValidateImage(code);
        ImageIO.write(image, "png", response.getOutputStream());

        return null;
    }*/

    //TODO:登录验证
    @RequestMapping("afterAuth.do")
    public Map<String, Object> login(@RequestParam(required = true) String account,
                             @RequestParam(required = true) String password, @RequestParam(required = false) String checkCode,
                             @RequestParam(required = false) String url,
                             @RequestParam(required = false, defaultValue = "false") boolean rememberAccount,
                             @RequestParam(required = false, defaultValue = "false") boolean rememberPassword,
                             HttpServletRequest request, HttpServletResponse response) throws Exception {
        return this.internalLogin(account, password, checkCode, url, rememberAccount, rememberPassword, request,
                    response);
    }


    //TODO:注销
    @RequestMapping("afterAuth.do")
    public ModelAndView login(@RequestParam(required = true) String account) throws Exception {
        String token = (String)redisUtil.getObject(account);
        redisUtil.removeBykey(token);
        redisUtil.removeBykey(account);
        return new ModelAndView("");
    }

    //验证方法
    protected Map<String,Object> internalLogin(String account, String password, String checkCode, String url,
                                         boolean rememberAccount, boolean rememberPassword, HttpServletRequest request, HttpServletResponse response)
            throws Exception {
		/*
		 * 应要求，去除验证码 String code=sc.getCheckCode(); if(code==null ||
		 * !code.equalsIgnoreCase(checkCode)) return loginFailure(account, url,
		 * "校验码错误！",rememberAccount, rememberPassword,request);
		 */

        Map<String,Object> map = new HashMap<String, Object>();
        //登陆操作
        UserInfoEntity arg = new UserInfoEntity();
        arg.setAccount(account);
        arg.setPassWord(password);
        UserInfoEntity infoEntity = userInfoService.getUserInfoEntityByInfo(arg);
        boolean result = userInfoService.checkPassWord(infoEntity);
        // LoginResult result=tokenService.login(account, password);

        if (!result) {
            map.put("result","帐号或密码错误！");
        }else{
            String token = tokenUtil.getLoginToken(arg.getAccount());

            //单点登陆
            if(redisUtil.exists(account))
                redisUtil.removeBykey(account);
            redisUtil.setKeyValue(infoEntity.getAccount(),token);
            redisUtil.setKeyValue(token,infoEntity);
            map.put("result","登陆成功");
            if (StringUtils.isEmpty(url))
                url = successPage;
            map.put("url","/index"+url);
        }

        // sc.setUnit(unitService.getUserUnitsByUserId(person.getId()));
        return map;
    }

}
