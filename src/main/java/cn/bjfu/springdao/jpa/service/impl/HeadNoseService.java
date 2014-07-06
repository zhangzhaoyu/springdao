/** 
 * Project Name:springdao 
 * File Name:HeadNoseService.java 
 * Package Name:cn.bjfu.springdao.jpa.service.impl 
 * Date:2014年7月4日 上午10:17:52 
 * Copyright (c) 2014, zhangzhaoyu0524@163.com All Rights Reserved. 
 * 
*/  
  
package cn.bjfu.springdao.jpa.service.impl;  

import java.util.List;

import org.hibernate.engine.spi.PersistenceContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import cn.bjfu.springdao.jpa.dao.IHeadNoseDao;
import cn.bjfu.springdao.jpa.domain.execise.Head;
import cn.bjfu.springdao.jpa.domain.execise.Nose;
import cn.bjfu.springdao.jpa.service.IHeadNoseService;

/** 
 * ClassName:HeadNoseService <br/> 
 * Function: TODO ADD FUNCTION. <br/> 
 * Reason:   TODO ADD REASON. <br/> 
 * Date:     2014年7月4日 上午10:17:52 <br/> 
 * @author   zhangzhaoyu 
 * @version   
 * @since    JDK 1.7 
 * @see       
 */
@Service
@Transactional(readOnly = true)
public class HeadNoseService implements IHeadNoseService {

	@Autowired
	private IHeadNoseDao headNoseDao;
	
	@Override
	@Transactional(propagation = Propagation.REQUIRED)
	public void save(Head head) {
		this.headNoseDao.save(head);
	}

	@Override
	public Head findHeadById(int id) {
		return this.headNoseDao.findHeadById(id);
	}

	@Override
	public Nose findNoseById(int id) {
		return this.headNoseDao.findNoseById(id);
	}

	@Override
	public List<Head> findAll() {
		return this.headNoseDao.findAll();
	}

	@Override
	@Transactional
	public void save(Nose nose) {
		this.headNoseDao.save(nose);
	}

	@Override
	@Transactional
	public void findThanUpdate(int id) {
		Nose nose = this.headNoseDao.findNoseById(id);
	}

}
 