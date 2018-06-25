package com.limbo.orderCenter.entity;

/**
 * 日志表，订单完成后插入
 * Created by Administrator on 2018/4/1 0001.
 */
public class OrderMsgLog {
    private String tranId;
    private String shardKey;

    public String getTranId() {
        return tranId;
    }

    public void setTranId(String tranId) {
        this.tranId = tranId;
    }

    public String getShardKey() {
        return shardKey;
    }

    public void setShardKey(String shardKey) {
        this.shardKey = shardKey;
    }
}
