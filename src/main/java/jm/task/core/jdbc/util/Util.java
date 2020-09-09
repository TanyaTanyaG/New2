package jm.task.core.jdbc.util;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Util {
    private final String URL = "jdbc:mysql://localhost:3306";
    private final String LoginName = "root";
    private final String Password = "rootroot";
    public Util() throws SQLException {
        try (Connection connection = DriverManager.getConnection(URL, LoginName, Password)) {
        }
    }
    private static Connection getConnection(String driver, String url, String loginName, String password) {
        final Connection connection = getConnection();
        return connection;
    }

    private static Connection getConnection() {
        return getConnection();
    }

}
