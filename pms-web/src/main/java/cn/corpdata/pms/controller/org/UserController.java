package cn.corpdata.pms.controller.org;

import cn.corpdata.pms.service.org.impl.UserServiceImpl;

public class UserController {
	private UserServiceImpl userService = new UserServiceImpl();
	public String addUser(){
		userService.addUser(null);
		return "/addUser";
	}
}
