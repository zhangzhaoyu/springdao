/** 
 * Project Name:springdao 
 * File Name:ProductServiceImpl.java 
 * Package Name:cn.bjfu.springdao.jms.service.impl 
 * Date:2014年7月2日 下午3:45:14 
 * Copyright (c) 2014, zhangzhaoyu0524@163.com All Rights Reserved. 
 * 
*/  
  
package cn.bjfu.springdao.jms.service.impl;  

import javax.jms.Destination;
import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.Session;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.jms.core.MessageCreator;
import org.springframework.stereotype.Service;

import cn.bjfu.springdao.jms.service.ProductService;

/** 
 * ClassName:ProductServiceImpl <br/> 
 * Function: TODO ADD FUNCTION. <br/> 
 * Reason:   TODO ADD REASON. <br/> 
 * Date:     2014年7月2日 下午3:45:14 <br/> 
 * @author   zhangzhaoyu 
 * @version   
 * @since    JDK 1.7 
 * @see       
 */
@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
	private JmsTemplate jmsTemplate;
	
	@Override
	public void sendMessage(Destination destination, final String message) {
		System.out.println("producter send message......");
		System.out.println("message : " + message);
		
		this.jmsTemplate.send(destination, new MessageCreator() {
			@Override
			public Message createMessage(Session session) throws JMSException {
				return session.createTextMessage(message);
			}
		});
	}

	
}
 