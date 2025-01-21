package com.example.demojpa.dtoEntities;

import com.example.demojpa.entities.Comment;
import jakarta.persistence.Entity;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;


@NoArgsConstructor
@Data
public class BlogPostDto {
    private Integer blogId;
    private String content;
    private String title;
    private String description;
    private List<CommentDto> commentList;
}
