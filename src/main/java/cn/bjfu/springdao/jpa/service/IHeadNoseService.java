/** 
 * Project Name:springdao 
 * File Name:IHeadNoseService.java 
 * Package Name:cn.bjfu.springdao.jpa.service 
 * Date:2014年7月4日 上午10:17:28 
 * Copyright (c) 2014, zhangzhaoyu0524@163.com All Rights Reserved. 
 * 
*/  
  
package cn.bjfu.springdao.jpa.service;  

import java.util.List;

import cn.bjfu.springdao.jpa.domain.execise.Head;
import cn.bjfu.springdao.jpa.domain.execise.Nose;

/** 
 * ClassName:IHeadNoseService <br/> 
 * Function: TODO ADD FUNCTION. <br/> 
 * Reason:   TODO ADD REASON. <br/> 
 * Date:     2014年7月4日 上午10:17:28 <br/> 
 * @author   zhangzhaoyu 
 * @version   
 * @since    JDK 1.7 
 * @see       
 */
public interface IHeadNoseService {
	public void save(Nose nose);
	public void save(Head head);
	public Head findHeadById(int id);
	public Nose findNoseById(int id);
	public List<Head> findAll();
	public void findThanUpdate(int id);
}
 