package com.example.demo.model.mategroup;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MateGroupRepository extends JpaRepository<MateGroup, Integer>{
	
	//@Query(value="select id from profile where gid = ")

}
