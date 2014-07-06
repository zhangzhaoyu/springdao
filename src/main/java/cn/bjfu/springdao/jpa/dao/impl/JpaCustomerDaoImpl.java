/** 
 * Project Name:springdao 
 * File Name:JpaCustomerRepository.java 
 * Package Name:cn.bjfu.springdao.jpa.dao.impl 
 * Date:2014年6月28日 下午11:52:56 
 * Copyright (c) 2014, zhangzhaoyu0524@163.com All Rights Reserved. 
 * 
*/  
  
package cn.bjfu.springdao.jpa.dao.impl;  

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import cn.bjfu.springdao.jpa.dao.CustomerDao;
import cn.bjfu.springdao.jpa.domain.Customer;
import cn.bjfu.springdao.jpa.domain.EmailAddress;

/** 
 * ClassName:JpaCustomerRepository <br/> 
 * Function: TODO ADD FUNCTION. <br/> 
 * Reason:   TODO ADD REASON. <br/> 
 * Date:     2014年6月28日 下午11:52:56 <br/> 
 * @author   zhangzhaoyu 
 * @version   
 * @since    JDK 1.7 
 * @see       
 */
@Repository
@Transactional(readOnly = true)
public class JpaCustomerDaoImpl implements CustomerDao {

	@PersistenceContext
	private EntityManager em;
	
	@Override
	@Transactional
	public Customer save(Customer customer) {
		if (customer.getId() != null) {
			em.persist(customer);
			return customer;
		} else {
			return em.merge(customer);
		}
	}

	@Override
	public Customer findByEmailAddress(EmailAddress emailAddress) {
		String sql = " select c from Customer c where c.emailAddress = :emailAddress";
		TypedQuery<Customer> query = em.createQuery(sql, Customer.class);
		query.setParameter("emailAddress", emailAddress);
		return query.getSingleResult();
	}

}
 