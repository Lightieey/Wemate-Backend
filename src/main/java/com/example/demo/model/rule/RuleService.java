package com.example.demo.model.rule;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.model.mategroup.MateGroup;
import com.example.demo.model.mategroup.MateGroupRepository;
import com.example.demo.model.mategroup.dto.MateGroupAddRequestDto;
import com.example.demo.model.mategroup.dto.MateGroupSaveRequestDto;
import com.example.demo.model.posts.Posts;
import com.example.demo.model.posts.dto.PostsResponseDto;
import com.example.demo.model.profile.Profile;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service
public class RuleService {
	
	private final RuleRepository ruleRepository;
	private final MateGroupRepository mateGroupRepository;
	
	@Transactional
	public int save(RuleSaveRequestDto requestDto) {
		MateGroup mateGroup = mateGroupRepository.findById(requestDto.getGroupID()).orElseThrow(() ->
			new IllegalArgumentException("�ش� �׷��� �����ϴ�. gid=" + requestDto.getGroupID()));
		
		Rule rule = Rule.builder().content(requestDto.getContent()).mateGroup(mateGroup).build();
		
		return ruleRepository.save(rule).getRid();
	}
	
	@Transactional
	public int update(int id, RuleUpdateRequestDto requestDto) {
		Rule rule = ruleRepository.findById(id).orElseThrow(() ->
			new IllegalArgumentException("�ش� ��Ģ�� �����ϴ�. rid=" + id));
		
		rule.update(requestDto.getContent());
		
		return id;
	}
	
	public RuleResponseDto findById(int id) {
		Rule entity = ruleRepository.findById(id).orElseThrow(()
				-> new IllegalArgumentException("�ش� �Խñ��� �����ϴ�. id=" + id));

		return new RuleResponseDto(entity);
	}

}
