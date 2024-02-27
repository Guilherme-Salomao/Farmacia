package br.com.alurasenac.farmacia.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class ConnectionFactory {
    public static void main(String[] args) {
        try {
            Connection connection = DriverManager
                    .getConnection("jdbc:mysql://localhost:3306/farmacia?user=root&password=");

            System.out.println("Recuperei a conexão");

            connection.close();
        } catch (SQLException e) {
            System.out.println(e);
        }
    }
}
