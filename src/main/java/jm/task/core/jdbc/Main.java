package jm.task.core.jdbc;

import com.mysql.fabric.jdbc.FabricMySQLDriver;
import jm.task.core.jdbc.model.User;
import jm.task.core.jdbc.util.Util;
import sun.security.util.Password;

import java.sql.*;

public class Main {
    private static final String URL = "jdbc:mysql://localhost:3306";
    private static final String LoginName = "root";
    private  static final String Password = "rootroot";
    public static void main(String[] args) throws SQLException {
        Connection connection = null;
        Driver driver;
        try {
            driver = new FabricMySQLDriver();
}
        catch (SQLException ex){
            System.out.println("Произошла ошибка при создании драйвера");
            return;
        }
        try {
            DriverManager.registerDriver(driver);
        }
        catch (SQLException ex) {
            System.out.println ("Не удалось зарегистрировать драйвер!");
            return;
        }
        try {
            connection = DriverManager.getConnection(URL, LoginName, Password);
        }
catch (SQLException ex){
            System.out.println("Не удвлось создать соединение!");
            return;
}
finally {
            if (connection != null)
                connection.close();
        }

    }
}
