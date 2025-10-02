package com.example.demo;

import java.sql.Connection;
import java.sql.DriverManager;

public class TestDB {
    public static void main(String[] args) throws Exception {
        String url = "jdbc:mysql://shortline.proxy.rlwy.net:48937/railway?useSSL=false&allowPublicKeyRetrieval=true&serverTimezone=UTC";
        String username = "root";
        String password = "dzkUScosfKsxNBNgwQAWIAvVaNVmoBVt";

        Connection conn = DriverManager.getConnection(url, username, password);
        System.out.println("Connected to DB!");
        conn.close();
    }
}
