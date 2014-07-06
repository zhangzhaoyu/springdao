/** 
 * Project Name:springdao 
 * File Name:IPackingSpaceDao.java 
 * Package Name:cn.bjfu.springdao.jpa.dao 
 * Date:2014年7月4日 上午9:39:29 
 * Copyright (c) 2014, zhangzhaoyu0524@163.com All Rights Reserved. 
 * 
*/  
  
package cn.bjfu.springdao.jpa.dao;  

import cn.bjfu.springdao.jpa.domain.execise.ParkingSpace;

/** 
 * ClassName:IPackingSpaceDao <br/> 
 * Function: TODO ADD FUNCTION. <br/> 
 * Reason:   TODO ADD REASON. <br/> 
 * Date:     2014年7月4日 上午9:39:29 <br/> 
 * @author   zhangzhaoyu 
 * @version   
 * @since    JDK 1.7 
 * @see       
 */
public interface IParkingSpaceDao {
	public abstract void saveParkingSpace(ParkingSpace parkingSpace);
	public abstract ParkingSpace findById(int id);
}
 