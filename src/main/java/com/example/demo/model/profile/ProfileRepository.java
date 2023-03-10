package com.example.demo.model.profile;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.posts.Posts;

// DB�� CRUD �ϴ� �κ�
@Repository
public interface ProfileRepository extends CrudRepository<Profile, String> { 
	
	@Query(value = "SELECT * from profile where gid = ?1", nativeQuery = true)
	List<Profile> findByGid(int gid);
	
	// 나중에 (지역)
	@Query(value = "SELECT * from profile where gid = ?1", nativeQuery = true)
	List<Profile> selectArea(int gid);
	
	@Query(value = "SELECT * from profile where rent_fee = ?1", nativeQuery = true)
	List<Profile> selectRent(String rent);
	
	@Query(value = "SELECT * from profile where gender = ?1", nativeQuery = true)
	List<Profile> selectGender(String gender);
	
	@Query(value = "SELECT * from profile where period = ?1", nativeQuery = true)
	List<Profile> selectPeriod(String period);
	
	@Query(value = "SELECT * from profile where room_type = ?1", nativeQuery = true)
	List<Profile> selectRoom(String type);
	
	@Query(value = "SELECT * from profile where age = ?1", nativeQuery = true)
	List<Profile> selectAge(String age);

}