package com.example.demo.model.rule;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class RuleUpdateRequestDto {

	private String content;
	
	@Builder
	public RuleUpdateRequestDto(String content) {
		this.content = content;
	}
}
