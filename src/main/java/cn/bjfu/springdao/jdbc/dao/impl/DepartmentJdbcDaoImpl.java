/** 
 * Project Name:springdao 
 * File Name:DepartmentJdbcDaoImpl.java 
 * Package Name:cn.bjfu.springdao.jdbc.dao.impl 
 * Date:2014年7月7日 上午9:29:26 
 * Copyright (c) 2014, zhangzhaoyu0524@163.com All Rights Reserved. 
 * 
*/  
  
package cn.bjfu.springdao.jdbc.dao.impl;  

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import cn.bjfu.springdao.jdbc.dao.IDepartmentJdbcDao;
import cn.bjfu.springdao.jpa.domain.execise.Department;

/** 
 * ClassName:DepartmentJdbcDaoImpl <br/> 
 * Function: TODO ADD FUNCTION. <br/> 
 * Reason:   TODO ADD REASON. <br/> 
 * Date:     2014年7月7日 上午9:29:26 <br/> 
 * @author   zhangzhaoyu 
 * @version   
 * @since    JDK 1.7 
 * @see       
 */
@Repository
public class DepartmentJdbcDaoImpl implements IDepartmentJdbcDao {

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@Override
	public Department findById(int id) {
		String sql = " select * from department where id = ? ";
		return this.jdbcTemplate.queryForObject(sql, new Object[]{id}, new int[] {java.sql.Types.INTEGER},
				 BeanPropertyRowMapper.newInstance(Department.class));  
		
	}

	@Override
	public List<Department> findAll() {
		String sql = " select * from department ";
		return this.jdbcTemplate.query(sql, new RowMapper<Department>() {
			@Override
			public Department mapRow(ResultSet rs, int index)
					throws SQLException {
				Department dep = new Department();
				dep.setId(rs.getInt("id"));
				dep.setName(rs.getString("name"));
				return dep;
			}});
	}
}
 