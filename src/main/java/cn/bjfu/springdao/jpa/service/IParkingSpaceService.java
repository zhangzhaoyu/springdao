/** 
 * Project Name:springdao 
 * File Name:IPackingSpaceService.java 
 * Package Name:cn.bjfu.springdao.jpa.service 
 * Date:2014年7月4日 上午9:38:56 
 * Copyright (c) 2014, zhangzhaoyu0524@163.com All Rights Reserved. 
 * 
*/  
  
package cn.bjfu.springdao.jpa.service;  

import cn.bjfu.springdao.jpa.domain.execise.ParkingSpace;

/** 
 * ClassName:IPackingSpaceService <br/> 
 * Function: TODO ADD FUNCTION. <br/> 
 * Reason:   TODO ADD REASON. <br/> 
 * Date:     2014年7月4日 上午9:38:56 <br/> 
 * @author   zhangzhaoyu 
 * @version   
 * @since    JDK 1.7 
 * @see       
 */
public interface IParkingSpaceService {
	
	public abstract void saveParkingSpace(ParkingSpace parkingSpace);
	public abstract ParkingSpace findById(int id);
	
}	
 