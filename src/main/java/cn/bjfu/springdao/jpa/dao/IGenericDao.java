/** 
 * Project Name:springdao 
 * File Name:IGenericDao.java 
 * Package Name:cn.bjfu.springdao.hibernate.dao 
 * Date:2014年6月20日 下午4:28:36 
 * Copyright (c) 2014, zhangzhaoyu0524@163.com All Rights Reserved. 
 * 
*/  
  
package cn.bjfu.springdao.jpa.dao;  

import java.util.List;
import cn.bjfu.springdao.utils.Pagination;
/** 
 * ClassName:IGenericDao <br/> 
 * Function: IGenericDao. <br/> 
 * Reason:   IGenericDao. <br/> 
 * Date:     2014年6月20日 下午4:28:36 <br/> 
 * @author   zhangzhaoyu 
 * @version   
 * @since    JDK 1.7 
 * @see       
 */
public interface IGenericDao<T> {
	void insert(T t);
	void delete(T t);
	void update(T t);
	T queryById(String id);
	List<T> queryAll();
	void executeSql(final String sql);
	List<T> executeSql(final String sql, final Pagination<T> page);
	List<T> executeHql(final String hql, final Pagination<T> page);
	List<T> findByPage(final String hql, final Object[] values, final Pagination<T> page);
	List<T> findByProperty(final String hql, final Object value);
	List<T> findByCondition(final Object condition, final Object order, final Pagination<T> page);
}
 