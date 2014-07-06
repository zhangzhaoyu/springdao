/** 
 * Project Name:springdao 
 * File Name:EmployeeService.java 
 * Package Name:cn.bjfu.springdao.jpa.service.impl 
 * Date:2014年7月4日 上午9:10:15 
 * Copyright (c) 2014, zhangzhaoyu0524@163.com All Rights Reserved. 
 * 
*/  
  
package cn.bjfu.springdao.jpa.service.impl;  

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import cn.bjfu.springdao.jpa.dao.IEmployeeDao;
import cn.bjfu.springdao.jpa.domain.execise.Employee;
import cn.bjfu.springdao.jpa.service.IEmployeeService;

/** 
 * ClassName:EmployeeService <br/> 
 * Function: TODO ADD FUNCTION. <br/> 
 * Reason:   TODO ADD REASON. <br/> 
 * Date:     2014年7月4日 上午9:10:15 <br/> 
 * @author   zhangzhaoyu 
 * @version   
 * @since    JDK 1.7 
 * @see       
 */

@Service
@Transactional(readOnly = true)
public class EmployeeService implements IEmployeeService {

	/**
	 * Spring 事务的传播行为
	 * Propagation.REQUIRED 没有就新建，有就加入当前
	 * Propagation.SUPPORTS 支持当前事务，如果没有事务，就以非事务运行
	 * Propagation.MANDATORY 使用当前事务，没有就抛出异常
	 * Propagation.REQUIRES_NEW 新建事务，如果当前存在，就把当前事务挂起
	 * Propagation.NOT_SUPPORTED 以非事务的方式执行，如果当前存在事务，就把当前事务挂起
	 * Propagation.NEVER 以非事务方式运行，如果当前存在事务，则抛出异常
	 * Propagation.NESTED 如果当前存在事务，则在嵌套事务内执行。如果没有则执行Propagation.REQUIRED 
	 * 
	 * 事务的隔离等级
	 * @Transactional("xxxxManager") 可以使用不同的事务管理器
	 * 类似操作
	 */
	@Autowired
	private IEmployeeDao employeeDao;
	
	@Override
	@Transactional(propagation = Propagation.REQUIRED, isolation = Isolation.REPEATABLE_READ, timeout = 60, rollbackFor = Exception.class)
	public void saveEmployee(Employee emp) {
		this.employeeDao.saveEmployee(emp);
	}

	@Override
	@Transactional
	public Employee createEmployee(int id, String name, Long salary,
			String phoneNum) {
		return this.employeeDao.createEmployee(id, name, salary, phoneNum);
	}

	@Override
	@Transactional
	public Employee raiseEmployeeSalary(Integer id, Long salary) {
		return this.employeeDao.raiseEmployeeSalary(id, salary);
	}

	@Override
	public Employee findEmployee(int id) {
		return this.employeeDao.findEmployee(id);
	}

	@Override
	@Transactional
	public void removeEmployee(int id) {
		this.employeeDao.removeEmployee(id);
	}

	@Override
	public List<Employee> findAllEmployees() {
		return this.employeeDao.findAllEmployees();
	}

}
 