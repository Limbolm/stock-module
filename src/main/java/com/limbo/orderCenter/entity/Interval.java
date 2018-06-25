package com.limbo.orderCenter.entity;

import java.math.BigInteger;
import java.util.Date;

/**区间价
 * Created by Administrator on 2018/1/5 0005.
 */
public class Interval {
    private String intervalId;
    //图片路径，多图用“;”隔开
    private String picPath;
    //区间名字
    private String name;
    //价格
    private BigInteger price;
    //店铺ID
    private String storeId;
    //区间库存
    private BigInteger num;
    //商品ID
    private String goodsId;

    private Date createTime;
    private Date updateTime;

    public String getIntervalId() {
        return intervalId;
    }

    public void setIntervalId(String intervalId) {
        this.intervalId = intervalId;
    }

    public String getPicPath() {
        return picPath;
    }

    public void setPicPath(String picPath) {
        this.picPath = picPath;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigInteger getPrice() {
        return price;
    }

    public void setPrice(BigInteger price) {
        this.price = price;
    }

    public String getStoreId() {
        return storeId;
    }

    public void setStoreId(String storeId) {
        this.storeId = storeId;
    }

    public BigInteger getNum() {
        return num;
    }

    public void setNum(BigInteger num) {
        this.num = num;
    }

    public String getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(String goodsId) {
        this.goodsId = goodsId;
    }
}
