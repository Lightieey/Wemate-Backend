package com.example.demo.model.posts.dto;

import com.example.demo.model.mategroup.MateGroup;
import com.example.demo.model.posts.Posts;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class PostsSaveRequestDto {

	private String content;
    private String author;
    private boolean pin;
    //private MateGroup mateGroup;
    private int gid;

    @Builder
    public PostsSaveRequestDto(String content, String author, boolean pin, int gid) {
        this.content = content;
        this.author = author;
        this.pin = pin;
        this.gid = gid;
    }

    public Posts toEntity() {
        return Posts.builder().content(content).author(author).pin(pin).gid(gid).build();
    }
}
