package com.limbo.orderCenter.service;

import com.limbo.orderCenter.entity.Order;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by Administrator on 2018/1/5 0005.
 */
public interface OrderService {
    /**
     * 根据条件查询订单信息
     * @return
     */
    List<Order> queryOrderByInfo(Order order);

    /**
     * 新增订单
     * @param order
     * @return
     */
    int insertOrder(Order order);

    int updateOrder(Order order);
}
