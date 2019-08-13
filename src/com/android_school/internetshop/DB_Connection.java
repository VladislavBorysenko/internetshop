package com.android_school.internetshop;

import java.sql.Connection;
import java.sql.DriverManager;

public class DB_Connection {
    private final String DRIVER_NAME = "com.mysql.jdbc.Driver";

    //url: 3306 - standard port for MySQL, crud - name of the DB, "username","password".
    private final String URL = "jdbc:mysql://localhost:3306/internetshop_db";
    private final String USERNAME = "root";
    private final String PASSWORD = "root";


    public static void main(String[] args) {
        System.out.println("Hello world");
        DB_Connection objectDBConnection = new DB_Connection();

        //Если соединение установлено, появится сообщение с соединением, иначе null
        System.out.println(objectDBConnection.getConnection());
    }


    public Connection getConnection() {
        Connection connection = null;
        try {
            Class.forName(DRIVER_NAME);//for MySQL database
            connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
        } catch (Exception e) {
            System.out.println(e);
        }
        return connection;
    }
}