/** 
 * Project Name:springdao 
 * File Name:UserService.java 
 * Package Name:cn.bjfu.springdao.jpa.service.impl 
 * Date:2014年6月26日 下午6:37:55 
 * Copyright (c) 2014, zhangzhaoyu0524@163.com All Rights Reserved. 
 * 
*/  
  
package cn.bjfu.springdao.jpa.service.impl;  

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cn.bjfu.springdao.jpa.dao.UserDao;
import cn.bjfu.springdao.jpa.domain.User;
import cn.bjfu.springdao.jpa.service.IUserService;

/** 
 * ClassName:UserService <br/> 
 * Function: TODO ADD FUNCTION. <br/> 
 * Reason:   TODO ADD REASON. <br/> 
 * Date:     2014年6月26日 下午6:37:55 <br/> 
 * @author   zhangzhaoyu 
 * @version   
 * @since    JDK 1.7 
 * @see       
 */
@Service
public class UserService implements IUserService {

	@Autowired
	private UserDao userDao;
	
	@Override
	@Transactional(readOnly = true)
	public List<User> findAll() {
		return this.userDao.findAll();
	}

}
 