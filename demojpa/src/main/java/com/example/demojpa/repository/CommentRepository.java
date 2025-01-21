package com.example.demojpa.repository;

import com.example.demojpa.entities.BlogPost;
import com.example.demojpa.entities.Comment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CommentRepository extends JpaRepository<Comment,Integer> {
    List<Comment> findByBlogPost(BlogPost blogPost);
}
