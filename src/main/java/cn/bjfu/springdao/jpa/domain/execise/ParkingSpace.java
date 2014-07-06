/** 
 * Project Name:springdao 
 * File Name:ParkingSpace.java 
 * Package Name:cn.bjfu.springdao.jpa.execise 
 * Date:2014年7月3日 下午9:24:43 
 * Copyright (c) 2014, zhangzhaoyu0524@163.com All Rights Reserved. 
 * 
*/  
  
package cn.bjfu.springdao.jpa.domain.execise;  

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.apache.commons.lang.builder.ToStringBuilder;

/** 
 * ClassName:ParkingSpace <br/> 
 * Function: TODO ADD FUNCTION. <br/> 
 * Reason:   TODO ADD REASON. <br/> 
 * Date:     2014年7月3日 下午9:24:43 <br/> 
 * @author   zhangzhaoyu 
 * @version   
 * @since    JDK 1.7 
 * @see       
 */
@Entity
@Table(name = "park_space")
public class ParkingSpace implements Serializable {
	/**
	 * serialVersionUID:TODO
	 * @since JDK 1.7
	 */
	private static final long serialVersionUID = 7356683100796513602L;
	
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private int lot;
	private String location;
	// 双向onetoone mappedBy 还是表明 Employee 是源实体，放在没有定义联结列的实体上
	@OneToOne(mappedBy = "parkingSpace")
	private Employee employee;
	
	public ParkingSpace() {}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getLot() {
		return lot;
	}

	public void setLot(int lot) {
		this.lot = lot;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}
	
	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this);
	}
}
 