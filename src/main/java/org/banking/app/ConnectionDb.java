package org.banking.app;

import java.sql.*;

public class ConnectionDb {

    private String jdbcUrl = "jdbc:postgresql://localhost:5432/bankapp";
    private String username = "raymond";
    private  String password = "12345678";
    Statement statement;
    public ConnectionDb() {
        try{
            Class.forName("org.postgresql.Driver");
            Connection connection = DriverManager.getConnection(jdbcUrl,username,password);
            statement = connection.createStatement();

        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }

    }
}
