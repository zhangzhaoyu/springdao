/** 
 * Project Name:springdao 
 * File Name:Phone.java 
 * Package Name:cn.bjfu.springdao.jpa.domain.execise 
 * Date:2014年7月4日 上午9:53:25 
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

/** 
 * ClassName:Phone <br/> 
 * Function: TODO ADD FUNCTION. <br/> 
 * Reason:   TODO ADD REASON. <br/> 
 * Date:     2014年7月4日 上午9:53:25 <br/> 
 * @author   zhangzhaoyu 
 * @version   
 * @since    JDK 1.7 
 * @see       
 */
@Entity
@Table(name = "phone")
public class Phone implements Serializable {
	/**
	 * serialVersionUID:TODO
	 * @since JDK 1.7
	 */
	private static final long serialVersionUID = 682045004499830046L;
	
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private int type;
	private String num;
	
	public Phone() {}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}

	public String getNum() {
		return num;
	}

	public void setNum(String num) {
		this.num = num;
	}

	@Override
	public String toString() {
		return "Phone [id=" + id + ", type=" + type + ", num=" + num + "]";
	}
}
 