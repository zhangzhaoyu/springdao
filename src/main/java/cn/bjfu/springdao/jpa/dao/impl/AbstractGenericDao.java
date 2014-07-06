/** 
 * Project Name:springdao 
 * File Name:AbstractGenericDao.java 
 * Package Name:cn.bjfu.springdao.jpa.dao.impl 
 * Date:2014年6月29日 下午9:14:40 
 * Copyright (c) 2014, zhangzhaoyu0524@163.com All Rights Reserved. 
 * 
*/  
  
package cn.bjfu.springdao.jpa.dao.impl;  

import java.beans.IntrospectionException;
import java.beans.Introspector;
import java.beans.PropertyDescriptor;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import cn.bjfu.springdao.jpa.dao.IGenericDao;
import cn.bjfu.springdao.utils.Pagination;

/** 
 * ClassName:AbstractGenericDao <br/> 
 * Function: TODO ADD FUNCTION. <br/> 
 * Reason:   TODO ADD REASON. <br/> 
 * Date:     2014年6月29日 下午9:14:40 <br/> 
 * @author   zhangzhaoyu 
 * @version   
 * @since    JDK 1.7 
 * @see       
 */
public abstract class AbstractGenericDao<T> implements IGenericDao<T> {

	private Class<T> entityClass;
	
	@PersistenceContext
	private EntityManager em;
	
	public AbstractGenericDao(Class<T> entityClass) {
		this.entityClass = entityClass;
	}
	
	public EntityManager getEntityManager() {
		return this.em;
	}
	
	@Override
	public void insert(T t) {
		this.em.persist(t);
	}

	@Override
	public void delete(T t) {
		this.em.remove(t);
	}

	@Override
	public void update(T t) {
		this.em.merge(t);
	}

	@Override
	public T queryById(String id) {
		return this.em.find(entityClass, id);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<T> queryAll() {
		String hql = "select * from " + entityClass.getSimpleName();
		Query query = this.em.createQuery(hql);
		return query.getResultList();
	}

	@SuppressWarnings("unchecked")
	protected List<T> queryForObject(Map<String, Object> map) {
		String sql = convertSqlFromMap(map);
		Query query = this.em.createQuery(sql);
		return query.getResultList();
	}
	
	@Override
	public void executeSql(String sql) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<T> executeSql(String sql, Pagination<T> page) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<T> executeHql(String hql, Pagination<T> page) {
		// TODO Auto-generated method stub
		return null;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<T> findByPage(String hql, Object[] values, Pagination<T> page) {
		Query query = this.em.createQuery(hql);
		setQueryParams(query, values);
		page.setTotalRecord(query.getResultList().size());
		List<T> result = query.setFirstResult(page.getOffset())
				.setMaxResults(page.getPageSize()).getResultList();
		
		page.setDatas(result);
		return result;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<T> findByProperty(String hql, Object value) {
		String sql = convertSqlFromMap(new HashMap());
		Query query = this.em.createQuery(sql);
		query.setParameter(0, value);
		return query.getResultList();
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<T> findByCondition(Object condition, Object order, Pagination<T> page) {
		
		PropertyDescriptor props[] = null;
		if (condition != null){
			try {
				props = Introspector.getBeanInfo(condition.getClass(),Object.class).getPropertyDescriptors();
			} catch (IntrospectionException e) {
				e.printStackTrace();
			}
			if(props != null){
				String className = condition.getClass().getName();
				String hql = "from "+ className +" where 1 = 1 ";
				for (int i = 0; i < props.length; i++){
					String name = props[i].getName();
					String value;
					try {
						if(props[i].getReadMethod().invoke(condition) != null){
							value =  (props[i].getReadMethod().invoke(condition)).toString();
							if (value != null && !"".equals(value)){
								hql +=  " and " + name + " = '" + value + "'";
							}
						}
					} catch (IllegalArgumentException e) {
						e.printStackTrace();
					} catch (IllegalAccessException e){
						e.printStackTrace();
					} catch (InvocationTargetException e) {
						e.printStackTrace();
					}
				}
				Query query = this.em.createQuery(hql);
				if (page != null){
					page.setTotalRecord(query.getResultList().size());
					List<T> result =  query.setFirstResult(page.getOffset()).setMaxResults(page.getPageSize()).getResultList();
					return result;
				}else{
					return query.getResultList();
				}
			}
		}
		return null;
	}
	
	private void setQueryParams(Query query, Object[] params) {  
        if (null == params) {  
            return;  
        }
        for (int i = 0; i < params.length; i++) {  
            query.setParameter(i, params[i]);  
        }
	}
	
	private String convertSqlFromMap(Map<String, Object> map) {
		String sql = "select * from " + this.entityClass.getSimpleName() + " where 1 = 1 ";
		StringBuilder builder = new StringBuilder(sql);
		Set<String> set = map.keySet();
		
		for (String key : set) {
			builder.append("AND " + key +" = " + map.get(key));
		}
		
		return builder.toString();
	}
}
 