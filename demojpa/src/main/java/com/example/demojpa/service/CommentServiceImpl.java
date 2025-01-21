package com.example.demojpa.service;

import com.example.demojpa.dtoEntities.CommentDto;
import com.example.demojpa.entities.BlogPost;
import com.example.demojpa.entities.Comment;
import com.example.demojpa.helper.ResourceNotFoundException;
import com.example.demojpa.repository.BlogPostRepository;
import com.example.demojpa.repository.CommentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class CommentServiceImpl implements CommentService{

    @Autowired
    BlogPostRepository blogPostRepository;

    @Autowired
    CommentRepository commentRepository;

    @Override
    public CommentDto postComment(CommentDto commentDto) {
        Comment comment=commentRepository.save(commentDtoToEntity(commentDto));
        return commentEntityToDto(comment);
    }

    @Override
    public List<CommentDto> getCommentByBlogId(Integer id) {
        Optional<BlogPost> findById = blogPostRepository.findById(id);
        BlogPost blogPost =findById.orElseThrow(()->new ResourceNotFoundException("BlogPost","Id",id));
         List<Comment>commentList=commentRepository.findByBlogPost(blogPost);
        List<CommentDto> commentDtoList=commentList.stream().map(c->commentEntityToDto(c)).collect(Collectors.toList());

        return commentDtoList;
    }


    public CommentDto commentEntityToDto(Comment comment){
        CommentDto cdto=new CommentDto();
        cdto.setCommentmsg(comment.getCommentmsg());
        cdto.setBlogPostId(comment.getBlogPost().getBlogId());

        return cdto;
    }
    public Comment commentDtoToEntity(CommentDto commentDto){
        Comment comment=new Comment();
        comment.setCommentmsg(commentDto.getCommentmsg());
        Optional<BlogPost> findById = blogPostRepository.findById(commentDto.getBlogPostId());
        BlogPost blogPost =findById.orElseThrow(()->new ResourceNotFoundException("BlogPost","Id",commentDto.getBlogPostId()));
        comment.setBlogPost(blogPost);

        return comment;
    }
}
