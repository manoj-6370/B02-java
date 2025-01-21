package com.example.demojpa.dtoEntities;

import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
public class CommentDto {
    private String commentmsg;
    private Integer blogPostId;


}
