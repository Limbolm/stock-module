package com.limbo.orderCenter.entity;

/**
 *
 * 事务表，订单生成前插入
 * param订单参数
 * Created by Administrator on 2018/4/1 0001.
 */
public class Tran {
    private String tranId;
    private String param;

    public String getTranId() {
        return tranId;
    }

    public void setTranId(String tranId) {
        this.tranId = tranId;
    }

    public String getParam() {
        return param;
    }

    public void setParam(String param) {
        this.param = param;
    }
}
