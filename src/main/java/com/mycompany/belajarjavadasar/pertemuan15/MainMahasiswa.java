/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.belajarjavadasar.pertemuan15;
import java.util.Scanner;
import java.util.List;

/**
 *
 * @author Hype
 */
public class MainMahasiswa {
    public static void main (String[] args){
        
        MahasiswaDAO dao = new MahasiswaDAO();
        System.out.println("=======================================");
        System.out.println("    MENYIMPAN DATA MAHASISWA    ");
        System.out.println("=======================================");
        
        dao.insert(new Mahasiswa("2441041", "Maddie Cameron", 3.78));
        dao.insert(new Mahasiswa("2441039", "Ya HaBBIe", 3.67));
        dao.insert(new Mahasiswa("2441037", "Ainun", 3.89));
        
        System.out.println();
        System.out.println("========================================");
        System.out.println("       DAFTAR LENGKAP MAHASISWA");
        System.out.println("========================================");
        System.out.println("NIM\t\t| NAMA\t\t\t| IPK");
        System.out.println("========================================");
        
        List <Mahasiswa> daftarMahasiswa = dao.getAll();
        if (daftarMahasiswa.isEmpty()){
            System.out.println("BELUM ADA DATA MAHASISWA, SILAHKAN ISI TERLEBIH DAHULU");
        }else{
            for (Mahasiswa m : daftarMahasiswa){
                System.out.println(m.getNim()+ "\t|" + m.getNama()+ "\t\t|" +m.getIpk());
            }
            System.out.println("========================================");
            System.out.println("Total Mahasiswa = " + daftarMahasiswa.size());
        }
    }
}
