/** 
 * Project Name:springdao 
 * File Name:IEmployee.java 
 * Package Name:cn.bjfu.springdao.jpa.dao.impl 
 * Date:2014年7月1日 下午11:36:47 
 * Copyright (c) 2014, zhangzhaoyu0524@163.com All Rights Reserved. 
 * 
*/  
  
package cn.bjfu.springdao.jpa.dao;  

import java.util.List;

import javax.persistence.EntityManager;

import cn.bjfu.springdao.jpa.domain.execise.Employee;

/** 
 * ClassName:IEmployee <br/> 
 * Function: TODO ADD FUNCTION. <br/> 
 * Reason:   TODO ADD REASON. <br/> 
 * Date:     2014年7月1日 下午11:36:47 <br/> 
 * @author   zhangzhaoyu 
 * @version   
 * @since    JDK 1.7 
 * @see       
 */
public interface IEmployeeDao {

	public abstract void saveEmployee(Employee emp);
	public abstract Employee createEmployee(int id, String name, Long salary, String phoneNum);
	public Employee raiseEmployeeSalary(Integer id, Long salary);
	public Employee findEmployee(int id);
	public void removeEmployee(int id);
	public List<Employee> findAllEmployees();
	public void setEntityManager(EntityManager em);
	
}
 