/** 
 * Project Name:springdao 
 * File Name:JpaTest.java 
 * Package Name:cn.bjfu.springdao.jpa 
 * Date:2014年6月27日 上午10:30:50 
 * Copyright (c) 2014, zhangzhaoyu0524@163.com All Rights Reserved. 
 * 
*/  
  
package cn.bjfu.springdao.jpa;  

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import cn.bjfu.springdao.jpa.domain.Document;
import cn.bjfu.springdao.jpa.service.IDocumentService;
import cn.bjfu.springdao.utils.Pagination;
/** 
 * ClassName:JpaTest <br/> 
 * Function: TODO ADD FUNCTION. <br/> 
 * Reason:   TODO ADD REASON. <br/> 
 * Date:     2014年6月27日 上午10:30:50 <br/> 
 * @author   zhangzhaoyu 
 * @version   
 * @since    JDK 1.7 
 * @see       
 */
@RunWith(SpringJUnit4ClassRunner.class) 
@ContextConfiguration("classpath:spring/root-context.xml") 
public class JpaTest  extends AbstractJUnit4SpringContextTests {
	@Autowired
	IDocumentService documentService;
	
	@Test
	public void test() {
		Pagination<Document> pagination = new Pagination<Document>();
		Page<Document> page = documentService.findListWithPage(pagination);
		List<Document> docList = page.getContent();
		
		for (Document doc : docList) {
			System.out.println(doc);
		}
	}
}
 