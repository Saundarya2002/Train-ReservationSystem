/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.onlinereservationsystem;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author saundarya
 */
public class Connector {
    public static Connection getConnection() throws Exception{
        Class.forName("com.mysql.jdbc.Driver");
        Connection cn=(Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/mysql","root","");
        return cn;
    }
    
}
