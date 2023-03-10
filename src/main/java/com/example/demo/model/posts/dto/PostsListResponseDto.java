package com.example.demo.model.posts.dto;

import java.time.LocalDateTime;

import com.example.demo.model.mategroup.MateGroup;
import com.example.demo.model.posts.Posts;

import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class PostsListResponseDto {
	
	private Long id;
	private String content;
	private String author;
	private boolean pin;
	private int gid;
	//private LocalDateTime modifiedDate;
	
	public PostsListResponseDto(Posts entity) {
		this.id = entity.getId();
		this.content = entity.getContent();
		this.author = entity.getAuthor();
		this.pin = entity.isPin();
        this.gid = entity.getGid();
		//this.modifiedDate = entity.getModifiedDate();
        
        System.out.println("postlistRequestDto-mateGroup: " + this.getGid());
	}
	
	

}
