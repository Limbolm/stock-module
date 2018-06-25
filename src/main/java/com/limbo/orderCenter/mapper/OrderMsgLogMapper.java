package com.limbo.orderCenter.mapper;

import com.limbo.orderCenter.entity.OrderMsgLog;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by Administrator on 2018/4/10 0010.
 */
public interface OrderMsgLogMapper {


    /**
     * 根据id 查询订单日志
     * @return
     */
    List<OrderMsgLog> queryOrderMsgLogByInfo(OrderMsgLog orderMsgLog);

    /**
     * 新增订单日志
     * @param orderMsgLog
     * @return
     */
    int insertOrderMsgLog(@Param("orderMsgLog") OrderMsgLog orderMsgLog);

    /**
     * 更新订单日志
     * @param orderMsgLog
     * @return
     */
    int updateOrderMsgLog(@Param("orderMsgLog") OrderMsgLog orderMsgLog);
}
