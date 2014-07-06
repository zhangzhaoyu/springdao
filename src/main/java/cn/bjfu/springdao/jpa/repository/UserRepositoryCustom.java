/** 
 * Project Name:springdao 
 * File Name:UserRepositoryCustom.java 
 * Package Name:cn.bjfu.springdao.jpa.repository 
 * Date:2014年6月29日 下午5:39:40 
 * Copyright (c) 2014, zhangzhaoyu0524@163.com All Rights Reserved. 
 * 
*/  
  
package cn.bjfu.springdao.jpa.repository;  

import org.springframework.data.repository.NoRepositoryBean;

import cn.bjfu.springdao.jpa.domain.User;

/** 
 * ClassName:UserRepositoryCustom <br/> 
 * Function: TODO ADD FUNCTION. <br/> 
 * Reason:   TODO ADD REASON. <br/> 
 * Date:     2014年6月29日 下午5:39:40 <br/> 
 * @author   zhangzhaoyu 
 * @version   
 * @since    JDK 1.7 
 * @see       
 */
public interface UserRepositoryCustom {
	public abstract User findUserById(Integer id);
}
 