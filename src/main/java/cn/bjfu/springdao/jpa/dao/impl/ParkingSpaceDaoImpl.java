/** 
 * Project Name:springdao 
 * File Name:ParkingSpaceDaoImpl.java 
 * Package Name:cn.bjfu.springdao.jpa.dao.impl 
 * Date:2014年7月4日 上午9:41:37 
 * Copyright (c) 2014, zhangzhaoyu0524@163.com All Rights Reserved. 
 * 
*/  
  
package cn.bjfu.springdao.jpa.dao.impl;  

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import cn.bjfu.springdao.jpa.dao.IParkingSpaceDao;
import cn.bjfu.springdao.jpa.domain.execise.ParkingSpace;

/** 
 * ClassName:ParkingSpaceDaoImpl <br/> 
 * Function: TODO ADD FUNCTION. <br/> 
 * Reason:   TODO ADD REASON. <br/> 
 * Date:     2014年7月4日 上午9:41:37 <br/> 
 * @author   zhangzhaoyu 
 * @version   
 * @since    JDK 1.7 
 * @see       
 */
@Repository
public class ParkingSpaceDaoImpl implements IParkingSpaceDao {

	@PersistenceContext
	private EntityManager em;
	
	@Override
	public void saveParkingSpace(ParkingSpace parkingSpace) {
		this.em.persist(parkingSpace);
	}

	@Override
	public ParkingSpace findById(int id) {
		return this.em.find(ParkingSpace.class, id);
	}

}
 