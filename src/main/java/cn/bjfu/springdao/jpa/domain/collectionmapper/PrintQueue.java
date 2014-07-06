/** 
 * Project Name:springdao 
 * File Name:PrintQueue.java 
 * Package Name:cn.bjfu.springdao.jpa.domain.collectionmapper 
 * Date:2014年7月4日 下午3:13:33 
 * Copyright (c) 2014, zhangzhaoyu0524@163.com All Rights Reserved. 
 * 
*/  
  
package cn.bjfu.springdao.jpa.domain.collectionmapper;  

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OrderColumn;

/** 
 * ClassName:PrintQueue <br/> 
 * Function: TODO ADD FUNCTION. <br/> 
 * Reason:   TODO ADD REASON. <br/> 
 * Date:     2014年7月4日 下午3:13:33 <br/> 
 * @author   zhangzhaoyu 
 * @version   
 * @since    JDK 1.7 
 * @see       
 */
@Entity
public class PrintQueue implements Serializable {
	/**
	 * @since JDK 1.7
	 */
	private static final long serialVersionUID = 3353932968254925981L;

	@Id private String name;
	
	@OneToMany(mappedBy = "queue")
	@OrderColumn(name = "print_order")
	private List<PrintJob> jobs;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<PrintJob> getJobs() {
		return jobs;
	}

	public void setJobs(List<PrintJob> jobs) {
		this.jobs = jobs;
	}

	@Override
	public String toString() {
		return "PrintQueue [name=" + name + ", jobs=" + jobs + "]";
	}
}
 