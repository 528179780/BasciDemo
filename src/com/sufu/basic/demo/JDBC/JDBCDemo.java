package com.sufu.basic.demo.JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * @author sufu
 * @date 2020/7/26
 */
public class JDBCDemo {
    public static void main(String[] args) {
        Connection con = null;
        PreparedStatement preparedStatement1 = null;
        PreparedStatement preparedStatement2 = null;
        try {
            con = DriverManager.getConnection("jdbc:mysql:///db", "root", "123456");
            con.setAutoCommit(false);
            String decrease = "update account set balance = balance - ? where id = ?";
            String increase = "update account set balance = balance + ? where id = ?";
            preparedStatement1 = con.prepareStatement(decrease);
            preparedStatement2 = con.prepareStatement(increase);
            // 设置替换SQL中？的内容 先减
            preparedStatement1.setInt(1, 500);
            preparedStatement1.setInt(2, 2);
            System.out.println(preparedStatement1);

            // 再加
            preparedStatement2.setInt(1, 500);
            preparedStatement2.setInt(2, 1);

            // 提交
            preparedStatement1.executeUpdate();
            // 模拟一个异常，检查代码是否会回滚
            int i = 3/0;
            preparedStatement2.executeUpdate();
            con.commit();

        } catch (Exception e) {
            if(con!=null){
                try {
                    con.rollback();
                    System.out.println("出现异常，回滚");
                } catch (SQLException ex) {
                    System.out.println("出现异常，且回滚失败，请手动处理。"+e.getMessage());
                    ex.printStackTrace();
                }
            }
            e.printStackTrace();
        }finally {
            if(null!=preparedStatement1){
                try {
                    preparedStatement1.close();
                } catch (SQLException throwables) {
                    System.out.println("关闭preparedStatement1失败");
                }
            }
            if(null!=preparedStatement2){
                try {
                    preparedStatement2.close();
                } catch (SQLException throwables) {
                    System.out.println("关闭preparedStatement2失败");
                }
            }
            if (con != null) {
                try {
                    con.close();
                } catch (SQLException throwables) {
                    System.out.println("关闭链接失败");
                    throwables.printStackTrace();
                }
            }
        }
    }
}
