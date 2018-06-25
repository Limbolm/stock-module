package com.limbo.orderCenter.service;

import com.limbo.orderCenter.entity.Comment;

import java.util.List;

/**
 * Created by Administrator on 2018/1/5 0005.
 */
public interface CommentService {

    /**
     * 根据条件查询评论信息
     * @return
     */
    public List<Comment> queryCommentByInfo(Comment comment);

    /**
     * 新增评论
     * @param comment
     * @return
     */
    public int insertComment(Comment comment);

    public int updateComment(Comment comment);
}
