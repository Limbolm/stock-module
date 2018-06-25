package com.limbo.orderCenter.service.impl;

import com.limbo.orderCenter.service.TranService;

/**
 * 事务表，订单生成前插入,插入后把事务记录进消息队列
 * Created by Administrator on 2018/4/1 0001.
 */
public class TranServiceImpl implements TranService{
    @Override
    public Object findById(Object map) throws Exception {
        return null;
    }

    @Override
    public int insert(Object map) throws Exception {
        return 0;
    }

}
