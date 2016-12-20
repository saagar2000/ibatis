package com.spring.ibatis;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface UserMapper {

	@Insert("insert into users(name) values(#{name})")
	void saveUser(User user);

	@Select("select name from users WHERE name=#{name}")
	List<User> findByName(String name);

}
