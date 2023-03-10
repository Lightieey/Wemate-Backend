package com.example.demo.model.mategroup.dto;

import java.util.Set;

import com.example.demo.model.profile.Profile;
import com.example.demo.model.profile.ProfileRepository;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class MateGroupAddRequestDto {

//	private Profile user;
//	
//	@Builder
//	public MateGroupAddRequestDto(Profile user) {
//		this.user = user;
//	}
	
	private String userId;
	
	@Builder
	public MateGroupAddRequestDto(String userId) {
		this.userId = userId;
	}
//	
//	private ProfileRepository repository;
//	
//	public Profile getProfile() {
//		Profile profile = repository.findById(userId).orElseThrow(() ->
//		new IllegalArgumentException("해당 게시글이 없습니다. id=" + userId));
//		
//		return profile;
//	}
}
