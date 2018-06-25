package com.limbo.orderCenter.mapper;


import com.limbo.orderCenter.entity.Order;
import com.sun.tools.javac.util.List;
import org.apache.ibatis.annotations.Param;

/**
 * Created by Administrator on 2018/4/10 0010.
 */
public interface OrderMapper {
    /**
     * 根据id 查询订单
     * @return
     */
    List<Order> queryOrderByInfo(Order order);

    /**
     * 新增订单
     * @param order
     ** @return
     */
    int insertOrder(@Param("order") Order order);

    /**
     * 更新订单
     * @param order
     ** @return
     */
    int updateOrder(@Param("order") Order order);
}
