package com.example.demo.model.expense;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.util.Streamable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.model.profile.Profile;
import com.example.demo.model.profile.ProfileUpdateRequestDto;

@Service
public class ExpenseService {

	@Autowired
	private ExpenseRepository expenserepository;

	public Expense save(Expense expense) {
		
		try{
			expenserepository.save(expense);
			}
		catch (Exception e) {
			System.out.println("에러메세지:"+e.getMessage());
		}
		finally {
			System.out.println("세이브성공");
		}
		return expenserepository.save(expense);
		
	}

	public List<Expense> getAllExpense() {
		List<Expense> expense = new ArrayList<>();
		Streamable.of(expenserepository.findAll()).forEach(expense::add);
		return expense;
	}

//	  @Transactional
//		public String update(String id, ExpenseUpdateRequestDto requestDto) {
//		  Expense expense = expenserepository.findById(id).orElseThrow(() ->
//				new IllegalArgumentException("해당 게시글이 없습니다. id=" + id));
//
//		  expense.update(requestDto.getId(),requestDto.getMoney(),requestDto.getPurpose(),requestDto.getDate(),requestDto.getMemo());
//			return id;
//		}

}
