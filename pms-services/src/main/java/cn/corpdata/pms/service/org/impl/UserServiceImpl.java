package cn.corpdata.pms.service.org.impl;

import cn.corpdata.pms.model.org.User;
import cn.corpdata.pms.service.org.UserService;
import cn.corpdata.utils.StringUtil;

public class UserServiceImpl implements UserService {

	public int addUser(User user) {
		// TODO Auto-generated method stub
		System.out.println(StringUtil.toLower(user.getUserId()));
		return 0;
	}

}
