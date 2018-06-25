package com.limbo.orderCenter.entity;

import java.math.BigInteger;

/**
 * 订单详情表
 * Created by Administrator on 2018/1/4 0004.
 */
public class OrderItem {
    private String id;
    //订单ID
    private String orderId;
    //商品ID
    private String goodsId;
    //商品标题
    private String title;
    //商品图片路径
    private String picPath;
    //数量
    private Integer num;
    //单价
    private BigInteger price;
    //总价
    private BigInteger totalFee;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(String goodsId) {
        this.goodsId = goodsId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPicPath() {
        return picPath;
    }

    public void setPicPath(String picPath) {
        this.picPath = picPath;
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    public BigInteger getPrice() {
        return price;
    }

    public void setPrice(BigInteger price) {
        this.price = price;
    }

    public BigInteger getTotalFee() {
        return totalFee;
    }

    public void setTotalFee(BigInteger totalFee) {
        this.totalFee = totalFee;
    }
}
