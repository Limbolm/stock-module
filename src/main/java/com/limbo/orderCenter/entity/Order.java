package com.limbo.orderCenter.entity;

import java.util.Date;

/**
 * 订单类
 */
public class Order {
    private String orderId;
    //支付金额
    private String payment;
    //邮费
    private String postFee;
    //快递名称
    private String shippingName;
    //快递单号
    private String shippingCode;
    //用户ID
    private String userId;
    //买家留言备注
    private String buyerMessage;
    //买家昵称
    private String buyerNice;
    //创建时间
    private Date createTime;
    //更新时间
    private Date updateTime;
    //支付时间
    private Date paymentTime;
    //发货时间
    private Date consignTime;
    //交易结束时间
    private Date endTime;
    //交易关闭时间
    private Date closeTime;
    //支付类型： 1在线支付 2到付
    private Integer payType;
    //订单状态： 1未付款 2已付款 3未发货 4已发货 5交易成功 6交易关闭 7退款中 8已退款
    private Integer status;
    //买家是否评价
    private Integer buyerRate;

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getPayment() {
        return payment;
    }

    public void setPayment(String payment) {
        this.payment = payment;
    }

    public String getPostFee() {
        return postFee;
    }

    public void setPostFee(String postFee) {
        this.postFee = postFee;
    }

    public String getShippingName() {
        return shippingName;
    }

    public void setShippingName(String shippingName) {
        this.shippingName = shippingName;
    }

    public String getShippingCode() {
        return shippingCode;
    }

    public void setShippingCode(String shippingCode) {
        this.shippingCode = shippingCode;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getBuyerMessage() {
        return buyerMessage;
    }

    public void setBuyerMessage(String buyerMessage) {
        this.buyerMessage = buyerMessage;
    }

    public String getBuyerNice() {
        return buyerNice;
    }

    public void setBuyerNice(String buyerNice) {
        this.buyerNice = buyerNice;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Date getPaymentTime() {
        return paymentTime;
    }

    public void setPaymentTime(Date paymentTime) {
        this.paymentTime = paymentTime;
    }

    public Date getConsignTime() {
        return consignTime;
    }

    public void setConsignTime(Date consignTime) {
        this.consignTime = consignTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public Date getCloseTime() {
        return closeTime;
    }

    public void setCloseTime(Date closeTime) {
        this.closeTime = closeTime;
    }

    public Integer getPayType() {
        return payType;
    }

    public void setPayType(Integer payType) {
        this.payType = payType;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getBuyerRate() {
        return buyerRate;
    }

    public void setBuyerRate(Integer buyerRate) {
        this.buyerRate = buyerRate;
    }
}
