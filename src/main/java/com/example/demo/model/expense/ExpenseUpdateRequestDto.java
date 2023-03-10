package com.example.demo.model.expense;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class ExpenseUpdateRequestDto {
	

	private String id;
	private int money;
	private String purpose;
	private String date;
	private String memo;
	
	  @Builder
	  public ExpenseUpdateRequestDto(String id, int money, String purpose, String date, String memo) {
		super();
		this.id = id;
		this.money = money;
		this.purpose = purpose;
		this.date = date;
		this.memo = memo;
	}
}
