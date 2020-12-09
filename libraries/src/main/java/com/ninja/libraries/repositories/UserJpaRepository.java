package com.ninja.libraries.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ninja.libraries.models.Users;

public interface UserJpaRepository extends JpaRepository<Users,String>{

	//Users findbyUserId(String id);

}
