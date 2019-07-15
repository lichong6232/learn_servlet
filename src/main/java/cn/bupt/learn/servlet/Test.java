package cn.bupt.learn.servlet;

import cn.bupt.learn.util.JdbcUtil;

import java.sql.Connection;

/**
 * @Author: lichong04
 * @Date: Created in 下午11:51 2019/7/12
 */
public class Test {

    public static void main(String[] args) {
        Connection connection = JdbcUtil.getConnection();
        System.out.println(connection);
    }
}
