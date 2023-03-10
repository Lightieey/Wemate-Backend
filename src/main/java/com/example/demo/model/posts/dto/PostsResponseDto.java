package com.example.demo.model.posts.dto;

import com.example.demo.model.mategroup.MateGroup;
import com.example.demo.model.posts.Posts;

import lombok.Getter;

@Getter
public class PostsResponseDto {

    private Long id;
    private String content;
    private String author;
    private boolean pin;
    private int gid;

    public PostsResponseDto(Posts entity) {
        this.id = entity.getId();
        this.content = entity.getContent();
        this.author = entity.getAuthor();
        this.pin = entity.isPin();
        this.gid = entity.getGid();
    }
}