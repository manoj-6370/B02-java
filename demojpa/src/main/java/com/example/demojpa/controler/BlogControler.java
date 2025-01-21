package com.example.demojpa.controler;

import com.example.demojpa.dtoEntities.BlogPostDto;
import com.example.demojpa.service.BlogPostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class BlogControler {
    @Autowired
    BlogPostService blogPostService;

    @PostMapping("/save")
    public ResponseEntity<BlogPostDto> createBlogPost(@RequestBody BlogPostDto blogPostDto){
        BlogPostDto blogPostDto1=blogPostService.createBlogPost(blogPostDto);

         return new ResponseEntity<BlogPostDto>(blogPostDto1, HttpStatus.CREATED);
    }



    @GetMapping("/get")
    public ResponseEntity<List<BlogPostDto>> getAllBlogPost( @RequestParam(value="pageNo",defaultValue = "0",required = false) Integer pageNo
            , @RequestParam(value = "pageSize",defaultValue = "5",required = false) Integer pageSize
             , @RequestParam(value = "sortBy",defaultValue = "blogId",required = false)String sortBy
                ,@RequestParam(value = "sortDir",defaultValue = "ASC",required = false) String sortDir){


        Sort sort=sortDir.equalsIgnoreCase(Sort.Direction.ASC.name())? Sort.by(sortBy).descending()
                                                                      : Sort.by(sortBy).ascending();
        Pageable page= PageRequest.of(pageNo,pageSize, sort);
        List<BlogPostDto> blogPostDtoList=blogPostService.getAllBlogPost(page);
        return new ResponseEntity<List<BlogPostDto>>(blogPostDtoList,HttpStatus.OK);
    }





    @PutMapping("/update")
    public ResponseEntity<BlogPostDto> updateBlogPost(@RequestBody BlogPostDto blogPostDto){
        BlogPostDto updateBlogPostDto=blogPostService.updateBlogPost( blogPostDto);
        return  new ResponseEntity<BlogPostDto>(updateBlogPostDto,HttpStatus.OK);
    }

    @GetMapping("/getById/{id}")
    public ResponseEntity<BlogPostDto> getBlogPostById(@PathVariable Integer id){
        BlogPostDto blogPostDto=blogPostService.getBlogPostById(id);
        return new ResponseEntity<BlogPostDto>(blogPostDto,HttpStatus.OK);
    }

}
