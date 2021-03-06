package pl.itacademy.repository;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.DriverManager;
import java.util.Properties;

public class ConnectionManager {
    private String url;
    private String user;
    private String password;

    public Connection getConnection() throws SQLException, IOException {
        ClassLoader classloader = Thread.currentThread().getContextClassLoader();
        try(InputStream is = classloader.getResourceAsStream("db.properties")) {
            Properties properties = new Properties();
            properties.load(is);
            url = properties.getProperty("url");
            user = properties.getProperty("user");
            password = properties.getProperty("password");
        }
//        try (Connection connection = DriverManager.getConnection(url, user, password)) {
//            return connection;
//        }
        return DriverManager.getConnection(url, user, password);
    }
}
