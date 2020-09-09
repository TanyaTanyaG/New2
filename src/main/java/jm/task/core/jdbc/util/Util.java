package jm.task.core.jdbc.util;

import java.lang.reflect.InvocationTargetException;
import java.sql.Connection;
import java.sql.SQLException;

public class Util {
    public static Connection getConnection() {
        return null;
    }

    public Object Util() throws SQLException {
        try {
            final String URL = "jdbc:mysql://localhost:3306";
            final String LoginName = "root";
            final String Password = "rootroot";
            try {
                Class.forName("com.mysql.cj.jdbc.Driver").getDeclaredConstructor().newInstance();
            } catch (InstantiationException e) {
                e.printStackTrace();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            } catch (InvocationTargetException e) {
                e.printStackTrace();
            } catch (NoSuchMethodException e) {
                e.printStackTrace();
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }

            System.out.println("Connection to Store DB succesfull!");

        } finally {

        }


        return null;
    }
}




