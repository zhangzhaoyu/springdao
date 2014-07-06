/** 
 * Project Name:springdao 
 * File Name:UserDaoImpl.java 
 * Package Name:cn.bjfu.springdao.jpa.dao.impl 
 * Date:2014年6月26日 下午6:27:22 
 * Copyright (c) 2014, zhangzhaoyu0524@163.com All Rights Reserved. 
 * 
*/  
  
package cn.bjfu.springdao.jpa.dao.impl;  

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

import cn.bjfu.springdao.jpa.dao.UserDao;
import cn.bjfu.springdao.jpa.domain.User;
/** 
 * ClassName:UserDaoImpl <br/> 
 * Function: TODO ADD FUNCTION. <br/> 
 * Reason:   TODO ADD REASON. <br/> 
 * Date:     2014年6月26日 下午6:27:22 <br/> 
 * @author   zhangzhaoyu 
 * @version   
 * @since    JDK 1.7 
 * @see       
 */
@Repository
public class UserDaoImpl implements UserDao {

	@PersistenceContext
	private EntityManager entityManager;
	
	@Override
	public User findByName(String name) {
		TypedQuery<User> query = this.entityManager.createQuery("select u from User u where u.name = :name",
				User.class);
		query.setParameter("name", name);
		return query.getSingleResult();
	}

	@Override
	public List<User> findAll() {
		TypedQuery<User> query = this.entityManager.createQuery("select u from User u", User.class);
		return query.getResultList();
	}

	@Override
	public void saveOrUpdate(User user) {
			this.entityManager.persist(user);
	}
}
 