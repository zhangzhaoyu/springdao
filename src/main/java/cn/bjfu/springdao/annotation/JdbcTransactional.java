/** 
 * Project Name:springdao 
 * File Name:JdbcTransactional.java 
 * Package Name:cn.bjfu.springdao.annotation 
 * Date:2014年7月5日 下午3:18:53 
 * Copyright (c) 2014, zhangzhaoyu0524@163.com All Rights Reserved. 
 * 
*/  
  
package cn.bjfu.springdao.annotation;  

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import org.springframework.transaction.annotation.Transactional;

/** 
 * ClassName:JdbcTransactional <br/> 
 * Function: JdbcTransactional. <br/> 
 * Reason:   JdbcTransactional. <br/> 
 * Date:     2014年7月5日 下午3:18:53 <br/> 
 * @author   zhangzhaoyu 
 * @version   
 * @since    JDK 1.7 
 * @see       
 */
@Target({ElementType.METHOD, ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Transactional("jdbc")
public @interface JdbcTransactional {

}
 