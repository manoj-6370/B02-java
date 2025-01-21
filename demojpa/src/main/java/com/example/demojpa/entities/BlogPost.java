package com.example.demojpa.entities;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@NoArgsConstructor
@Data
public class BlogPost {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer blogId;
    private String content;
    private String title;
    private String description;
    @OneToMany(mappedBy = "blogPost",cascade = CascadeType.ALL,fetch = FetchType.EAGER)
    private List<Comment> commentList;


}
