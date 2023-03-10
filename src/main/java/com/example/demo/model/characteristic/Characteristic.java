package com.example.demo.model.characteristic;

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
public class Characteristic {
  @Id 
  @Column(name="id")
  private String id;
  private String relation;
  private String rest_style;
  private String life_style;
  private String share;
  private String shower;
  private String clean;
  private String guest;
  
 
  @Override
  public String toString() {
    return "Characteristic{" +
        "id=" + id +
     	", relation=" + relation +
	    ", rest_style=" + rest_style +
	    ", life_style=" + life_style +
	    ", share=" + share +
	    ", shower=" + shower +
	    ", shower=" + clean +
	    ", shower=" + guest +
         "}";
  }
  
  public void update(String id, String relation, String rest_style, String life_style, String share, String shower, String clean, String guest) {
	  this.id = id;
	  this.relation = relation;
	  this.rest_style = rest_style;
	  this.life_style = life_style;
	  this.share = share;
	  this.shower = shower;
	  this.clean = clean;
	  this.guest = guest;
  }
  
//  public void update(String id, int money, String purpose,String date, String memo) {
//	  this.id = id;
//	  this.money = money;
//	  this.purpose = purpose;
//	  this.date = date;
//	  this.memo = memo;
//  }
}