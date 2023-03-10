package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.expense.Expense;
import com.example.demo.model.expense.ExpenseService;
import com.example.demo.model.expense.ExpenseUpdateRequestDto;
import com.example.demo.model.profile.ProfileUpdateRequestDto;

@RestController
public class ExpenseController {

	@Autowired
	private ExpenseService expenseDao;

	@GetMapping("/expense/get-all")
	public List<Expense> getAllExpense() {
		return expenseDao.getAllExpense();
	}
	
//	@PutMapping("/expense/{id}")
//    public String update(@PathVariable String id, @RequestBody ExpenseUpdateRequestDto requestDto) {
//        return expenseDao.update(id, requestDto);
//    }

	@PostMapping("/expense/save")
	public  Expense save(@RequestBody  Expense expense) {
		System.out.println("데이터들어옴");
		return expenseDao.save(expense);
	}

}