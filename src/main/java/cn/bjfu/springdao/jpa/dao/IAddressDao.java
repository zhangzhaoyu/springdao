/** 
 * Project Name:springdao 
 * File Name:IAddressDao.java 
 * Package Name:cn.bjfu.springdao.jpa.dao 
 * Date:2014年7月3日 下午4:19:33 
 * Copyright (c) 2014, zhangzhaoyu0524@163.com All Rights Reserved. 
 * 
*/  
  
package cn.bjfu.springdao.jpa.dao;  

import java.util.List;

import cn.bjfu.springdao.jpa.domain.execise.AddressTwo;

/** 
 * ClassName:IAddressDao <br/> 
 * Function: TODO ADD FUNCTION. <br/> 
 * Reason:   TODO ADD REASON. <br/> 
 * Date:     2014年7月3日 下午4:19:33 <br/> 
 * @author   zhangzhaoyu 
 * @version   
 * @since    JDK 1.7 
 * @see       
 */
public interface IAddressDao {

	public AddressTwo save(AddressTwo address);
	public List<AddressTwo> findAll();
	public AddressTwo findById(Integer id);
	
}
 