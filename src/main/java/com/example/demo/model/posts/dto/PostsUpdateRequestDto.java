package com.example.demo.model.posts.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class PostsUpdateRequestDto {

    private String content;
    private boolean pin;

    @Builder
    public PostsUpdateRequestDto(String content, boolean pin) {
        this.content = content;
        this.pin = pin;
    }
}