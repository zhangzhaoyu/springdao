/** 
 * Project Name:springdao 
 * File Name:LiveAddress.java 
 * Package Name:cn.bjfu.springdao.jpa.domain.execise 
 * Date:2014年7月4日 下午2:01:44 
 * Copyright (c) 2014, zhangzhaoyu0524@163.com All Rights Reserved. 
 * 
*/  
  
package cn.bjfu.springdao.jpa.domain.execise;  

import java.io.Serializable;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/** 
 * ClassName:LiveAddress <br/> 
 * Function: 嵌入对象 embedded object. <br/> 
 * Reason:   TODO ADD REASON. <br/> 
 * Date:     2014年7月4日 下午2:01:44 <br/> 
 * @author   zhangzhaoyu 
 * @version   
 * @since    JDK 1.7 
 * @see       
 */
@Embeddable @Access(AccessType.FIELD)
public class LiveAddress implements Serializable {

	private String street;
	private String city;
	private String state;
	@Column(name = "zip_code")
	private String zip;
	
}
 