/** 
 * Project Name:springdao 
 * File Name:UserDao.java 
 * Package Name:cn.bjfu.springdao.jpa.dao 
 * Date:2014年6月26日 下午6:23:55 
 * Copyright (c) 2014, zhangzhaoyu0524@163.com All Rights Reserved. 
 * 
*/  
  
package cn.bjfu.springdao.jpa.dao;  

import java.util.List;

import cn.bjfu.springdao.jpa.domain.User;

/** 
 * ClassName:UserDao <br/> 
 * Function: TODO ADD FUNCTION. <br/> 
 * Reason:   TODO ADD REASON. <br/> 
 * Date:     2014年6月26日 下午6:23:55 <br/> 
 * @author   zhangzhaoyu 
 * @version   
 * @since    JDK 1.7 
 * @see       
 */
public interface UserDao {
	public abstract User findByName(String name);
	public abstract List<User> findAll();
	public abstract void saveOrUpdate(User user);
}
 