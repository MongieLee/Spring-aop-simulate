package cn.mjl;
import org.junit.Test;

import java.sql.*;
import java.util.Objects;

public class SQLTest {
    @Test
    public void testConnection() {
        Connection connection = null;
        Statement statement = null;
        try {
            Object
            Driver driver = new com.mysql.cj.jdbc.Driver();
            DriverManager.registerDriver(driver);
            String url = "jdbc:mysql://localhost:3306/testDb";
            String user = "root";
            String password = "12345678";
            connection = DriverManager.getConnection(url, user, password);
            statement = connection.createStatement();
//            String sql = "insert into t_user(username,age,gender) values ('tony',10,1)";
            String sql = "select version()";
            ResultSet i = statement.executeQuery(sql);
            System.out.println(i);
//            if(i > 0){
//                System.out.println("插入成功");
//            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            if (Objects.nonNull(statement)) {
                try {
                    statement.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if (Objects.nonNull(connection)) {
                try {
                    connection.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            System.out.println("testConnection");
        }

    }
}
