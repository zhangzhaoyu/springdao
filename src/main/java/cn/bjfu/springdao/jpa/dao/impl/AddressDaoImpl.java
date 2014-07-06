/** 
 * Project Name:springdao 
 * File Name:AddressDaoImpl.java 
 * Package Name:cn.bjfu.springdao.jpa.dao.impl 
 * Date:2014年7月3日 下午4:20:52 
 * Copyright (c) 2014, zhangzhaoyu0524@163.com All Rights Reserved. 
 * 
*/  
  
package cn.bjfu.springdao.jpa.dao.impl;  

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import cn.bjfu.springdao.jpa.dao.IAddressDao;
import cn.bjfu.springdao.jpa.domain.execise.AddressTwo;

/** 
 * ClassName:AddressDaoImpl <br/> 
 * Function: TODO ADD FUNCTION. <br/> 
 * Reason:   TODO ADD REASON. <br/> 
 * Date:     2014年7月3日 下午4:20:52 <br/> 
 * @author   zhangzhaoyu 
 * @version   
 * @since    JDK 1.7 
 * @see       
 */
@Repository
@Transactional
public class AddressDaoImpl implements IAddressDao {

	@PersistenceContext
	private EntityManager em;
	
	@Override
	public AddressTwo save(AddressTwo address) {
		if (address != null) {
			this.em.persist(address);
		}
		return address;
	}

	@Override
	public List<AddressTwo> findAll() {
		String jpql = "select a from Address a";
		TypedQuery<AddressTwo> list = this.em.createQuery(jpql, AddressTwo.class);
		return list.getResultList();
	}

	@Override
	public AddressTwo findById(Integer id) {
		return this.em.find(AddressTwo.class, id);
	}

}
 