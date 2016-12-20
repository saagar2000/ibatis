package com.spring.ibatis;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(Application.class)
public class ApplicationTest {
	@Autowired
	private UserMapper userMapper;

	@Test
	public void findByName() {
		User user = userMapper.findByName("ibatis");
		assertNotNull(user);
	}

	@Test
	public void saveUser() {
		User user = new User();
		user.setName("ibatis");
		userMapper.saveUser(user);
	}
}
