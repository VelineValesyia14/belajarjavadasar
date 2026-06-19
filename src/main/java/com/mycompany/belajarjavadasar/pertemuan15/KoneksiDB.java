/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.belajarjavadasar.pertemuan15;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
    
/**
 *
 * @author Hype
 */
public class KoneksiDB {
    
    private static final String URL = "jdbc:mysql://127.0.0.1:3306/db_mahasiswa";
    private static final String USER = "root";
    private static final String PASS = "";
    
    public static Connection getConnetion(){
        Connection conn = null;
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection(URL,USER,PASS);
            System.out.println("Connection succesed fulled!");
        } catch (ClassNotFoundException e) {
            System.out.println("Error : Cek library JAR");
        } catch (SQLException e){
            System.out.println("Error : Cek URL/USER/PASS di mysql");
        }
        return conn;
    }
}
