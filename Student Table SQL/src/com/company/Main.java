package com.company;

import java.sql.*;

public class Main {
    static final String DB_URL = "jdbc:sql://localhost/sqlserver";
    static final String USER = "sa";
    static final String PASS = "sqlserver";
    static final String QUERY = "SELECT id, name, dept FROM Employee";

    public static void main(String[] args) {
        // Open a connection
        try(Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
            Statement stmt = conn.createStatement();
        ) {
            String sql = "INSERT INTO Employee VALUES (6, 'Jatin Rathi', 'Commerce')";
            String del = "DELETE FROM Employee WHERE id = 38";
            stmt.executeUpdate(sql);
            stmt.executeUpdate(del);
            ResultSet rs = stmt.executeQuery(QUERY);
            while(rs.next()){
                //Display values
                System.out.print("ID: " + rs.getInt("id"));
                System.out.print(", Name: " + rs.getInt("name"));
                System.out.print(", Department: " + rs.getString("dept"));
            }
            rs.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}