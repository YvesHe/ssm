package cn.com.yves.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import cn.com.yves.dao.UserMapper;
import cn.com.yves.pojo.User;
import cn.com.yves.service.IUserService;

@Service("userService")
public class UserServiceImpl implements IUserService {

	@Resource
	private UserMapper userDao;

	public User getUserById(int userId) {
		return this.userDao.selectByPrimaryKey(userId);
	}

}