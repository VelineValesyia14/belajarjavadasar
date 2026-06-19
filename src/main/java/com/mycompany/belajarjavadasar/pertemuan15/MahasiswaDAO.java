/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.belajarjavadasar.pertemuan15;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Hype
 */
public class MahasiswaDAO {
    public void insert (Mahasiswa m){
        String sql = "INSERT INTO tb_mhs (nim, nama, ipk) VALUES (?, ?, ?)";
        
        try{
            Connection conn = KoneksiDB.getConnetion();
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, m.getNim());
            pstmt.setString(2, m.getNama());
            pstmt.setDouble(3, m.getIpk());
            
            int rowsAffected = pstmt.executeUpdate();
            if (rowsAffected > 0){
                System.out.println("Data Mahasiswa" +m.getNama()+"Berhasil di simpan");
            }else{
                System.out.println("GAGAL MENYIMPAN DATA");
            }
            pstmt.close();
            conn.close();
        } catch (SQLException e) {
            System.out.println("ERROR SQL : " + e.getMessage());
        }
    }
    public List<Mahasiswa> getAll(){
        List<Mahasiswa> daftarMahasiswa = new ArrayList<>();
        String sql = "SELECT * FROM tb_mhs";
        
        try {
            Connection conn = KoneksiDB.getConnetion();
            PreparedStatement pstmt = conn.prepareStatement(sql);
            ResultSet rs = pstmt.executeQuery();
            
            while (rs.next()){
                String nim = rs.getString("nim");
                String nama = rs.getString("nama");
                double ipk = rs.getDouble("ipk");
                daftarMahasiswa.add(new Mahasiswa(nim,nama,ipk));
            }
            rs.close();
            pstmt.close();
            conn.close();
        }catch (SQLException e) {
            System.out.println("ERROR SQL : " + e.getMessage());
        }
        return daftarMahasiswa;
    }
}
