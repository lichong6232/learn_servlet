package cn.bupt.learn.service.impl;

import cn.bupt.learn.dao.UserDao;
import cn.bupt.learn.dao.UserDaoImpl;
import cn.bupt.learn.service.UserService;
import cn.bupt.learn.util.JdbcUtil;

/**
 * @Author: lichong04
 * @Date: Created in 下午11:18 2019/7/12
 */
public class UserServiceImpl implements UserService {

    private UserDao userDao = new UserDaoImpl();
    @Override
    public boolean login(String username, String password) {

        return userDao.getUserByUserNameAndPassword(username,password)!=null;
    }
}
