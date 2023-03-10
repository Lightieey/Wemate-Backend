package com.example.demo.controller;

import org.springframework.web.bind.annotation.*;

import com.example.demo.model.mategroup.MateGroupService;
import com.example.demo.model.mategroup.dto.MateGroupResponseDto;
import com.example.demo.model.mategroup.dto.MateGroupSaveRequestDto;
import com.example.demo.model.mategroup.dto.MateGroupAddRequestDto;
import com.example.demo.model.mategroup.dto.MateGroupDeleteRequestDto;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@RestController
public class MateGroupController {
	
	private final MateGroupService mateGroupService;
	
	@PostMapping("/mateGroup")
	public int save(@RequestBody MateGroupSaveRequestDto requestDto) {
		return mateGroupService.save(requestDto);
	}
	
	@PutMapping("/mateGroup/add/{id}")
	public int addMate(@PathVariable int id, @RequestBody MateGroupAddRequestDto requestDto) {
		return mateGroupService.addMate(id, requestDto);
	}
	
	@PutMapping("/mateGroup/delete/{id}")
	public int deleteMate(@PathVariable int id, @RequestBody MateGroupDeleteRequestDto requestDto) {
		return mateGroupService.deleteMate(id, requestDto);
	}
	
	@GetMapping("/mateGroup/{id}")
	public MateGroupResponseDto findById(@PathVariable int id) {
		return mateGroupService.findById(id);
	}

}
