package com.example.demo.model.profile;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import org.hibernate.annotations.Columns;

import com.example.demo.model.mategroup.MateGroup;

import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
@Entity //��ƼƼ ����
public class Profile {
  @Id //�����̸Ӹ� Ű ����
  @Column(name="user_id")
  private String id;
  private String name;
  private String title;
  private String gender;	// female or male
  private boolean smoke;	// 1 or 0
  private String age;
  private String pet;		// pet-type or "null" 
  private String addr1;		// 시
  private String addr2;		// 도
  private String period;		// 6 or 1 or 2
  private String room_type;	// share or solo
  private String rent_fee;	// monthly or lease	
  
  //(cascade = {CascadeType.DETACH, CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH})
  @ManyToOne
  @JoinColumn(name="gid")
  private MateGroup mategroup;		// room-mate group id
 
  @Override
  public String toString() {
    return "Profile{" +
        "id=" + id +
        ", name=" + name +
        ", title=" + title +
        ", gender=" + gender +
        ", smoke=" + smoke +
        ", age=" + age +
        ", pet=" + pet +
        ", addr1=" + addr1 +
        ", addr2=" + addr2 +
        ", period=" + period +
        ", room_type=" + room_type +
        ", rent_fee=" + rent_fee +
        ", mategroup=" + mategroup.getGid() + "}";
  }
  
  public void update(String id, String name, String title, String gender, boolean smoke, String age, String pet, String addr1, String addr2,
		  String period, String room_type, String rent_fee) {
	  this.id = id;
	  this.name = name;
	  this.title = title;
	  this.gender = gender;
	  this.smoke = smoke;
	  this.age = age;
	  this.pet = pet;
	  this.addr1 = addr1;
	  this.addr2 = addr2;
	  this.period = period;
	  this.room_type = room_type;
	  this.rent_fee = rent_fee;
  }
}