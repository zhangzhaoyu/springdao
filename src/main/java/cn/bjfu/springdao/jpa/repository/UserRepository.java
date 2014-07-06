/** 
 * Project Name:springdao 
 * File Name:UserRepository.java 
 * Package Name:cn.bjfu.springdao.jpa.repository 
 * Date:2014年6月29日 下午4:34:58 
 * Copyright (c) 2014, zhangzhaoyu0524@163.com All Rights Reserved. 
 * 
*/  
  
package cn.bjfu.springdao.jpa.repository;  

import java.util.List;

import javax.persistence.LockModeType;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.Lock;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.Repository;

import cn.bjfu.springdao.jpa.domain.User;

/** 
 * ClassName:UserRepository <br/> 
 * Function: TODO ADD FUNCTION. <br/> 
 * Reason:   TODO ADD REASON. <br/> 
 * Date:     2014年6月29日 下午4:34:58 <br/> 
 * @author   zhangzhaoyu 
 * @version   
 * @since    JDK 1.7 
 * @see       
 */
public interface UserRepository extends Repository<User, Integer>, UserRepositoryCustom {
	List<User> findByNameAndEmail(String name, String email);
	
	// Enable the distinct flag for the query
	List<User> findDistinctUserByNameOrEmail(String name, String email);
	List<User> findUserDistinctUserByNameOrEmail(String name, String email);
	
	//  Enabling ignoring case for an individual property
	List<User> findByNameIgnoreCase(String name);
	// Enabling static ORDER BY for a query
	List<User> findByNameAndEmailAllIgnoreCase(String name, String email);
	
	// Enabling static ORDER BY for a query
	@Lock(LockModeType.READ)
	List<User> findByNameOrderByUserIdAsc(String name);
	List<User> findByNameOrderByUserIdDesc(String name);
	
	
	Page<User> findByNameLike(String name, Pageable pageable);
	List<User> findByNameLike(String name, Sort sort);
	
	// User @Query
	@Query("select u from User u where u.email = ?1")
	User findByEmail(String email);
	@Query("select u from User u where u.name like %?1")
	List<User> findByNameEndsWith(String name);
	
	//User @Query to execute Navtie Query
	@Query(value = "select * from user where email = ?0", nativeQuery = true)
	User findByEmailAddress(String email);
	
	// Modify 
	@Modifying(clearAutomatically = true)
	@Query("update User u set u.name = ?1 where u.id = ?2")
	int setFixedNameFor(String name, Integer id);
}
 