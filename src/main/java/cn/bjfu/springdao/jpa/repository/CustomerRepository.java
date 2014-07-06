/** 
 * Project Name:springdao 
 * File Name:CustomerRepository.java 
 * Package Name:cn.bjfu.springdao.jpa.repository 
 * Date:2014年6月29日 上午12:23:58 
 * Copyright (c) 2014, zhangzhaoyu0524@163.com All Rights Reserved. 
 * 
*/  
  
package cn.bjfu.springdao.jpa.repository;  

import org.springframework.data.jpa.repository.support.SimpleJpaRepository;
import org.springframework.data.repository.Repository;
import org.springframework.transaction.annotation.Transactional;

import cn.bjfu.springdao.jpa.domain.Customer;
import cn.bjfu.springdao.jpa.domain.EmailAddress;

/** 
 * ClassName:CustomerRepository <br/> 
 * Function: TODO ADD FUNCTION. <br/> 
 * Reason:   TODO ADD REASON. <br/> 
 * Date:     2014年6月29日 上午12:23:58 <br/> 
 * @author   zhangzhaoyu 
 * @version   
 * @since    JDK 1.7 
 * @see       
 */
public interface CustomerRepository extends Repository<Customer, Long> {
	/**
	 * findOne 和 save 方法依靠 SimpleJpaRepository 来实现
	 */
	public abstract Customer findOne(Long id);
	/*
	 * 可以为其重新配置实务
	 */
	@Transactional(timeout = 60)
	public abstract Customer save(Customer customer);
	public abstract Customer findByEmailAddress(EmailAddress emailAddress);
}
 