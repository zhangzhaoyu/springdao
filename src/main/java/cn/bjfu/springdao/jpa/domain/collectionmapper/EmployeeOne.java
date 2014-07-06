/** 
 * Project Name:springdao 
 * File Name:EmployeeOne.java 
 * Package Name:cn.bjfu.springdao.jpa.domain.collectionmapper 
 * Date:2014年7月4日 下午2:39:16 
 * Copyright (c) 2014, zhangzhaoyu0524@163.com All Rights Reserved. 
 * 
*/  
  
package cn.bjfu.springdao.jpa.domain.collectionmapper;  

import java.io.Serializable;
import java.util.Collection;
import java.util.Set;

import javax.persistence.AttributeOverride;
import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;

/** 
 * ClassName:EmployeeOne <br/> 
 * Function: 元素集合需要一张独立的表，称之为集合表(collection table). <br/> 
 * Reason:   TODO ADD REASON. <br/> 
 * Date:     2014年7月4日 下午2:39:16 <br/> 
 * @author   zhangzhaoyu 
 * @version   
 * @since    JDK 1.7 
 * @see       
 */
@Entity
public class EmployeeOne implements Serializable {
	/**
	 * serialVersionUID:TODO
	 * @since JDK 1.7
	 */
	private static final long serialVersionUID = -4780437571536939150L;
	
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	private long salary;
	
	// 元素结合表的生成有默认的规则，也可以手动添加注解改变规则
	@ElementCollection(targetClass = VacationEntry.class, fetch = FetchType.LAZY)
	@CollectionTable(name = "employeeone_vacationbookings",
		joinColumns = @JoinColumn(name = "employeeone_id")
			)
	@AttributeOverride(name = "daysTaken", column = @Column(name = "days"))
	private Collection vacationBookings;
	
	@ElementCollection
	private Set<String> nickNames;

	public EmployeeOne() {}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getSalary() {
		return salary;
	}

	public void setSalary(long salary) {
		this.salary = salary;
	}

	public Collection getVacationBookings() {
		return vacationBookings;
	}

	public void setVacationBookings(Collection vacationBookings) {
		this.vacationBookings = vacationBookings;
	}

	public Set<String> getNickNames() {
		return nickNames;
	}

	public void setNickNames(Set<String> nickNames) {
		this.nickNames = nickNames;
	}

	@Override
	public String toString() {
		return "EmployeeOne [id=" + id + ", name=" + name + ", salary="
				+ salary + "]";
	}
}
 