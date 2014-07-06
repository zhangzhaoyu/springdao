/** 
 * Project Name:springdao 
 * File Name:PrintJob.java 
 * Package Name:cn.bjfu.springdao.jpa.domain.collectionmapper 
 * Date:2014年7月4日 下午3:12:25 
 * Copyright (c) 2014, zhangzhaoyu0524@163.com All Rights Reserved. 
 * 
*/  
  
package cn.bjfu.springdao.jpa.domain.collectionmapper;  

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

/** 
 * ClassName:PrintJob <br/> 
 * Function: TODO ADD FUNCTION. <br/> 
 * Reason:   TODO ADD REASON. <br/> 
 * Date:     2014年7月4日 下午3:12:25 <br/> 
 * @author   zhangzhaoyu 
 * @version   
 * @since    JDK 1.7 
 * @see       
 */
@Entity
public class PrintJob implements Serializable {
	/**
	 * @since JDK 1.7
	 */
	private static final long serialVersionUID = 3963720815819129463L;
	
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@ManyToOne
	private PrintQueue queue;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public PrintQueue getQueue() {
		return queue;
	}

	public void setQueue(PrintQueue queue) {
		this.queue = queue;
	}

	@Override
	public String toString() {
		return "PrintJob [id=" + id + "]";
	}
}
 