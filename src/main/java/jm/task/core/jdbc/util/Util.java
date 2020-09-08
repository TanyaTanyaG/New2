package jm.task.core.jdbc.util;
import java.sql.Connection;
import java.sql.SQLException;

@SuppressWarnings("ALL")
public class Util {
    public Util() throws SQLException {
        String URL = "jdbc:mysql://localhost:3306";
        String loginName = "root";
        String password = "rootroot";
    }

    public static Connection getConnection() {
        return getConnection();
    }

}
