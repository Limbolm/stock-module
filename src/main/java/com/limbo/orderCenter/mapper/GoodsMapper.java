package com.limbo.orderCenter.mapper;

import com.limbo.orderCenter.entity.Goods;
import com.sun.tools.javac.util.List;
import org.apache.ibatis.annotations.Param;

/**
 * Created by Administrator on 2018/4/10 0010.
 */
public interface GoodsMapper {


    /**
     * 根据id 查询商品
     * @return
     */
    List<Goods> queryGoodsByInfo(Goods goods);

    /**
     * 新增商品
     * @param goods
     ** @return
     */
    int insertGoods(@Param("goods") Goods goods);
    /**
     * 更新商品
     * @param goods
     * @return
     */
    int updateGoods(@Param("goods") Goods goods);
}
