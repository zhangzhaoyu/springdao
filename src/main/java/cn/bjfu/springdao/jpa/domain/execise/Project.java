/** 
 * Project Name:springdao 
 * File Name:Project.java 
 * Package Name:cn.bjfu.springdao.jpa.execise 
 * Date:2014年7月3日 下午9:52:57 
 * Copyright (c) 2014, zhangzhaoyu0524@163.com All Rights Reserved. 
 * 
*/  
  
package cn.bjfu.springdao.jpa.domain.execise;  

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import org.apache.commons.lang.builder.ToStringBuilder;

/** 
 * ClassName:Project <br/> 
 * Function: TODO ADD FUNCTION. <br/> 
 * Reason:   TODO ADD REASON. <br/> 
 * Date:     2014年7月3日 下午9:52:57 <br/> 
 * @author   zhangzhaoyu 
 * @version   
 * @since    JDK 1.7 
 * @see       
 */
@Entity
@Table(name = "project")
public class Project implements Serializable {

	/**
	 * serialVersionUID:TODO
	 * @since JDK 1.7
	 */
	private static final long serialVersionUID = 7315080326584390902L;
	
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String proName;
	@ManyToMany(mappedBy = "projects")
	private Collection<Employee> employees;
	
	public Project() {}
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getProName() {
		return proName;
	}
	
	public void setProName(String proName) {
		this.proName = proName;
	}
	
	public Collection<Employee> getEmployees() {
		return employees;
	}
	
	public void setEmployees(Collection<Employee> employees) {
		this.employees = employees;
	}
	
	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this);
	}
	
}
 