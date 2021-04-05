package com.xiangxue.jack.bean;

import org.springframework.stereotype.Service;

/**
 *
 *
 * @program: spring
 *
 * @description:
 *
 * @author: hqf
 *
 * @create: 2021-03-28 20:18
 **/
@Service
public class Stu {

	private String username = "jack";

	private String password;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
}
