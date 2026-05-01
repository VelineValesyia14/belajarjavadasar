/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.belajarjavadasar;
import java.util.Scanner;
/**
 *
 * @author Hype
 */
public class PerpustakaanMini {
    static String[] daftarBuku = {
        "Pasta Kacang Merah",
        "Laut Biru",
        "Cantik Itu Luka",
        "Negeri Para Bedebah",
        "Le Petit Prince"
    };
    
    static void tampilDaftarBuku(){
        System.out.println("DAFTAR BUKU PERPUSTAKAAN MINI VALE");
        for (int i=0; i < daftarBuku.length; i++){
            System.out.println((i+1)+". "+ daftarBuku[i]);
        }
            }
    static boolean cariBuku(String judul){
        for (int i=0; i < daftarBuku.length; i++){
            if (daftarBuku[i].equalsIgnoreCase(judul)){
                return true;
            }
        }
        return false;
    }
    
    public static void main (String[] args){
        Scanner scanner = new Scanner (System.in);
        tampilDaftarBuku();
        System.out.print("Masukkan judul buku yang dicari: ");
        String judulCari = scanner.nextLine();
        boolean diTemukan = cariBuku(judulCari);
        if (diTemukan){
            System.out.println("BUKU TERSEDIA!");
        } else {
            System.out.println("BUKU TIDAK DITEMUKAN"); 
        }
        scanner.close();
    }
    
}
