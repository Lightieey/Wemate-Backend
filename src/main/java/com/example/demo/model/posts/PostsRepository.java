package com.example.demo.model.posts;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostsRepository extends JpaRepository<Posts, Long>{

	//@Query(value = "SELECT * from posts order by posts.id", nativeQuery = true)
	@Query(value = "SELECT * from posts order by posts.pin desc, posts.id", nativeQuery = true)
	List<Posts> findAllDesc();
	
}
