package com.example.demo.model.mategroup.dto;

import com.example.demo.model.profile.Profile;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class MateGroupDeleteRequestDto {
	
private String userId;
	
	@Builder
	public MateGroupDeleteRequestDto(String userId) {
		this.userId = userId;
	}

}
