package com.limbo.orderCenter.service.impl;

import com.limbo.orderCenter.entity.Comment;
import com.limbo.orderCenter.mapper.CommentMapper;
import com.limbo.orderCenter.service.CommentService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 评论 service
 *
 * @author ray
 * @date 2017／11／19
 */
@Service
public class CommentServiceImpl implements CommentService {

    Logger logger = Logger.getLogger(CommentServiceImpl.class);

    @Autowired
    private CommentMapper commentMapper;

    /**
     * 根据条件查询评论信息
     * @return
     */
    public List<Comment> queryCommentByInfo(Comment comment){
       List<Comment> comments = commentMapper.queryCommentByInfo(comment);
        return comments;
    }

    /**
     * 新增评论
     * @param comment
     * @return
     */
    public int insertComment(Comment comment){
        int result = commentMapper.insertComment(comment);
        return result;
    }

    public int updateComment(Comment comment){
        int result = commentMapper.updateComment(comment);
        return result;
    }
}
