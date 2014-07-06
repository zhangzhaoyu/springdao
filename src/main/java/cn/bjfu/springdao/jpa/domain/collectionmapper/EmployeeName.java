/** 
 * Project Name:springdao 
 * File Name:EmployeeName.java 
 * Package Name:cn.bjfu.springdao.jpa.domain.collectionmapper 
 * Date:2014年7月5日 上午10:38:16 
 * Copyright (c) 2014, zhangzhaoyu0524@163.com All Rights Reserved. 
 * 
*/  
  
package cn.bjfu.springdao.jpa.domain.collectionmapper;  

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

/** 
 * ClassName:EmployeeName <br/> 
 * Function: TODO ADD FUNCTION. <br/> 
 * Reason:   TODO ADD REASON. <br/> 
 * Date:     2014年7月5日 上午10:38:16 <br/> 
 * @author   zhangzhaoyu 
 * @version   
 * @since    JDK 1.7 
 * @see       
 */
@Embeddable
public class EmployeeName implements Serializable {
	/**
	 * serialVersionUID:TODO
	 * @since JDK 1.7
	 */
	private static final long serialVersionUID = -7357067075206717388L;

	@Column(name = "f_name", insertable = false, updatable = false)
	private String first_Name;
	@Column(name = "l_name", insertable = false, updatable = false)
	private String last_Name;
	
	public EmployeeName() {}
	
	public String getFirst_Name() {
		return first_Name;
	}
	public void setFirst_Name(String first_Name) {
		this.first_Name = first_Name;
	}
	public String getLast_Name() {
		return last_Name;
	}
	public void setLast_Name(String last_Name) {
		this.last_Name = last_Name;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((first_Name == null) ? 0 : first_Name.hashCode());
		result = prime * result
				+ ((last_Name == null) ? 0 : last_Name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		EmployeeName other = (EmployeeName) obj;
		if (first_Name == null) {
			if (other.first_Name != null)
				return false;
		} else if (!first_Name.equals(other.first_Name))
			return false;
		if (last_Name == null) {
			if (other.last_Name != null)
				return false;
		} else if (!last_Name.equals(other.last_Name))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "EmployeeName [first_Name=" + first_Name + ", last_Name="
				+ last_Name + "]";
	}
}
 