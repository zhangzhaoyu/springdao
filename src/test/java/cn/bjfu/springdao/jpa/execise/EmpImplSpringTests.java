/** 
 * Project Name:springdao 
 * File Name:EmpImplSpringTests.java 
 * Package Name:cn.bjfu.springdao.jpa.execise 
 * Date:2014年7月3日 下午2:42:37 
 * Copyright (c) 2014, zhangzhaoyu0524@163.com All Rights Reserved. 
 * 
*/  
  
package cn.bjfu.springdao.jpa.execise;  

import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import cn.bjfu.springdao.jpa.dao.IEmployeeDao;
import cn.bjfu.springdao.jpa.domain.execise.Department;
import cn.bjfu.springdao.jpa.domain.execise.Employee;
import cn.bjfu.springdao.jpa.domain.execise.ParkingSpace;
import cn.bjfu.springdao.jpa.enums.EmployeeType;

/** 
 * ClassName:EmpImplSpringTests <br/> 
 * Function: TODO ADD FUNCTION. <br/> 
 * Reason:   TODO ADD REASON. <br/> 
 * Date:     2014年7月3日 下午2:42:37 <br/> 
 * @author   zhangzhaoyu 
 * @version   
 * @since    JDK 1.7 
 * @see       
 */
@RunWith(SpringJUnit4ClassRunner.class) 
@ContextConfiguration("classpath:spring/root-context.xml") 
public class EmpImplSpringTests {

	@Autowired
	IEmployeeDao employeeDao;
	
	@Test
	public void testfindEmployee() {
		try {
			System.out.println("-------------------------------------");
			Employee emp  =this.employeeDao.findEmployee(1);
			System.out.println("Enum : " + emp.getType().ordinal());
			System.out.println("combineAttr : " + emp.getCombineArrt());
			
			Department department = emp.getDepartment();
			System.out.println(department.getEmployees());
			ParkingSpace parkingSpace = emp.getParkingSpace();
			System.out.println(parkingSpace.getEmployee());
			emp.getProjects();
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@Ignore
	public void testSaveEmp() {
		Employee employee = new Employee();
		employee.setName("xxxxx");
		employee.setPhoneNum("15210504514");
		employee.setSalary(1000L);
		employee.setType(EmployeeType.FULL_TIME_EMPLOYEE);
		try {
			this.employeeDao.saveEmployee(employee);
			System.out.println(employee);
		} catch (DataAccessException e) {
			e.printStackTrace();
		}
		
	}
}
 