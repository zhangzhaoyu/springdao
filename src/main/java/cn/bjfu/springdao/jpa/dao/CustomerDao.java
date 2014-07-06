/** 
 * Project Name:springdao 
 * File Name:CustomerRepository.java 
 * Package Name:cn.bjfu.springdao.jpa.repository 
 * Date:2014年6月28日 下午11:49:51 
 * Copyright (c) 2014, zhangzhaoyu0524@163.com All Rights Reserved. 
 * 
*/  
  
package cn.bjfu.springdao.jpa.dao;  

import cn.bjfu.springdao.jpa.domain.Customer;
import cn.bjfu.springdao.jpa.domain.EmailAddress;

/** 
 * ClassName:CustomerRepository <br/> 
 * Function: CustomerRepository. <br/> 
 * Reason:   CustomerRepository. <br/> 
 * Date:     2014年6月28日 下午11:49:51 <br/> 
 * @author   zhangzhaoyu 
 * @version   
 * @since    JDK 1.7 
 * @see       
 */
public interface CustomerDao {
	Customer save(Customer customer);
	Customer findByEmailAddress(EmailAddress emailAddress);
}
 