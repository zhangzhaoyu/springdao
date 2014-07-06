/** 
 * Project Name:springdao 
 * File Name:CustomerRepositoryIntegrationTests.java 
 * Package Name:cn.bjfu.springdao.jpa 
 * Date:2014年6月29日 上午12:11:06 
 * Copyright (c) 2014, zhangzhaoyu0524@163.com All Rights Reserved. 
 * 
*/  
  
package cn.bjfu.springdao.jpa;  

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import cn.bjfu.springdao.jpa.dao.CustomerDao;
import cn.bjfu.springdao.jpa.domain.Customer;
import cn.bjfu.springdao.jpa.domain.EmailAddress;

/** 
 * ClassName:CustomerRepositoryIntegrationTests <br/> 
 * Function: TODO ADD FUNCTION. <br/> 
 * Reason:   TODO ADD REASON. <br/> 
 * Date:     2014年6月29日 上午12:11:06 <br/> 
 * @author   zhangzhaoyu 
 * @version   
 * @since    JDK 1.7 
 * @see       
 */
@RunWith(SpringJUnit4ClassRunner.class) 
@ContextConfiguration("classpath:spring/root-context.xml") 
public class CustomerRepositoryIntegrationTests {

	@Autowired
	CustomerDao repository;
	
	@Test
	public void saveAndFindCustomerByEmailAddress() {
		Customer dave = new Customer("Dave1", "Mattews1");
		dave.setEmailAddress(new EmailAddress("dave@dmband1.com"));
		
		Customer result = repository.save(dave);
		Assert.assertNotNull(result.getId());
		result = repository.findByEmailAddress(new EmailAddress("dave@dmband.com"));
		Assert.assertEquals(dave, result);
	}
	
}
 