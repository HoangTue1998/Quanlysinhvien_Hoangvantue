/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Database;

import java.sql.Connection;
import java.sql.DriverManager;


public class DatabaseHelper {

    private static String user = "HoangTue";
    private static String pass = "hoangtue1998";
    private static String url = "jdbc:sqlserver://DESKTOP-71LD6R6\\SQLEXPRESS:1433;databaseName=";

    public static Connection getConnection(String databaseName) {
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            Connection conn = DriverManager.getConnection(url + databaseName, user, pass);
            return conn;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public static void main(String[] args) {
        Connection conn = getConnection("");
        if (conn == null) {
            System.out.println("fail");
        }
    }
}
