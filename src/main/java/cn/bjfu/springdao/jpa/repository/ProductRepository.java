/** 
 * Project Name:springdao 
 * File Name:ProductRepository.java 
 * Package Name:cn.bjfu.springdao.jpa.repository 
 * Date:2014年6月29日 上午12:37:38 
 * Copyright (c) 2014, zhangzhaoyu0524@163.com All Rights Reserved. 
 * 
*/  
  
package cn.bjfu.springdao.jpa.repository;  

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import cn.bjfu.springdao.jpa.domain.Product;

/** 
 * ClassName:ProductRepository <br/> 
 * Function: TODO ADD FUNCTION. <br/> 
 * Reason:   TODO ADD REASON. <br/> 
 * Date:     2014年6月29日 上午12:37:38 <br/> 
 * @author   zhangzhaoyu 
 * @version   
 * @since    JDK 1.7 
 * @see       
 */
/*
 * 选用CrudRepository 接口是为了暴露方法，因为默认的SimpleJpaRepository 已经实现了很多方法
 * 必须暴露出来，才能调用
 */
public interface ProductRepository extends CrudRepository<Product, Long>{
	
	public abstract Page<Product> findByDescriptionContaining(String description, Pageable pageable);
	
	@Query("select p from Product p where p.attributes[?1] = ?2")
	public abstract List<Product> findByArrtibuteAndValue(String attribute, String value);
	
	public abstract Long countByName(String name);
	
	public List<Product> findByName(String name);
	
}
 