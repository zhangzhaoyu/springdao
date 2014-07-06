/** 
 * Project Name:springdao 
 * File Name:EmployeeDaoImpl.java 
 * Package Name:cn.bjfu.springdao.jpa.dao.impl 
 * Date:2014年7月1日 下午11:38:57 
 * Copyright (c) 2014, zhangzhaoyu0524@163.com All Rights Reserved. 
 * 
*/  
  
package cn.bjfu.springdao.jpa.dao.impl;  

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import cn.bjfu.springdao.jpa.dao.IEmployeeDao;
import cn.bjfu.springdao.jpa.domain.execise.Employee;

/** 
 * ClassName:EmployeeDaoImpl <br/> 
 * Function: TODO ADD FUNCTION. <br/> 
 * Reason:   TODO ADD REASON. <br/> 
 * Date:     2014年7月1日 下午11:38:57 <br/> 
 * @author   zhangzhaoyu 
 * @version   
 * @since    JDK 1.7 
 * @see       
 */
@Repository
public class EmployeeDaoImpl implements IEmployeeDao {

	// PersistenceContext 为事务范围的实体管理器，是无状态的，容器为我们管理它
	// 所有容器托管的实体管理器均依赖于JTA 事务。他们可以使用事务作为跟踪持久化
	// 上下文的方式
	@PersistenceContext
	private EntityManager em;
	
	public void setEntityManager(EntityManager em) {
		this.em = em;
	}
	
	@Override
	public Employee createEmployee(int id, String name, Long salary, String phoneNum) {
		Employee emp = new Employee();
		emp.setName(name);
		emp.setSalary(salary);
		emp.setPhoneNum(phoneNum);
		em.persist(emp);
		return emp;
	}
	
	@Override
	public Employee raiseEmployeeSalary(Integer id, Long salary) {
		Employee emp = em.find(Employee.class, id);
		if (emp != null) {
			emp.setSalary(emp.getSalary() + 1000);
		}
		return emp;
	}

	@Override
	public Employee findEmployee(int id) {
		return em.find(Employee.class, id);
	}

	@Override
	public void removeEmployee(int id) {
		Employee emp = this.em.find(Employee.class, id);
		if (emp != null) {
			em.remove(emp);
		}
	}

	@Override
	public List<Employee> findAllEmployees() {
		final String jpql = "SELECT e FROM Employee e";
		TypedQuery<Employee> query = this.em.createQuery(jpql, Employee.class);
		return query.getResultList();
	}

	@Override
	public void saveEmployee(Employee emp) {
		this.em.persist(emp);
		System.out.println("persist....");
	}
	
}
 