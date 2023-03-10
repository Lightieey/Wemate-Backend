package com.example.demo.model.rule;

import com.example.demo.model.mategroup.MateGroup;
import com.example.demo.model.posts.Posts;

import lombok.Getter;

@Getter
public class RuleResponseDto {

	private int rid;
	private String content;
	private MateGroup mateGroup;
	
	public RuleResponseDto(Rule entity) {
        this.rid = entity.getRid();
        this.content = entity.getContent();
        this.mateGroup = entity.getMateGroup();
    }
}
