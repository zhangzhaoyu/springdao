/** 
 * Project Name:springdao 
 * File Name:Animal.java 
 * Package Name:cn.bjfu.springdao.jpa.domain.execise 
 * Date:2014年7月4日 下午1:58:45 
 * Copyright (c) 2014, zhangzhaoyu0524@163.com All Rights Reserved. 
 * 
*/  
  
package cn.bjfu.springdao.jpa.domain.execise;  

import java.io.Serializable;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/** 
 * ClassName:Animal <br/> 
 * Function: 嵌入对象 embedded object. <br/> 
 * Reason:   TODO ADD REASON. <br/> 
 * Date:     2014年7月4日 下午1:58:45 <br/> 
 * @author   zhangzhaoyu 
 * @version   
 * @since    JDK 1.7 
 * @see       
 */
@Entity
@Table(name = "animal")
public class Animal implements Serializable {
	/**
	 * serialVersionUID:TODO
	 * @since JDK 1.7
	 */
	private static final long serialVersionUID = 3295314624812247524L;
	
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	private String age;
	
	@Embedded
	private LiveAddress liveAddress;
	
	public Animal() {}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Animal [id=" + id + ", name=" + name + ", age=" + age
				+ ", liveAddress=" + liveAddress + "]";
	}
}
 