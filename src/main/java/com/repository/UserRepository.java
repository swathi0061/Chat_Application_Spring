package com.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.dto.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

	  @Procedure(name = "RegisterUser")
	  String registerUser(@Param("p_username") String username,
	                     @Param("p_password") String password
	                     );
	  
	  
}
