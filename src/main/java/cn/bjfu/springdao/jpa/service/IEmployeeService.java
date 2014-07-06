/** 
 * Project Name:springdao 
 * File Name:IEmployeeService.java 
 * Package Name:cn.bjfu.springdao.jpa.service 
 * Date:2014年7月4日 上午9:09:14 
 * Copyright (c) 2014, zhangzhaoyu0524@163.com All Rights Reserved. 
 * 
*/  
  
package cn.bjfu.springdao.jpa.service;  

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import cn.bjfu.springdao.jpa.domain.execise.Employee;

/** 
 * ClassName:IEmployeeService <br/> 
 * Function: TODO ADD FUNCTION. <br/> 
 * Reason:   TODO ADD REASON. <br/> 
 * Date:     2014年7月4日 上午9:09:14 <br/> 
 * @author   zhangzhaoyu 
 * @version   
 * @since    JDK 1.7 
 * @see       
 */
public interface IEmployeeService {
	public abstract void saveEmployee(Employee emp);
	public abstract Employee createEmployee(int id, String name, Long salary, String phoneNum);
	public Employee raiseEmployeeSalary(Integer id, Long salary);
	public Employee findEmployee(int id);
	public void removeEmployee(int id);
	public List<Employee> findAllEmployees();
}
 