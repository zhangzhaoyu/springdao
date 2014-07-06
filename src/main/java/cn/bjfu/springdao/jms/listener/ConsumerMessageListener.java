/** 
 * Project Name:springdao 
 * File Name:ConsumerMessageListener.java 
 * Package Name:cn.bjfu.springdao.jms.listener 
 * Date:2014年7月2日 下午3:52:08 
 * Copyright (c) 2014, zhangzhaoyu0524@163.com All Rights Reserved. 
 * 
*/  
  
package cn.bjfu.springdao.jms.listener;  

import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageListener;
import javax.jms.TextMessage;

/** 
 * ClassName:ConsumerMessageListener <br/> 
 * Function: TODO ADD FUNCTION. <br/> 
 * Reason:   TODO ADD REASON. <br/> 
 * Date:     2014年7月2日 下午3:52:08 <br/> 
 * @author   zhangzhaoyu 
 * @version   
 * @since    JDK 1.7 
 * @see       
 */
public class ConsumerMessageListener implements MessageListener {

	@Override
	public void onMessage(Message message) {
		TextMessage textMessage = (TextMessage) message;
		System.out.println("receive a pure text message : ");
		try {
			System.out.println("The message is : " + textMessage.getText());
		} catch (JMSException e) {
			e.printStackTrace();
		}
	}

}
 