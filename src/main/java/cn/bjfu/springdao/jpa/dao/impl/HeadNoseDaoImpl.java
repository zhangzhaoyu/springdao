/** 
 * Project Name:springdao 
 * File Name:HeadNoseDaoImpl.java 
 * Package Name:cn.bjfu.springdao.jpa.dao.impl 
 * Date:2014年7月4日 上午10:12:44 
 * Copyright (c) 2014, zhangzhaoyu0524@163.com All Rights Reserved. 
 * 
*/  
  
package cn.bjfu.springdao.jpa.dao.impl;  

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import cn.bjfu.springdao.jpa.dao.IHeadNoseDao;
import cn.bjfu.springdao.jpa.domain.execise.Head;
import cn.bjfu.springdao.jpa.domain.execise.Nose;

/** 
 * ClassName:HeadNoseDaoImpl <br/> 
 * Function: TODO ADD FUNCTION. <br/> 
 * Reason:   TODO ADD REASON. <br/> 
 * Date:     2014年7月4日 上午10:12:44 <br/> 
 * @author   zhangzhaoyu 
 * @version   
 * @since    JDK 1.7 
 * @see       
 */
@Repository
public class HeadNoseDaoImpl implements IHeadNoseDao {

	@PersistenceContext
	private EntityManager em;
	
	@Override
	public void save(Head head) {
		this.em.persist(head);
	}

	@Override
	public Head findHeadById(int id) {
		return this.em.find(Head.class, id);
	}

	@Override
	public Nose findNoseById(int id) {
		return this.em.find(Nose.class, id);
	}

	@Override
	public List<Head> findAll() {
		return this.em.createQuery("select h from Head h", Head.class).getResultList();
	}

	@Override
	public void save(Nose nose) {
		this.em.persist(nose);
	}

}
 