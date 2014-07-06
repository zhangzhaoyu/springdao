/** 
 * Project Name:springdao 
 * File Name:VacationEntry.java 
 * Package Name:cn.bjfu.springdao.jpa.domain.collectionmapper 
 * Date:2014年7月4日 下午2:35:57 
 * Copyright (c) 2014, zhangzhaoyu0524@163.com All Rights Reserved. 
 * 
*/  
  
package cn.bjfu.springdao.jpa.domain.collectionmapper;  

import java.io.Serializable;
import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/** 
 * ClassName:VacationEntry <br/> 
 * Function: TODO ADD FUNCTION. <br/> 
 * Reason:   TODO ADD REASON. <br/> 
 * Date:     2014年7月4日 下午2:35:57 <br/> 
 * @author   zhangzhaoyu 
 * @version   
 * @since    JDK 1.7 
 * @see       
 */
@Embeddable
public class VacationEntry implements Serializable {
	/**
	 * serialVersionUID:TODO
	 * @since JDK 1.7
	 */
	private static final long serialVersionUID = -5749756102212032210L;

	@Temporal(TemporalType.DATE)
	private Calendar startDate;
	@Column(name = "days")
	private int daysTaken;
	
	public VacationEntry() {}
	
	public Calendar getStartDate() {
		return startDate;
	}
	public void setStartDate(Calendar startDate) {
		this.startDate = startDate;
	}
	public int getDaysTaken() {
		return daysTaken;
	}
	public void setDaysTaken(int daysTaken) {
		this.daysTaken = daysTaken;
	}
	
	@Override
	public String toString() {
		return "VacationEntry [startDate=" + startDate + ", daysTaken="
				+ daysTaken + "]";
	}
}
 