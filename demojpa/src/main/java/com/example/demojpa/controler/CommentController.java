package com.example.demojpa.controler;

import com.example.demojpa.dtoEntities.CommentDto;
import com.example.demojpa.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CommentController {
    @Autowired
    CommentService commentService;

    @PostMapping("/post")
    public ResponseEntity<CommentDto> postComment(@RequestBody CommentDto commentDto){
        CommentDto commentDto1=  commentService.postComment(commentDto);
        return new ResponseEntity<CommentDto>(commentDto1, HttpStatus.CREATED);

    }
    @GetMapping("/comment/get/{id1}")
    public ResponseEntity<List<CommentDto>> getCommentByBlogId(@PathVariable Integer id1){
        List<CommentDto> commentDtoList=commentService.getCommentByBlogId(id1);
        return  new ResponseEntity<List<CommentDto>>(commentDtoList,HttpStatus.OK);
    }


}
