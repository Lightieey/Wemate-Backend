package com.example.demo.model.profile;

import com.example.demo.model.posts.dto.PostsUpdateRequestDto;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class ProfileUpdateRequestDto {

	// mategroup 
	private String id;
	private String name;
	private String title;
	private String gender;	// female or male
	private boolean smoke;	// 1 or 0
	private String age;
	private String pet;		// pet-type or "null" 
	private String addr1;		// ��
	private String addr2;		// ��
	private String period;		// 6 or 1 or 2
	private String room_type;	// share or solo
	private String rent_fee;	// monthly or lease	

    @Builder
    public ProfileUpdateRequestDto(String id, String name, String title, String gender, boolean smoke, String age, String pet, String addr1, String addr2,
    		String period, String room_type, String rent_fee) {
    	this.id = id;
    	this.name = name;
  	  	this.title = title;
  	  	this.gender = gender;
  	  	this.smoke = smoke;
  	  	this.age = age;
  	  	this.pet = pet;
  	  	this.addr1 = addr1;
  	  	this.addr2 = addr2;
  	  	this.period = period;
  	  	this.room_type = room_type;
  	  	this.rent_fee = rent_fee;
    }
}
