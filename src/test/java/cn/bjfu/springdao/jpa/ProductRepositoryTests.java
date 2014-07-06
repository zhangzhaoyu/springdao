/** 
 * Project Name:springdao 
 * File Name:ProductRepositoryTests.java 
 * Package Name:cn.bjfu.springdao.jpa 
 * Date:2014年6月29日 上午12:43:33 
 * Copyright (c) 2014, zhangzhaoyu0524@163.com All Rights Reserved. 
 * 
*/  
  
package cn.bjfu.springdao.jpa;  

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import cn.bjfu.springdao.jpa.domain.Product;
import cn.bjfu.springdao.jpa.repository.ProductRepository;

/** 
 * ClassName:ProductRepositoryTests <br/> 
 * Function: TODO ADD FUNCTION. <br/> 
 * Reason:   TODO ADD REASON. <br/> 
 * Date:     2014年6月29日 上午12:43:33 <br/> 
 * @author   zhangzhaoyu 
 * @version   
 * @since    JDK 1.7 
 * @see       
 */
@RunWith(SpringJUnit4ClassRunner.class) 
@ContextConfiguration("classpath:spring/root-context.xml") 
public class ProductRepositoryTests {
	
	@Autowired
	ProductRepository repository;
	
	@Test
	public void lookupProductByDescription() {
		Pageable pageable = new PageRequest(0, 1, Direction.DESC, "name");
		Page<Product> page = repository.findByDescriptionContaining("Apple", pageable);
	}
}
 