/** 
 * Project Name:springdao 
 * File Name:UserRepositoryCustomImpl.java 
 * Package Name:cn.bjfu.springdao.jpa.repository 
 * Date:2014年6月29日 下午5:40:49 
 * Copyright (c) 2014, zhangzhaoyu0524@163.com All Rights Reserved. 
 * 
*/  
  
package cn.bjfu.springdao.jpa.repository;  

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.NoRepositoryBean;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DataSourceUtils;
import org.springframework.stereotype.Repository;

import cn.bjfu.springdao.jpa.domain.User;

/** 
 * ClassName:UserRepositoryCustomImpl <br/> 
 * Function: TODO ADD FUNCTION. <br/> 
 * Reason:   TODO ADD REASON. <br/> 
 * Date:     2014年6月29日 下午5:40:49 <br/> 
 * @author   zhangzhaoyu 
 * @version   
 * @since    JDK 1.7 
 * @see       
 */
@Repository
public class UserRepositoryImpl implements UserRepositoryCustom {

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@Override
	public User findUserById(Integer id) {
		String sql = " SELECT * FROM user WHERE user_id = ? ";  
        return jdbcTemplate.queryForObject(sql, new Object[]{id},   
                BeanPropertyRowMapper.newInstance(User.class));  
	}

}
 