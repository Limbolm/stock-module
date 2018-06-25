package com.limbo.orderCenter.service;

/**
 * Created by Administrator on 2018/4/1 0001.
 */
public interface TranService<T> {
    /**
     * 根据Id查询
     * @param map
     * @return
     * @throws Exception
     */
    T findById(T map)throws Exception;

    /**
     * 新增
     * @param map
     * @return
     * @throws Exception
     */
    int insert(T map)throws Exception;

}
