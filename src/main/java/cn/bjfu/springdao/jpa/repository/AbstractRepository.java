/** 
 * Project Name:springdao 
 * File Name:AbstractRepository.java 
 * Package Name:cn.bjfu.springdao.jpa.repository 
 * Date:2014年6月30日 上午12:15:20 
 * Copyright (c) 2014, zhangzhaoyu0524@163.com All Rights Reserved. 
 * 
*/  
  
package cn.bjfu.springdao.jpa.repository;  

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.NoRepositoryBean;
import org.springframework.data.repository.Repository;

import cn.bjfu.springdao.jpa.domain.AbstractEntity;

/** 
 * ClassName:AbstractRepository <br/> 
 * Function: 所有的repository 都继承该接口可以讲公共的方法提取出来. <br/> 
 * Reason:   TODO ADD REASON. <br/> 
 * Date:     2014年6月30日 上午12:15:20 <br/> 
 * @author   zhangzhaoyu 
 * @version   
 * @since    JDK 1.7 
 * @see       
 */
@NoRepositoryBean
public interface AbstractRepository<T extends AbstractEntity> extends Repository<T, Long> {
	  @Query("select t from #{#entityName} t where t.id = ?1")
	  List<T> findAllById(Long id);
}
 