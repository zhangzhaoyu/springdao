/** 
 * Project Name:springdao 
 * File Name:UserRepositoryTests.java 
 * Package Name:cn.bjfu.springdao.jpa 
 * Date:2014年6月29日 下午4:39:38 
 * Copyright (c) 2014, zhangzhaoyu0524@163.com All Rights Reserved. 
 * 
*/  
  
package cn.bjfu.springdao.jpa;  

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import cn.bjfu.springdao.jpa.domain.User;
import cn.bjfu.springdao.jpa.repository.UserRepository;

/** 
 * ClassName:UserRepositoryTests <br/> 
 * Function: TODO ADD FUNCTION. <br/> 
 * Reason:   TODO ADD REASON. <br/> 
 * Date:     2014年6月29日 下午4:39:38 <br/> 
 * @author   zhangzhaoyu 
 * @version   
 * @since    JDK 1.7 
 * @see       
 */
@RunWith(SpringJUnit4ClassRunner.class) 
@ContextConfiguration("classpath:spring/root-context.xml") 
public class UserRepositoryTests {

	@Autowired
	UserRepository repository;
	@Test
	public void testfindByNameAndEmail() {
		List<User> list = repository.findByNameAndEmail("zhang", "zhangxxxxx@163.com");
		System.out.println(list);
	}
	
	@Test
	public void testfindDistinctUserByNameOrEmail() {
		List<User> list = repository.findDistinctUserByNameOrEmail("zhang", "zhangxxxxx@163.com");
		System.out.println("-------------------");
		System.out.println(list);
	}
	
	@Test
	public void testfindUserDistinctUserByNameOrEmail() {
		List<User> list = repository.findUserDistinctUserByNameOrEmail("zhang", "zhangxxxxx@163.com");
		System.out.println("-------------------");
		System.out.println(list);
	}
	
	@Test
	public void testfindByNameIgnoreCase() {
		List<User> list = repository.findByNameIgnoreCase("zhang");
		System.out.println("------------------------------------");
		System.out.println(list);
	}
	
	@Test
	public void test() {
		PageRequest pageRequest = new PageRequest(0, 2, new Sort(Direction.DESC, "name", "userId"));
		Page<User> page = this.repository.findByNameLike("%zha%", pageRequest);
		System.out.println("getNumberOfElements : " + page.getNumberOfElements() + "getNumber:" + page.getNumber() + "getTotalElements: " + page.getTotalElements());
		System.out.println(page.getContent());
	}
	
	@Test
	public void testCustomMethod() {
		User user = this.repository.findUserById(1);
		System.out.println("********************************");
		System.out.println(user);
	}
}
 