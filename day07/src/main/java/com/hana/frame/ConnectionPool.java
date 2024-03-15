package com.hana.frame;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.ResourceBundle;

public class ConnectionPool {

    private List<Connection> connectionPool;
    private List<Connection> usedConnections = new ArrayList<>();
    private static int INITIAL_POOL_SIZE = 3;
    static ResourceBundle rb;
    static {
        rb = null;
        rb = ResourceBundle.getBundle("mysql", Locale.KOREA);
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("OK");
            System.out.println(rb.getString("url"));
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static ConnectionPool create() throws SQLException {

        String url = rb.getString("url");
        String user = rb.getString("user");
        String password = rb.getString("password");

        List<Connection> pool = new ArrayList<>(INITIAL_POOL_SIZE);
        for (int i = 0; i < INITIAL_POOL_SIZE; i++) {
            pool.add(createConnection(url, user, password));
        }
        return new ConnectionPool(pool);
    }

    public ConnectionPool(List<Connection> connectionPool) {
        this.connectionPool = connectionPool;
    }


    public Connection getConnection() {
        Connection connection = connectionPool
                .remove(connectionPool.size() - 1);
        usedConnections.add(connection);
        return connection;
    }

    public boolean releaseConnection(Connection connection) {
        connectionPool.add(connection);
        return usedConnections.remove(connection);
    }

    private static Connection createConnection(
            String url, String user, String password)
            throws SQLException {
        return DriverManager.getConnection(url, user, password);
    }

    public int getSize() {
        return connectionPool.size() + usedConnections.size();
    }
    public int getUseSize() {
        return connectionPool.size();
    }

}