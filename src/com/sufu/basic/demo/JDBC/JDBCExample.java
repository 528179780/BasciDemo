package com.sufu.basic.demo.JDBC;

import java.sql.*;

/**
 * JDBC Demo
 * @author sufu
 * @date 2020/7/26
 */
public class JDBCExample {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        // 注册驱动 (新版本不用注册了)
        // Class.forName("com.mysql.cj.jdbc.Driver");
        // 获取数据库连接对象
        Connection con = DriverManager.getConnection("jdbc:mysql:///db", "root", "123456");
        // 定义SQL语句
        String SQL = "update account set age=23 where id =1";
        // 获取执行SQL的对象
        Statement statement = con.createStatement();
        // 执行语句
        int count = statement.executeUpdate(SQL);
        ResultSet resultSet = statement.executeQuery("select * from account");
        // 处理结果
        System.out.println(resultSet.toString());
        System.out.println(count);
        // 释放资源
        statement.close();
        con.close();
    }
}
