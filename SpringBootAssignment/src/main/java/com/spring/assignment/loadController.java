package com.spring.assignment;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.spring.assignment.entities.loadService;


@RestController
public class loadController {

	@Autowired
	public loadService service;
	
	@PostMapping("/load")
	public String addCourse(@RequestBody LoadDetails loadDetails) {	
		
		try {
			this.service.addLoad(loadDetails);
			return "loads details added successfully";
		}catch (Exception e) {
			return "INTERNAL_SERVER_ERROR";
		}
	}
	
	@GetMapping("/load")
	public Optional<LoadDetails> findCourse(@RequestParam String shipperId) {	
		return this.service.getLoad(shipperId);			
	}
	
	@GetMapping("/load/{shipperId}")
	public Optional<LoadDetails> getLaod(@PathVariable String shipperId) {
		return this.service.getLoad(shipperId);
	}
	
	@PutMapping("/load/{shipperId}")
    public List<LoadDetails> updateLoad(@RequestBody LoadDetails load,@PathVariable String shipperId) {
		load.setShipperId(shipperId);
		return this.service.updateLoad(load);
	}
	
	@DeleteMapping("/load/{shipperId}")
	public String deleteLoad(@PathVariable String shipperId) {
		try {
		this.service.deleteLoad(shipperId);
		return "loads Details Deleted";
		}catch(Exception e) {
			return "Error while Deleting";
		}
	}
}
