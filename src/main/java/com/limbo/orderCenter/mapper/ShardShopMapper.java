package com.limbo.orderCenter.mapper;

import com.limbo.orderCenter.entity.ShardShop;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by Administrator on 2018/4/10 0010.
 */
public interface ShardShopMapper {
    /**
     * 根据id 查询维度索引
     * @return
     */
    List<ShardShop> queryShardShopByInfo(ShardShop shardShop);

    /**
     * 新增维度索引
     * @param shardShop
     * @return
     */
    int insertShardShop(@Param("shardShop") ShardShop shardShop);

    /**
     * 更新维度索引
     * @param shardShop
     * @return
     */
    int updateShardShop(@Param("shardShop") ShardShop shardShop);
}
