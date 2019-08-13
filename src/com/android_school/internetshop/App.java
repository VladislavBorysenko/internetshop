package com.android_school.internetshop;

import com.android_school.internetshop.model.Product;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class App {

    public static final String TABLE_NAME = "product_tb";



    public static void main(String[] args) {
        // prepareStatemnt = zapros
        //Resoultset = rezultat

        //СRUD = Create, Read, Update, Delete

        //Read data from Table
        List<Product> productsList = createListFromTable();
        printList(productsList);


        //Create new data an save into Table


        //Read data from Table


        //Update some data from Table


        //Read data from Table


        //Delete some data


        //Read data from Table

    }

    public static void printList(List<Product> productList) {
        for (Product product : productList) {
            System.out.println(product);
        }
    }


    //Метод считывание записей с таблици
    public static List<Product> createListFromTable(){
        List<Product> productsList = new ArrayList<>();

        DB_Connection objectDBConnection = new DB_Connection();
        Connection connection = objectDBConnection.getConnection();

        PreparedStatement ps = null; //запрос
        ResultSet rs = null; //результат
        try {
            String query = "SELECT * FROM " + TABLE_NAME; //SELECT * FROM my_table
            ps = connection.prepareStatement(query);
            //System.out.println(ps);

            rs = ps.executeQuery();
            //System.out.println(rs);

            while (rs.next()) {

                int id = Integer.parseInt(rs.getString("id"));
                String title = rs.getString("title");
                int price = Integer.parseInt(rs.getString("price"));
                int quantity = Integer.parseInt(rs.getString("quantity"));
                String city = rs.getString("city");

                Product newProduct = new Product(id, title, price, quantity, city);
                productsList.add(newProduct);
            }

            connection.close();
        } catch (Exception e) {
            System.out.println(e);
        }

        return productsList;
    }
}