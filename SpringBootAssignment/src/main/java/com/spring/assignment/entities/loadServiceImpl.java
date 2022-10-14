package com.spring.assignment.entities;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.spring.assignment.LoadDetails;
import com.spring.assignment.LoadDao;

@Service
public class loadServiceImpl implements loadService {
	
	@Autowired
	private LoadDao loadDao;

	@Override
	public void addLoad(LoadDetails loadDetails) {
		loadDao.save(loadDetails);

	}

	@Override
	public Optional<LoadDetails> getLoad(String id) {
		return loadDao.findById(id);
	}

	@Override
	public List<LoadDetails> updateLoad(LoadDetails load) {
		loadDao.save(load);
		return loadDao.findAll();
	}

	@Override
	public void deleteLoad(String id) {
		LoadDetails load=loadDao.getReferenceById(id);
		loadDao.delete(load);
	}
}
