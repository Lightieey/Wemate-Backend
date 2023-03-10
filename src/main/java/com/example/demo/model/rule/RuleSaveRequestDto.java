package com.example.demo.model.rule;

import com.example.demo.model.mategroup.MateGroup;
import com.example.demo.model.mategroup.MateGroupService;
import com.example.demo.model.posts.Posts;
import com.example.demo.model.profile.ProfileService;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class RuleSaveRequestDto {

	private String content;
	private int groupID;
	
	@Builder
	public RuleSaveRequestDto(String content, int groupID) {
		this.content = content;
		this.groupID = groupID;
	}
	
//	public Rule toEntity() {
//        return Rule.builder().content(content).mateGroup(mateGroup).build();
//    }
	
}
