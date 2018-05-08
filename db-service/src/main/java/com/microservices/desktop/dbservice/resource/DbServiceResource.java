/**
 * 
 */
package com.microservices.desktop.dbservice.resource;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.microservices.desktop.dbservice.model.UserDetails;
import com.microservices.desktop.dbservice.repository.UserRepository;

/**
 * @author Yashwanth
 *
 */
@RestController
@RequestMapping("/rest/db")
public class DbServiceResource {

	@Autowired
	UserRepository userRepository;
	
	@GetMapping("/{userId}")
	public List<String> getUserDetails(@PathVariable("userId") final String userId){
	System.out.println(" inside of getUserDetails"+userId);
		return userRepository.findByUserId(userId)
				.stream()
				.map(UserDetails::getUserName)
				.collect(Collectors.toList());
	}
	@PostMapping("/add")
	public void addUsers() {
		
	}
}
