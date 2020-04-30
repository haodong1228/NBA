package cn.qs.service.impl.user;

import java.util.List;
import java.util.Map;

import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.collections.MapUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


import cn.qs.bean.User;
import cn.qs.bean.UserExample;
import cn.qs.bean.UserExample.Criteria;
import cn.qs.mapper.UserMapper;
import cn.qs.service.user.UserService;
import cn.qs.utils.MD5Util;

@Service
@Transactional
public class UserServiceImpl implements UserService {

	@Autowired
	private UserMapper userMapper;

	public List<User> findAllUser() {
		UserExample userExample = new UserExample();
		List<User> list = userMapper.selectByExample(userExample);
		return list;
	}

	@Override
	public void addUser(User user) {
		userMapper.insert(user);
	}

	@Override
	public List<User> getUsers(Map condition) {
		UserExample userExample = new UserExample();
		if (StringUtils.isNotBlank(MapUtils.getString(condition, "code"))) {
			Criteria createCriteria = userExample.createCriteria();
			createCriteria.andCodeLike("%" + MapUtils.getString(condition, "code") + "%");
		}
		List<User> list = userMapper.selectByExample(userExample);
		return list;
	}

	@Override
	public void deleteUser(String id) {
		userMapper.deleteByPrimaryKey(id);
	}

	

	

	@Override
	public User getUserByUserNameAndPassword(String username, String password) {
		UserExample userExample = new UserExample();
		Criteria createCriteria = userExample.createCriteria();
		createCriteria.andCodeEqualTo(username);
		createCriteria.andPwdEqualTo(MD5Util.md5(password, ""));

		List<User> selectByExample = userMapper.selectByExample(userExample);
		if (CollectionUtils.isNotEmpty(selectByExample)) {
			return selectByExample.get(0);
		}

		return null;
	}

	@Override
	public User findUserByUsername(String code) {
		UserExample userExample = new UserExample();
		Criteria createCriteria = userExample.createCriteria();
		createCriteria.andCodeEqualTo(code);

		List<User> users = userMapper.selectByExample(userExample);
		if (CollectionUtils.isEmpty(users)) {
			return null;
		}

		return users.get(0);
	}

	@Override
	public User getUser(String id) {
		
		return userMapper.selectByPrimaryKey(id);
	}

	@Override
	public void updateUser(User user) {
		// TODO Auto-generated method stub
		userMapper.updateByPrimaryKey(user);
	}
}
