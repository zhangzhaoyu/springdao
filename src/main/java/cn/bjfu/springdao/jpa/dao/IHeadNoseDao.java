/** 
 * Project Name:springdao 
 * File Name:IHeadNoseDao.java 
 * Package Name:cn.bjfu.springdao.jpa.dao 
 * Date:2014年7月4日 上午10:11:15 
 * Copyright (c) 2014, zhangzhaoyu0524@163.com All Rights Reserved. 
 * 
*/  
  
package cn.bjfu.springdao.jpa.dao;  

import java.util.List;

import cn.bjfu.springdao.jpa.domain.execise.Head;
import cn.bjfu.springdao.jpa.domain.execise.Nose;

/** 
 * ClassName:IHeadNoseDao <br/> 
 * Function: TODO ADD FUNCTION. <br/> 
 * Reason:   TODO ADD REASON. <br/> 
 * Date:     2014年7月4日 上午10:11:15 <br/> 
 * @author   zhangzhaoyu 
 * @version   
 * @since    JDK 1.7 
 * @see       
 */
public interface IHeadNoseDao {
	public void save(Nose nose);
	public void save(Head head);
	public Head findHeadById(int id);
	public Nose findNoseById(int id);
	public List<Head> findAll();
}
 