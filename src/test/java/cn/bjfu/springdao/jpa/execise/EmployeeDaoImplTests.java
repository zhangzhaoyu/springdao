/** 
 * Project Name:springdao 
 * File Name:EmployeeDaoImplTests.java 
 * Package Name:cn.bjfu.springdao.jpa.execise 
 * Date:2014年7月1日 下午11:54:19 
 * Copyright (c) 2014, zhangzhaoyu0524@163.com All Rights Reserved. 
 * 
*/  
  
package cn.bjfu.springdao.jpa.execise;  

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import cn.bjfu.springdao.jpa.dao.IEmployeeDao;
import cn.bjfu.springdao.jpa.dao.impl.EmployeeDaoImpl;
import cn.bjfu.springdao.jpa.domain.execise.Employee;

/** 
 * ClassName:EmployeeDaoImplTests <br/> 
 * Function: TODO ADD FUNCTION. <br/> 
 * Reason:   TODO ADD REASON. <br/> 
 * Date:     2014年7月1日 下午11:54:19 <br/> 
 * @author   zhangzhaoyu 
 * @version   
 * @since    JDK 1.7 
 * @see       
 */
public class EmployeeDaoImplTests {

	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("EmployeeService");
		EntityManager em = factory.createEntityManager();
		IEmployeeDao employeeDao = new EmployeeDaoImpl();
		employeeDao.setEntityManager(em);
		
		em.getTransaction().begin();
		Employee emp = employeeDao.createEmployee(1, "zhangzhaoyuss", 1000L, "0106233156");
		em.getTransaction().commit();
		System.out.println("persisted " + emp);
		
		emp = employeeDao.findEmployee(1);
		System.out.println(emp);
		System.out.println("-----------------------------");
		List<Employee> list = employeeDao.findAllEmployees();
		System.out.println(list);
	}

}
 