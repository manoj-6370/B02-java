package com.example.demojpa.entities;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@NoArgsConstructor
@Data
public class Comment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer commentid;
    private String commentmsg;
    @ManyToOne
    @JoinColumn(name="blogId")
    private BlogPost blogPost;
}
