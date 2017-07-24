package com.hsbc.gltc.utilites.iUpload.service;


import com.hsbc.gltc.utilites.iUpload.entity.User;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Service;

/**
 * 
 */

@Service
public class UserService {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	public List<User> getList(){
		String sql = "SELECT ID,NAME,PASSWORD, AGE FROM USER";
		return (List<User>) jdbcTemplate.query(sql, new RowMapper<User>(){

			@Override
			public User mapRow(ResultSet rs, int rowNum) throws SQLException {
				User user = new User();
				user.setPassword(rs.getString("PASSWORD"));
				user.setAge(rs.getInt("AGE"));
				user.setName(rs.getString("NAME"));
				return user;
			}
			
		});
	}
	
	/*
    @Autowired
    private UserMapper userMapper;

    public User getUserInfo(){
        User user=userMapper.findUserInfo();
        //User user=null;
        return user;
    }
    */
    
    
    

}
