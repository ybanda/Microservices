/**
 * 
 */
package com.microservices.desktop.dbservice.repository;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.microservices.desktop.dbservice.model.UserDetails;

/**
 * @author Yashwanth
 *
 */
@Repository
//@ComponentScan(basePackages="com.microservices.desktop.dbservice")
public interface UserRepository extends JpaRepository<UserDetails, Integer>{

	List<UserDetails> findByUserName(String userName);
	List<UserDetails> findByUserId(String userId);
	
}
