/** 
 * Project Name:springdao 
 * File Name:DocumentRepositoryTests.java 
 * Package Name:cn.bjfu.springdao.jpa 
 * Date:2014年6月29日 下午10:23:01 
 * Copyright (c) 2014, zhangzhaoyu0524@163.com All Rights Reserved. 
 * 
*/  
  
package cn.bjfu.springdao.jpa;  

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import cn.bjfu.springdao.jpa.domain.Document;
import cn.bjfu.springdao.jpa.repository.DocumentRepository;

/** 
 * ClassName:DocumentRepositoryTests <br/> 
 * Function: TODO ADD FUNCTION. <br/> 
 * Reason:   TODO ADD REASON. <br/> 
 * Date:     2014年6月29日 下午10:23:01 <br/> 
 * @author   zhangzhaoyu 
 * @version   
 * @since    JDK 1.7 
 * @see       
 */
@RunWith(SpringJUnit4ClassRunner.class) 
@ContextConfiguration("classpath:spring/root-context.xml") 
public class DocumentRepositoryTests {
	@Autowired
	DocumentRepository repository;
	
	@Test
	public void testfindByDocTypeBetween() {
		System.out.println("-------------");
		try {
			List<Document> list = this.repository.findByDocTypeBetween((byte)1, (byte)10);
			System.out.println(list);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
 