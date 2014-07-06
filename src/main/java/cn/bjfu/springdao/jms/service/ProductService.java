/** 
 * Project Name:springdao 
 * File Name:ProductService.java 
 * Package Name:cn.bjfu.springdao.jms.service 
 * Date:2014年7月2日 下午3:42:51 
 * Copyright (c) 2014, zhangzhaoyu0524@163.com All Rights Reserved. 
 * 
*/  
  
package cn.bjfu.springdao.jms.service;  

import javax.jms.Destination;

/** 
 * ClassName:ProductService <br/> 
 * Function: TODO ADD FUNCTION. <br/> 
 * Reason:   TODO ADD REASON. <br/> 
 * Date:     2014年7月2日 下午3:42:51 <br/> 
 * @author   zhangzhaoyu 
 * @version   
 * @since    JDK 1.7 
 * @see       
 */
public interface ProductService {
	public void sendMessage(Destination destination, final String message);
}
 