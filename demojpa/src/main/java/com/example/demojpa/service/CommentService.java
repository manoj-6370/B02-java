package com.example.demojpa.service;

import com.example.demojpa.dtoEntities.BlogPostDto;
import com.example.demojpa.dtoEntities.CommentDto;
import com.example.demojpa.entities.Comment;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface CommentService {

    public CommentDto postComment(CommentDto commentDto);

    public  List<CommentDto> getCommentByBlogId(Integer blogPostid);

}
