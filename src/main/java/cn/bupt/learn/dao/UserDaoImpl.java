package cn.bupt.learn.dao;

import cn.bupt.learn.model.User;
import cn.bupt.learn.util.JdbcUtil;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * @Author: lichong04
 * @Date: Created in 下午11:22 2019/7/12
 */
public class UserDaoImpl implements UserDao {

    private static Connection connection = JdbcUtil.getConnection();

    
    @Override
    public User getUserByUserNameAndPassword(String userName, String password) {
        User user = new User();
        try {
            Statement statement = connection.createStatement();
            String querySql = "select * from user where username = '"+userName+"' and password ='"+password+"'";
            ResultSet resultSet = statement.executeQuery(querySql);
            while (resultSet.next()){
                user.setId(resultSet.getInt("id"));
                user.setUserName(resultSet.getString("username"));
                user.setPassword(resultSet.getString("password"));
                return user;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return null;
    }
}
