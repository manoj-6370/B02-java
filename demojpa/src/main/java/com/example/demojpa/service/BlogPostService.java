package com.example.demojpa.service;

import com.example.demojpa.dtoEntities.BlogPostDto;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface BlogPostService {

    public BlogPostDto createBlogPost(BlogPostDto blogPostDto);
    public List<BlogPostDto> getAllBlogPost(Pageable page);
    public BlogPostDto updateBlogPost(BlogPostDto blogPostDto);
    public BlogPostDto getBlogPostById(Integer id);

}
