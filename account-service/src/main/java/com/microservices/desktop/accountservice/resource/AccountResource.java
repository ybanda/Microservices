
/**
 * @author Yashwanth
 *
 */
package com.microservices.desktop.accountservice.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/rest/account")
public class AccountResource{
	
	@Autowired
	RestTemplate restTemplate;
	
	@GetMapping("/{userId}")
	public List<String> getAccount(@PathVariable("userId") final String userId){
		
		List<String> userDetails= restTemplate.getForObject("http://localhost:8333/db-service/rest/db/"+userId,List.class);
		//restTemplate.exchange(requestEntity, responseType)
		return userDetails;
	}
	
}