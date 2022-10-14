package com.spring.assignment;

import org.springframework.data.jpa.repository.JpaRepository;

public interface LoadDao extends JpaRepository<LoadDetails,String> {

	
}
