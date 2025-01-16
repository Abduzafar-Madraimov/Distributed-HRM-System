package dcoms;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBconnection {
    private static final String DB_URL = "jdbc:derby://localhost:1527/DCOMS";
    private static final String DB_USER = "DCOMSGG";
    private static final String DB_PASSWORD = "dcomsGG";

    public static Connection getConnection() {
        try {
            return DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
        } catch (SQLException e) {
            System.err.println("Database connection failed!");
            e.printStackTrace();
            return null;
        }
    }
}