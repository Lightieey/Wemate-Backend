package com.example.demo.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.posts.Posts;
import com.example.demo.model.posts.PostsService;
import com.example.demo.model.posts.dto.PostsListResponseDto;
import com.example.demo.model.posts.dto.PostsResponseDto;
import com.example.demo.model.posts.dto.PostsUpdateRequestDto;
import com.example.demo.model.profile.Profile;
import com.example.demo.model.profile.ProfileListResponseDto;
import com.example.demo.model.profile.ProfileService;
import com.example.demo.model.profile.ProfileUpdateRequestDto;

@RestController
public class ProfileController {

	@Autowired
	private ProfileService profileDao;

	@GetMapping("/profile/get-all")
	public List<Profile> getAllProfile() {
		return profileDao.getAllProfile();
	}

	@PutMapping("/profile/{id}")
    public String update(@PathVariable String id, @RequestBody ProfileUpdateRequestDto requestDto) {
        return profileDao.update(id, requestDto);
    }
	
	@PostMapping("/profile/save")
	public Profile save(@RequestBody Profile profile) {
		return profileDao.save(profile);
	}
	
	@GetMapping("/profile/{id}")
    public Profile findById(@PathVariable String id) {
        return profileDao.findById(id);
    }
	
	@GetMapping("/profile/gid/{id}")
    public List<ProfileListResponseDto> findByGid(@PathVariable int id) {
        return profileDao.findByGid(id);
    }

}