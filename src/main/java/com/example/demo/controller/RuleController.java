package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.mategroup.dto.MateGroupSaveRequestDto;
import com.example.demo.model.posts.dto.PostsResponseDto;
import com.example.demo.model.posts.dto.PostsUpdateRequestDto;
import com.example.demo.model.rule.RuleResponseDto;
import com.example.demo.model.rule.RuleSaveRequestDto;
import com.example.demo.model.rule.RuleService;
import com.example.demo.model.rule.RuleUpdateRequestDto;
import com.fasterxml.jackson.annotation.JsonAutoDetect;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@RestController
public class RuleController {

	@Autowired
	private final RuleService ruleService;
	
	@PostMapping("/rule")
	public int save(@RequestBody RuleSaveRequestDto requestDto) {
		return ruleService.save(requestDto);
	}
	
	
	@PutMapping("/rule/{id}")
	public int update(@PathVariable int id, @RequestBody RuleUpdateRequestDto requestDto) {
		return ruleService.update(id, requestDto);
	}
	
	@GetMapping("/rule/{id}")
    public RuleResponseDto findById(@PathVariable int id) {
        return ruleService.findById(id);
    }
	
}
