package com.example.demo.model.mategroup;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.model.mategroup.dto.MateGroupResponseDto;
import com.example.demo.model.mategroup.dto.MateGroupSaveRequestDto;
import com.example.demo.model.profile.Profile;
import com.example.demo.model.profile.ProfileService;
import com.example.demo.model.mategroup.dto.MateGroupAddRequestDto;
import com.example.demo.model.mategroup.dto.MateGroupDeleteRequestDto;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service
public class MateGroupService {

	private final MateGroupRepository mateGroupRepository;
	private final ProfileService profileService;
	
	@Transactional
	public int save(MateGroupSaveRequestDto requestDto) {
		return mateGroupRepository.save(requestDto.toEntity()).getGid();
	}
	
	@Transactional
	public int addMate(int id, MateGroupAddRequestDto requestDto) {
		MateGroup mategroup = mateGroupRepository.findById(id).orElseThrow(() ->
			new IllegalArgumentException("�ش� �׷��� �����ϴ�. gid=" + id));
		
		//Profile profile = profileService.findById(requestDto.getUser().getId());
		Profile profile = profileService.findById(requestDto.getUserId());
		
		mategroup.addMate(profile);
		System.out.println("222 + " + mategroup.toString());
		
		return id;
	}
	
	@Transactional
	public int deleteMate(int id, MateGroupDeleteRequestDto requestDto) {
		MateGroup mategroup = mateGroupRepository.findById(id).orElseThrow(() ->
		new IllegalArgumentException("�ش� �׷��� �����ϴ�. gid=" + id));
		
		Profile profile = profileService.findById(requestDto.getUserId());
		
		mategroup.deleteMate(profile);
		return id;
	}
	
	public MateGroupResponseDto findById(int id) {
		MateGroup entity = mateGroupRepository.findById(id).orElseThrow(()
				-> new IllegalArgumentException("�ش� �׷��� �����ϴ�. gid=" + id));
		
		return new MateGroupResponseDto(entity);
	}
	
	@Transactional
	public void delete(int id) {
		MateGroup mategroup = mateGroupRepository.findById(id).orElseThrow(()
				-> new IllegalArgumentException("�ش� �׷��� �����ϴ�. gid=" + id));
		
		
		mateGroupRepository.delete(mategroup);
	}
}
