/** 
 * Project Name:springdao 
 * File Name:Bird.java 
 * Package Name:cn.bjfu.springdao.jpa.domain.execise 
 * Date:2014年7月4日 下午2:12:46 
 * Copyright (c) 2014, zhangzhaoyu0524@163.com All Rights Reserved. 
 * 
*/  
  
package cn.bjfu.springdao.jpa.domain.execise;  

import java.io.Serializable;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/** 
 * ClassName:Bird <br/> 
 * Function: 重命名嵌入字段的值. <br/> 
 * Reason:   TODO ADD REASON. <br/> 
 * Date:     2014年7月4日 下午2:12:46 <br/> 
 * @author   zhangzhaoyu 
 * @version   
 * @since    JDK 1.7 
 * @see       
 */
@Entity
@Table(name = "exercise_bird")
public class Bird implements Serializable {
	/**
	 * serialVersionUID:TODO
	 * @since JDK 1.7
	 */
	private static final long serialVersionUID = -317303554096481889L;
	
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	
	@Embedded
	@AttributeOverrides({
		@AttributeOverride(name = "state", column = @Column(name = "bird_state")),
		@AttributeOverride(name = "zip", column = @Column(name = "bird_zip"))
	})
	private LiveAddress liveAddress;
	
	public Bird() {}

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

	public LiveAddress getLiveAddress() {
		return liveAddress;
	}

	public void setLiveAddress(LiveAddress liveAddress) {
		this.liveAddress = liveAddress;
	}

	@Override
	public String toString() {
		return "Bird [id=" + id + ", name=" + name + ", liveAddress="
				+ liveAddress + "]";
	}
}
 