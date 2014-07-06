/** 
 * Project Name:springdao 
 * File Name:OrderRepository.java 
 * Package Name:cn.bjfu.springdao.jpa.repository 
 * Date:2014年6月29日 上午12:53:00 
 * Copyright (c) 2014, zhangzhaoyu0524@163.com All Rights Reserved. 
 * 
*/  
  
package cn.bjfu.springdao.jpa.repository;  

import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;

import cn.bjfu.springdao.jpa.domain.Customer;
import cn.bjfu.springdao.jpa.domain.order.Order;

/** 
 * ClassName:OrderRepository <br/> 
 * Function: TODO ADD FUNCTION. <br/> 
 * Reason:   TODO ADD REASON. <br/> 
 * Date:     2014年6月29日 上午12:53:00 <br/> 
 * @author   zhangzhaoyu 
 * @version   
 * @since    JDK 1.7 
 * @see       
 */
public interface OrderRepository extends PagingAndSortingRepository<Order, Long> {
	public abstract List<Order> findByCustomer(Customer customer);
}
 