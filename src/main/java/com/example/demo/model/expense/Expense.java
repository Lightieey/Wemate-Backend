package com.example.demo.model.expense;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.Columns;

import com.example.demo.model.mategroup.MateGroup;

import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
@Entity 
public class Expense {
  @Id 
  @Column(name="expense_id")
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private int id;
  private String uid;
  private int money;
  private String purpose;
  private String date;
  private String memo;
  
  
 
  @Override
  public String toString() {
    return "Expense{" +
        "id=" + id +
        ", money=" + money +
        ", purpose=" + purpose +
        ", date=" + date +
        ", memo=" + memo +
         "}";
  }
  
//  public void update(String id, int money, String purpose,String date, String memo) {
//	  this.id = id;
//	  this.money = money;
//	  this.purpose = purpose;
//	  this.date = date;
//	  this.memo = memo;
//  }
}