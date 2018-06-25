package com.limbo.orderCenter.service.impl;

import com.limbo.orderCenter.entity.Goods;
import com.limbo.orderCenter.mapper.GoodsMapper;
import com.limbo.orderCenter.service.GoodsService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Created by Administrator on 2018/1/5 0005.
 */
public class GoodsServiceImpl implements GoodsService{
    Logger logger = Logger.getLogger(GoodsServiceImpl.class);

    @Autowired
    private GoodsMapper goodsMapper;
    @Override
    public List<Goods> queryGoodsByInfo(Goods goods) {
        return goodsMapper.queryGoodsByInfo(goods);
    }

    @Override
    public int insertGoods(Goods goods) {
        return goodsMapper.insertGoods(goods);
    }

    @Override
    public int updateGoods(Goods goods) {
        return goodsMapper.updateGoods(goods);
    }
}
