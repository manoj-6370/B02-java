package com.example.demojpa.service;

import com.example.demojpa.dtoEntities.BlogPostDto;
import com.example.demojpa.entities.BlogPost;
import com.example.demojpa.entities.Comment;
import com.example.demojpa.helper.ResourceNotFoundException;
import com.example.demojpa.repository.BlogPostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BlogPostServiceImpl implements BlogPostService {
    @Autowired
    BlogPostRepository blogPostRepository ;

    public BlogPostDto createBlogPost(BlogPostDto blogPostDto){

        BlogPost blogPost=blogPostRepository.save(blogPostDtoToBlogPost(blogPostDto));
        return blogPostToBlogPostDto(blogPost);
    }

    public List<BlogPostDto> getAllBlogPost(Pageable page){
        Page<BlogPost> findAll=blogPostRepository.findAll(page);
        List<BlogPost> blogPostList=findAll.getContent();
        return  blogPostList.stream().map(blogPost -> blogPostToBlogPostDto(blogPost)).toList();
        // return  blogPostList.stream().map(this::blogPostToBlogPostDto).toList();
    }

    public BlogPostDto updateBlogPost(BlogPostDto blogPostDto){
        Optional<BlogPost> findById = blogPostRepository.findById(blogPostDto.getBlogId());
        BlogPost blogPost =findById.orElseThrow(()->new ResourceNotFoundException("BlogPost","Id",blogPostDto.getBlogId()));
        BlogPost updateBlogPost=blogPostRepository.save(blogPostDtoToBlogPost(blogPostDto));
        return blogPostToBlogPostDto(updateBlogPost);
    }

    public BlogPostDto getBlogPostById(Integer id){
        Optional<BlogPost> findById = blogPostRepository.findById(id);
        BlogPost blogPost =findById.orElseThrow(()->new ResourceNotFoundException("BlogPost","Id",id));
        return blogPostToBlogPostDto(blogPost);
    }
    











    public BlogPost blogPostDtoToBlogPost(BlogPostDto blogPostDto){
        BlogPost blogPost= new BlogPost();
        blogPost.setBlogId(blogPostDto.getBlogId());
        blogPost.setContent(blogPostDto.getContent());
        blogPost.setTitle(blogPostDto.getTitle());
        blogPost.setDescription(blogPostDto.getDescription());
       // blogPost.setCommentList((List<Comment>) blogPostDto.getCommentList());

        return blogPost;
    }

    public BlogPostDto blogPostToBlogPostDto(BlogPost blogPost){
        BlogPostDto blogPostDto=new BlogPostDto();
        blogPostDto.setBlogId(blogPost.getBlogId());
        blogPostDto.setContent(blogPost.getContent());
        blogPostDto.setTitle(blogPost.getTitle());
        blogPostDto.setDescription(blogPost.getDescription());
      //  blogPostDto.setCommentList((List<Comment>)blogPost.getCommentList());
        return blogPostDto;
    }

}
