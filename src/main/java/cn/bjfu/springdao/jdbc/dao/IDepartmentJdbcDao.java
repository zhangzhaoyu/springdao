/** 
 * Project Name:springdao 
 * File Name:IDepartmentJdbcDao.java 
 * Package Name:cn.bjfu.springdao.jdbc.dao 
 * Date:2014年7月7日 上午9:28:08 
 * Copyright (c) 2014, zhangzhaoyu0524@163.com All Rights Reserved. 
 * 
*/  
  
package cn.bjfu.springdao.jdbc.dao;  

import java.util.List;

import cn.bjfu.springdao.jpa.domain.execise.Department;

/** 
 * ClassName:IDepartmentJdbcDao <br/> 
 * Function: TODO ADD FUNCTION. <br/> 
 * Reason:   TODO ADD REASON. <br/> 
 * Date:     2014年7月7日 上午9:28:08 <br/> 
 * @author   zhangzhaoyu 
 * @version   
 * @since    JDK 1.7 
 * @see       
 */
public interface IDepartmentJdbcDao {
	public Department findById(int id);
	public List<Department> findAll();
}
 