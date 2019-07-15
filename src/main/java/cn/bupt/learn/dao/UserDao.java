package cn.bupt.learn.dao;

import cn.bupt.learn.model.User;

/**
 * @Author: lichong04
 * @Date: Created in 下午11:15 2019/7/12
 */
public interface UserDao {

    /**
     * 根据用户名和密码查询用户
     * @param userName
     * @param password
     * @return
     */
    User getUserByUserNameAndPassword(String userName,String password);
}
