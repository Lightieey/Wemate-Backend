package com.example.demo.model.mategroup.dto;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import com.example.demo.model.mategroup.MateGroup;
import com.example.demo.model.profile.Profile;

import lombok.Getter;

@Getter
public class MateGroupResponseDto {

	private int gid;
	private List<Profile> users;
	
	public MateGroupResponseDto(MateGroup entity) {
		this.gid = entity.getGid();
		this.users = entity.getUsers();
	}
	
	
}
