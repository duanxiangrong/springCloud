package com.duanxiangrong.spring.cloud.weather.repository;


import java.util.List;

import com.duanxiangrong.spring.cloud.weather.domain.User;

public interface UserRepository {
	
	/*
	 * 新增或者修改用户
	 * 
	 * @param user
	 * @return 
	 */
	User saveOrUpdateUser(User user);
	
	/*
	 * 删除用户
	 * 
	 * @param id
	 */
	void deleteUser(Long id);
	
	/*
	 * 根据用户id获取用户
	 * 
	 * @param id
	 * @return
	 */
	User getUserById(Long id);
	
	/*
	 * 获取所有用户列表
	 * 
	 * @return
	 */
	List<User> listUser();

}
