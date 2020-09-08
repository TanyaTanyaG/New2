package jm.task.core.jdbc;

import jm.task.core.jdbc.model.User;
import jm.task.core.jdbc.util.Util;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

@SuppressWarnings("ALL")
public class Main {
    public static void main(String[] args) throws SQLException {
        try {
            new Util();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        String query = "select*from user";


            Statement statement= Util.getConnection().createStatement();
            ResultSet  resultSet = statement.executeQuery(query);
            while (resultSet.next()) {
                User user = new User();
             user.setId(resultSet.getLong(1));
             user.setName(resultSet.getString(2));
             user.setLastName(resultSet.getString(3));
             user.setAge(resultSet.getByte(4));
             System.out.println(user);
            }

        }
    }

