/** 
 * Project Name:springdao 
 * File Name:ProducerConsumerTests.java 
 * Package Name:cn.bjfu.springdao.jms 
 * Date:2014年7月2日 下午3:58:46 
 * Copyright (c) 2014, zhangzhaoyu0524@163.com All Rights Reserved. 
 * 
*/  
  
package cn.bjfu.springdao.jms;  

import javax.jms.Destination;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import cn.bjfu.springdao.jms.service.ProductService;

/** 
 * ClassName:ProducerConsumerTests <br/> 
 * Function: TODO ADD FUNCTION. <br/> 
 * Reason:   TODO ADD REASON. <br/> 
 * Date:     2014年7月2日 下午3:58:46 <br/> 
 * @author   zhangzhaoyu 
 * @version   
 * @since    JDK 1.7 
 * @see       
 */
@RunWith(SpringJUnit4ClassRunner.class) 
@ContextConfiguration("classpath:spring/root-context.xml") 
public class ProducerConsumerTests {
	
	@Autowired
	private ProductService productService;
	@Autowired  
    @Qualifier("queueDestination")
    private Destination destination;
	
	@Test
	public void testSend() {
		for (int i=0; i<2; i++) {  
			productService.sendMessage(destination, "你好，生产者！这是消息：" + (i+1));  
        } 
	}
}
 