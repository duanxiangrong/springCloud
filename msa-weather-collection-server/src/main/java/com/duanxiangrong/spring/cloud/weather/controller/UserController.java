package com.duanxiangrong.spring.cloud.weather.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.duanxiangrong.spring.cloud.weather.domain.User;
import com.duanxiangrong.spring.cloud.weather.repository.UserRepository;

@RestController
@RequestMapping("/users")
public class UserController {

	@Autowired
	private UserRepository userRepository;
	
	/*
	 * 获取用户列表
	 * 
	 * @return 
	 */
	@GetMapping
	public List<User> getUsers() {
		return userRepository.listUser();
	}
	
	/*
	 * 获取用户信息
	 * 
	 * @param id
	 * @return 
	 */
	@GetMapping("/{id}")
	public User getUser(@PathVariable("id") Long id) {
		return userRepository.getUserById(id);
	}
	
	/*
	 * 保存用户
	 * 
	 * @param user
	 */
	@PostMapping()
	public User createUser(@RequestBody User user) {
		return userRepository.saveOrUpdateUser(user);
	}
	
	/*
	 * 修改用户
	 * 
	 * @param id
	 * @param user
	 */
	@PutMapping("/{id}")
	public void updateUser(@PathVariable("id") Long id, @RequestBody User user) {
		User oldUser = this.getUser(id);
		
		if(oldUser != null) {
			user.setId(id);
			userRepository.saveOrUpdateUser(user);
		}
	}
	
	/*
	 * 删除用户
	 * 
	 * @param id
	 * @return
	 */
	@DeleteMapping("/{id}")
	public void deleteUser(@PathVariable("id") Long id) {
		userRepository.deleteUser(id);
	}
	
}
