/** 
 * Project Name:springdao 
 * File Name:ParkingSpaceService.java 
 * Package Name:cn.bjfu.springdao.jpa.service.impl 
 * Date:2014年7月4日 上午9:43:37 
 * Copyright (c) 2014, zhangzhaoyu0524@163.com All Rights Reserved. 
 * 
*/  
  
package cn.bjfu.springdao.jpa.service.impl;  

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cn.bjfu.springdao.jpa.dao.IParkingSpaceDao;
import cn.bjfu.springdao.jpa.domain.execise.ParkingSpace;
import cn.bjfu.springdao.jpa.service.IParkingSpaceService;

/** 
 * ClassName:ParkingSpaceService <br/> 
 * Function: TODO ADD FUNCTION. <br/> 
 * Reason:   TODO ADD REASON. <br/> 
 * Date:     2014年7月4日 上午9:43:37 <br/> 
 * @author   zhangzhaoyu 
 * @version   
 * @since    JDK 1.7 
 * @see       
 */
@Service
@Transactional(readOnly = true)
public class ParkingSpaceService implements IParkingSpaceService {

	@Autowired
	private IParkingSpaceDao parkingSpaceDao;
	
	@Override
	@Transactional
	public void saveParkingSpace(ParkingSpace parkingSpace) {
		this.parkingSpaceDao.saveParkingSpace(parkingSpace);
	}

	@Override
	public ParkingSpace findById(int id) {
		return this.parkingSpaceDao.findById(id);
	}

}
 