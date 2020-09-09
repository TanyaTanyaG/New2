package jm.task.core.jdbc;
import jm.task.core.jdbc.model.User;
import jm.task.core.jdbc.util.Util;
import java.lang.Object;
import java.sql.*;

public class Main {
    public static void main(String[] args) throws SQLException {
        Util util = new Util ();
        String query = "select*from user";
        try {

            Statement statement;
            statement = Util.getConnection().createStatement();
            ResultSet  resultSet = statement.executeQuery(query);
            while (resultSet.next()) {
                User user = new User();
             user.setId(resultSet.getLong(1));
             user.setName(resultSet.getString(2));
             user.setLastName(resultSet.getString(3));
             user.setAge(resultSet.getByte(4));
             System.out.println(user);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
