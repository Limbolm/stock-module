package com.limbo.orderCenter.mapper;

import com.limbo.orderCenter.entity.Comment;
import com.sun.tools.javac.util.List;
import org.apache.ibatis.annotations.Param;

/**
 * Created by Administrator on 2018/4/10 0010.
 */
public interface CommentMapper {

    /**
     * 根据id 查询评论
     * @return
     */
    List<Comment> queryCommentByInfo(Comment comment);

    /**
     * 新增评论
     * @param comment
     * @return
     */
    int insertComment(@Param("comment") Comment comment);

    /**
     * 更新评论
     * @param comment
     * @return
     */
    int updateComment(@Param("comment") Comment comment);
}
