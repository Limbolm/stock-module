package com.limbo.orderCenter.entity;

import java.util.Date;

/**
 *  维度索引表
 *  shopId商户ID
 *  dbId客户Id
 *  orderId订单Id
 *  state订单状态
 * Created by Administrator on 2018/4/1 0001.
 */
public class ShardShop {
    private String id;
    private String shopId;
    private String dbId;
    private String orderId;
    private Date orderTime;
    private Integer state;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getShopId() {
        return shopId;
    }

    public void setShopId(String shopId) {
        this.shopId = shopId;
    }

    public String getDbId() {
        return dbId;
    }

    public void setDbId(String dbId) {
        this.dbId = dbId;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public Date getOrderTime() {
        return orderTime;
    }

    public void setOrderTime(Date orderTime) {
        this.orderTime = orderTime;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }
}
