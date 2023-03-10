package com.example.demo.model.mategroup.dto;

import java.util.HashSet;
import java.util.Set;

import com.example.demo.model.mategroup.MateGroup;
import com.example.demo.model.profile.Profile;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class MateGroupSaveRequestDto {

//	private Set<Profile> users;
//	
//	@Builder
//	public MateGroupSaveRequestDto(Profile user1, Profile user2) {
//		users = new HashSet<Profile>();
//		users.add(user1);
//		users.add(user2);
//	}
//	
//	public MateGroup toEntity() {
//		MateGroup mategroup = MateGroup.builder().users(users).build();
//		
//		for (Profile user : users) {
//        	user.setMategroup(mategroup);
//        }
//		
//		return mategroup;
//	}

	
	
	public MateGroup toEntity() {
		//return MateGroup.builder().build();
		return new MateGroup();
	}
}
