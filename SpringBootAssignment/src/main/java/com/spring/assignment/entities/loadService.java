package com.spring.assignment.entities;

import java.util.List;
import java.util.Optional;

import com.spring.assignment.LoadDetails;

public interface loadService {
	
	public void addLoad(LoadDetails loadDetails);
	
	public Optional<LoadDetails> getLoad(String id);
	
	public List<LoadDetails> updateLoad(LoadDetails load);
	
	public void deleteLoad(String id);
}
