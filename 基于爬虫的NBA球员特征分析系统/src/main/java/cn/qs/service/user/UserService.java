package cn.qs.service.user;

import java.util.List;
import java.util.Map;

import cn.qs.bean.User;

public interface UserService {

	/**
	 * 根据接口查询所用的用户
	 */
	public List<User> findAllUser();
	
	public User findUserByUsername(String username);

	public void addUser(User user);

	public List<User> getUsers(Map condition);

	public void deleteUser(String userId);

	public User getUser(String userId);

	public void updateUser(User user);

	public User getUserByUserNameAndPassword(String username, String password);
}
