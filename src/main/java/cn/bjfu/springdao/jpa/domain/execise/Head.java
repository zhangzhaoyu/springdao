/** 
 * Project Name:springdao 
 * File Name:Head.java 
 * Package Name:cn.bjfu.springdao.jpa.domain.execise 
 * Date:2014年7月4日 上午10:05:31 
 * Copyright (c) 2014, zhangzhaoyu0524@163.com All Rights Reserved. 
 * 
*/  
  
package cn.bjfu.springdao.jpa.domain.execise;  

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/** 
 * ClassName:Head <br/> 
 * Function: TODO ADD FUNCTION. <br/> 
 * Reason:   TODO ADD REASON. <br/> 
 * Date:     2014年7月4日 上午10:05:31 <br/> 
 * @author   zhangzhaoyu 
 * @version   
 * @since    JDK 1.7 
 * @see       
 */
@Entity
@Table(name = "head")
public class Head implements Serializable {
	/**
	 * serialVersionUID:TODO
	 * @since JDK 1.7
	 */
	private static final long serialVersionUID = 1856809533670124595L;
	
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	
	@OneToOne(optional = false, cascade = CascadeType.ALL)
	@JoinColumn(name = "nose_id")
	private Nose nose;
	
	public Head() {}

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

	public Nose getNose() {
		return nose;
	}

	public void setNose(Nose nose) {
		this.nose = nose;
	}

	@Override
	public String toString() {
		return "Head [id=" + id + ", name=" + name + "]";
	}
	
}
 