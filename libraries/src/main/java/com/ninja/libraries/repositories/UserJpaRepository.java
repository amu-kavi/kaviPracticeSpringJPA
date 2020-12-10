package com.ninja.libraries.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.ninja.libraries.models.Users;

public interface UserJpaRepository extends JpaRepository<Users,String>{
   
	@Query("Select u from Users u where u.userId = ?1")
	Users findbyUserId(String id);

}
