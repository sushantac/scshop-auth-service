package com.scshop.security.authservice.config.entity;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserIdentityRepository extends JpaRepository<UserIdentity, UUID>{

	
	UserIdentity findByUsername(String username);
	
	
}
