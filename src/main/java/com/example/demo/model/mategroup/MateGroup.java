package com.example.demo.model.mategroup;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.model.posts.Posts;
import com.example.demo.model.profile.Profile;
import com.example.demo.model.profile.ProfileRepository;
import com.example.demo.model.rule.Rule;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@Entity
public class MateGroup {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int gid;
	
	@OneToMany(mappedBy = "id", targetEntity = Profile.class, orphanRemoval=true)
	private List<Profile> users;
	
	//@PrimaryKeyJoinColumn
	//@OneToOne(cascade=CascadeType.ALL, orphanRemoval = true)
	//@JoinColumn(name="rid")
	//private Rule rule;
	
	@Override
    public String toString() {
        return "MateGroup{" +
                "gid=" + gid +
                ", users=" + users +
                '}';
    }
	
	public void addMate(Profile user) {
		if (users == null) {
			users = new ArrayList<>();
			System.out.println("here");
		}
		
		user.setMategroup(this);
		users.add(user);
		System.out.println(this.toString()); 
	}
	
	public void deleteMate(Profile user) {
		if (users == null) return;
		users.remove(user);
		user.setMategroup(null);
		System.out.println(this.toString());
	}
}
