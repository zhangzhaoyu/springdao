/** 
 * Project Name:springdao 
 * File Name:AddressDaoImplTests.java 
 * Package Name:cn.bjfu.springdao.jpa.execise 
 * Date:2014年7月3日 下午4:29:53 
 * Copyright (c) 2014, zhangzhaoyu0524@163.com All Rights Reserved. 
 * 
*/  
  
package cn.bjfu.springdao.jpa.execise;  

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import cn.bjfu.springdao.jpa.dao.IAddressDao;
import cn.bjfu.springdao.jpa.domain.execise.AddressTwo;

/** 
 * ClassName:AddressDaoImplTests <br/> 
 * Function: TODO ADD FUNCTION. <br/> 
 * Reason:   TODO ADD REASON. <br/> 
 * Date:     2014年7月3日 下午4:29:53 <br/> 
 * @author   zhangzhaoyu 
 * @version   
 * @since    JDK 1.7 
 * @see       
 */
@RunWith(SpringJUnit4ClassRunner.class) 
@ContextConfiguration("classpath:spring/root-context.xml") 
public class AddressDaoImplTests {

	@Autowired
	IAddressDao addressDao;
	
	@Test
	public void test() {
		AddressTwo address = new AddressTwo();
		address.setName("address001");
		this.addressDao.save(address);
	}
}
 