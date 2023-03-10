package com.example.demo.model.profile;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.util.Streamable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.model.posts.Posts;
import com.example.demo.model.posts.dto.PostsListResponseDto;
import com.example.demo.model.posts.dto.PostsResponseDto;
import com.example.demo.model.posts.dto.PostsUpdateRequestDto;

@Service 
public class ProfileService {

	@Autowired
	private ProfileRepository repository;

	public Profile save(Profile profile) {
		return repository.save(profile);
	}

	public List<Profile> getAllProfile() {
		List<Profile> profile = new ArrayList<>();
		Streamable.of(repository.findAll()).forEach(profile::add);
		return profile;
	}

  @Transactional
	public String update(String id, ProfileUpdateRequestDto requestDto) {
		Profile profile = repository.findById(id).orElseThrow(() ->
			new IllegalArgumentException("�ش� �Խñ��� �����ϴ�. id=" + id));

		profile.update(requestDto.getId(), requestDto.getName(), requestDto.getTitle(), requestDto.getGender(), requestDto.isSmoke(),
				requestDto.getAge(), requestDto.getPet(), requestDto.getAddr1(), requestDto.getAddr2(),
				requestDto.getPeriod(), requestDto.getRoom_type(), requestDto.getRent_fee());

		return id;
	}
  
  public void delete(String profileId) {
    repository.deleteById(profileId);
  }
  
  public Profile findById(String id) {
	  Profile entity = repository.findById(id).orElseThrow(()
				-> new IllegalArgumentException("해당 사용자가 없습니다. id=" + id));

		return entity;
	}
  

  
  	@Transactional
	public List<ProfileListResponseDto> findByGid(int gid) {
		return repository.findByGid(gid).stream()
				.map(profile -> new ProfileListResponseDto(profile))	// posts list
				.collect(Collectors.toList());
	}
}