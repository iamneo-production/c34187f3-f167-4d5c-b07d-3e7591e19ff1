package com.iamneo.security.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.iamneo.security.entity.Model;
import com.iamneo.security.entity.User;
import com.iamneo.security.repository.Demorep;

import com.iamneo.security.repository.UserRepository;
//import com.iamneo.security.service.RequestParam;
import com.iamneo.security.service.Services;

import lombok.RequiredArgsConstructor;

@CrossOrigin(origins = "*" ,allowedHeaders = "*")
@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/demo")
public class DemoController {
	
	@Autowired
	Demorep repo;
	
	@Autowired
	UserRepository repouser;
	
	@Autowired
	Services service;
    
	@GetMapping
	public List<Model> Get()
	{																																															
		return repo.findAll(); 
	}
	
    @PostMapping("/post")
	public Model createTodo(@RequestBody Model reg) 
	{
	     return repo.save(reg);
	}
   
    @GetMapping("/get/{id}")
    public Optional<Model> getname(@PathVariable String id)
    {
    		return repo.findById(id);
    	
    }
    
    @PutMapping("/{id}")
    public ResponseEntity<String> updateResource(@PathVariable Long id, @RequestBody String data) {
        // Code to update the resource with the provided 'data' using the 'id'
        // Return an appropriate response, e.g., a success message or the updated resource
        return ResponseEntity.ok("Resource with ID " + id + " updated successfully.");
    }
    
    @PutMapping("renew/{id}/{amnt}")
    public ResponseEntity<Model> updateDataAmount(@PathVariable String id, @PathVariable double amnt) {
       Model updatedData = service.updateDataAmount(id, amnt);
        return ResponseEntity.ok(updatedData);
    }
    
    @PutMapping("claim/{id}/{amnt}")
    public ResponseEntity<Model> claimAmount(@PathVariable String id, @PathVariable double amnt) {
       Model updatedData = service.ClaimAmount(id, amnt);
        return ResponseEntity.ok(updatedData);
    }
}
