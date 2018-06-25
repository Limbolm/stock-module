package com.limbo.orderCenter.mapper;

import com.limbo.orderCenter.entity.Tran;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by Administrator on 2018/4/10 0010.
 */
public interface TranMapper {

    /**
     * 根据id 查询事务
     * @return
     */
    List<Tran> queryTranByInfo(Tran tran);

    /**
     * 新增事务
     * @param tran
     * @return
     */
    int insertTran(@Param("tran") Tran tran);

    /**
     * 更新事务
     * @param tran
     * @return
     */
    int updateTran(@Param("tran") Tran tran);
}
