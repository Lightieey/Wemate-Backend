package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo.model.profile.Profile;
import com.example.demo.model.profile.ProfileService;

import java.util.List;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
//@TestInstance(Lifecycle.PER_CLASS)
class IpsApplicationTests {

	@Autowired
	  private ProfileService profileDao;

//	  @BeforeAll
//	  public void clear() {
//	    List<Employee> employees = employeeDao.getAllEmployees();
//	    for (Employee employee : employees) {
//	      employeeDao.delete(employee.getId());
//	    }
//	  }
		/*
		 * @Test void addProfile(String name, String location, String branch) { Profile
		 * profile = new Profile(); profile.setName(name); profileDao.save(profile); }
		 * 
		 * @Test void addProfileTest() { addProfile("Bruce Wayne", "Building-X",
		 * "Security"); addProfile("Harvey Dent", "Building-2", "Police");
		 * addProfile("Rachel", "Building-11", "IT"); }
		 */
	

}
