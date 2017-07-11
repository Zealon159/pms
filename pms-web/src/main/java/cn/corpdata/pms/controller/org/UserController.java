package cn.corpdata.pms.controller.org;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import cn.corpdata.pms.service.org.impl.UserServiceImpl;
import cn.jpush.api.common.connection.IHttpClient.RequestMethod;


@RestController
@RequestMapping("/user")
public class UserController {
	private UserServiceImpl userService = new UserServiceImpl();
	
	@RequestMapping(method=RequestMethod.GET,name="/getJsonData/{keyword}",consumes="")
	public @ResponseBody String addUser(@PathVariable String keyword){
		//userService.addUser();
		return keyword;
	}
}
