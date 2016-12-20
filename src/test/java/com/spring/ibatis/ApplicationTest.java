package com.spring.ibatis;

import static org.junit.Assert.assertNotNull;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(Application.class)
public class ApplicationTest
{
	@Autowired
	private UserMapper userMapper;

	@Test
	public void findByName() {
		List<User> users = userMapper.findByName("ibatis");
		assertNotNull(users);
	}

	@Test
	public void saveUser() {
		User user = new User();
		user.setName("ibatis");
		userMapper.saveUser(user);
	}
}
