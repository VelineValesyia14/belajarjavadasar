/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.belajarjavadasar.pertemuan14;
import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author Hype
 */
public class TodoListApp {
    public static void main(String[]args){
        ArrayList<String> tugas = new ArrayList<>();
        Scanner scan = new Scanner (System.in);
        int pilihan = 0;
        
        do {
            System.out.println("=== APLIKASI TO-DO LIST");
            System.out.println("1. Lihat Tugas");
            System.out.println("2. Tambah Tugas");
            System.out.println("3. Hapus Tugas");
            System.out.println("4. Keluar");
            System.out.print("PILIHAN : ");
            pilihan = scan.nextInt();
            scan.nextLine();
            
            switch(pilihan){
                case 1:
                    System.out.println("--- DAFTAR TUGAS ---");
                    if (tugas.isEmpty()){
                        System.out.println("BELUM ADA TUGAS '-' ");
                    }else{
                        for (int i = 0; i <tugas.size(); i++){
                            System.out.println((i+1)+". "+tugas.get(i));
                        }
                    }
                    break;
                case 2:
                    System.out.println("Masukkan tugas baru: ");
                    String tugasBaru = scan.nextLine();
                    tugas.add(tugasBaru);
                    System.out.println("TUGAS SUDAH BERHASIL DITAMBAHKAN, XOXO!");
                    break;
                case 3:
                    System.out.println("MASUKKAN NOMOR TUGAS YANG INGIN DI HAPUS :");
                    int hapusIndex = scan.nextInt();
                    if (hapusIndex > 0 && hapusIndex <= tugas.size()){
                        String removed = tugas.remove(hapusIndex-1);
                        System.out.println("Tugas '"+removed+"' Berhasil dihapus");
                    }else {
                        System.out.println("NOMOR TUGAS TIDAK VALID!");
                    }
                    break;
                case 4: 
                    System.out.println("SAYONARA!");
                    break;
                    
                default:
                    System.out.println("{Pilihan SALAH!");
            }
        }while (pilihan !=4);
        
        scan.close();
    }
}
