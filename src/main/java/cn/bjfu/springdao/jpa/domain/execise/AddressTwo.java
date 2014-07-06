/** 
 * Project Name:springdao 
 * File Name:Address.java 
 * Package Name:cn.bjfu.springdao.jpa.domain.execise 
 * Date:2014年7月3日 下午4:12:15 
 * Copyright (c) 2014, zhangzhaoyu0524@163.com All Rights Reserved. 
 * 
*/  
  
package cn.bjfu.springdao.jpa.domain.execise;  

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.TableGenerator;

import org.apache.commons.lang.builder.ToStringBuilder;

/** 
 * ClassName:Address <br/> 
 * Function: TODO ADD FUNCTION. <br/> 
 * Reason:   TODO ADD REASON. <br/> 
 * Date:     2014年7月3日 下午4:12:15 <br/> 
 * @author   zhangzhaoyu 
 * @version   
 * @since    JDK 1.7 
 * @see       
 */
@Entity
@Table(name = "addresstwo")
public class AddressTwo implements Serializable {

	/**
	 * serialVersionUID:TODO
	 * @since JDK 1.7
	 */
	private static final long serialVersionUID = 4003827955642961159L;

	@TableGenerator(name = "Address_Gen",
			table = "id_gen",
			pkColumnName = "gen_name",
			valueColumnName = "gen_val",
			pkColumnValue = "Addr_Gen",
			initialValue = 10000,
			allocationSize = 100)
	@Id @GeneratedValue(strategy = GenerationType.TABLE, generator = "Address_Gen")
	private int id;
	private String name;
	
	public AddressTwo() {}
	public AddressTwo(int id, String name) {
		this.id = id;
		this.name = name;
	}
	
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
	
	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this);
	}
}
 