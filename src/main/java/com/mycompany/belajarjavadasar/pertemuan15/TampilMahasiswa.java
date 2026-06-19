/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.belajarjavadasar.pertemuan15;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Hype
 */
public class TampilMahasiswa {
    public static void main (String[] args){
        String sql = "SELECT * FROM tb_mhs";
        
        try {
            Connection conn = KoneksiDB.getConnetion();
            PreparedStatement pstmt = conn.prepareStatement(sql);
            
            ResultSet rs = pstmt.executeQuery();
            System.out.println("--- DATA MAHASISWA ---");
            System.out.println("NIM\t | Nama\t\t | IPK");
            System.out.println("-----------------------");
            
            while (rs.next()){
                String nim = rs.getString("nim");
                String nama = rs.getString("nama");
                double ipk = rs.getDouble("ipk");
                
                System.out.println(nim + "\t|" + nama + "\t|" + ipk);
            }
            
            rs.close();
            pstmt.close();
            conn.close();
            
        } catch (SQLException e){
            System.out.println("Error: " + e.getMessage());
        }
    }
}
