package com.limbo.orderCenter.service;

import com.limbo.orderCenter.entity.Goods;

import java.util.List;

/**
 * Created by chenxiaopei on 19/11/2017.
 */
public interface GoodsService {

    /**
     * 根据条件查询商品信息
     * @return
     */
    List<Goods> queryGoodsByInfo(Goods goods);

    /**
     * 新增商品
     * @param goods
     * @return
     */
    int insertGoods(Goods goods);

    int updateGoods(Goods goods);

}
