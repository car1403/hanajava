import org.example.ConnectionPool;

import java.sql.SQLException;

public class Main {
    public static void main(String[] args) {
        try {
            ConnectionPool cp = ConnectionPool.create();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}