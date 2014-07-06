/** 
 * Project Name:springdao 
 * File Name:User.java 
 * Package Name:cn.bjfu.springdao.pojo 
 * Date:2014年6月20日 下午3:10:21 
 * Copyright (c) 2014, zhangzhaoyu0524@163.com All Rights Reserved. 
 * 
*/  
  
package cn.bjfu.springdao.jpa.domain;  

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/** 
 * ClassName:User <br/> 
 * Function: User. <br/> 
 * Reason:   User. <br/> 
 * Date:     2014年6月20日 下午3:10:21 <br/> 
 * @author   zhangzhaoyu 
 * @version   
 * @since    JDK 1.7 
 * @see       
 */
@Entity
@Table(name="user")
public class User implements Serializable {
	/**
	 * serialVersionUID:TODO
	 * @since JDK 1.7
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name = "user_id", nullable = false)
	private Integer userId;
	@Column(name = "name", nullable = false, length = 100)
	private String name;
	@Column(name = "password", nullable = true)
	private String password;
	@Column(name = "email", nullable = true)
	private String email;
	@Column(name = "add_datetime", nullable = true)
	private java.util.Date addDatetime;
	@Column(name = "edit_datetime", nullable = true)
	private java.util.Date editDatetime;
	
	public User() {}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public java.util.Date getAddDatetime() {
		return addDatetime;
	}

	public void setAddDatetime(java.util.Date addDatetime) {
		this.addDatetime = addDatetime;
	}

	public java.util.Date getEditDatetime() {
		return editDatetime;
	}

	public void setEditDatetime(java.util.Date editDatetime) {
		this.editDatetime = editDatetime;
	}

	@Override
	public String toString() {
		return "User [userId=" + userId + ", name=" + name + ", password="
				+ password + ", email=" + email + ", addDatetime="
				+ addDatetime + ", editDatetime=" + editDatetime + "]";
	}
}
 