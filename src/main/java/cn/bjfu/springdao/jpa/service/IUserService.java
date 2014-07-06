/** 
 * Project Name:springdao 
 * File Name:IUserService.java 
 * Package Name:cn.bjfu.springdao.jpa.service 
 * Date:2014年6月26日 下午6:37:13 
 * Copyright (c) 2014, zhangzhaoyu0524@163.com All Rights Reserved. 
 * 
*/  
  
package cn.bjfu.springdao.jpa.service;  

import java.util.List;

import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import cn.bjfu.springdao.jpa.domain.User;

/** 
 * ClassName:IUserService <br/> 
 * Function: TODO ADD FUNCTION. <br/> 
 * Reason:   TODO ADD REASON. <br/> 
 * Date:     2014年6月26日 下午6:37:13 <br/> 
 * @author   zhangzhaoyu 
 * @version   
 * @since    JDK 1.7 
 * @see       
 */
@Transactional(propagation = Propagation.REQUIRED, readOnly = false)
public interface IUserService {
	public List<User> findAll();
}
 