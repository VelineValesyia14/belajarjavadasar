/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.belajarjavadasar.pertemuan14.latihan;
import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author Hype
 */
public class ManajemenKontak {
    static ArrayList<kontak> daftarKontak = new ArrayList<>();
    static Scanner scan = new Scanner(System.in);
    
    public static void main (String[]args){
        int pilihan;
        
        System.out.println("===================================");
        System.out.println("     PROGRAM MANAJEMEN KONTAK    ");
        System.out.println("===================================");
        
        do {
            tampilMenu();
            System.out.println("Pilih menu :");
            pilihan = scan.nextInt();
            scan.nextLine();
            System.out.println();
            
            switch(pilihan){
                case 1 -> tambahKontak();
                case 2 -> cariKontak();
                case 3 -> hapusKontak();
                case 4 -> tampilSemuaKontak();
                case 0 -> System.out.println("TERIMA KASIH SUDAH MENGGUNAKAN PROGRAM! ");
                default -> System.out.println("Ooops, Menu tidak tersedia, silahkan coba pilih ulang '-'");
            }
        } while (pilihan !=0);
        scan.close();
    }
    
    static void tampilMenu(){
        System.out.println("------------------------------------");
        System.out.println("1. Tambah Kontak");
        System.out.println("2. Cari Kontak");
        System.out.println("3. Hapus Kontak");
        System.out.println("4. Tampilkan Semua Kontak");
        System.out.println("0. Keluar");
        System.out.println("------------------------------------");
    }
    static void tambahKontak(){
        System.out.println("=== TAMBAHKAN KONTAK ===");
        System.out.println("Nama    : ");
        String nama = scan.nextLine();
        System.out.println("Nomor   : ");
        String nomor = scan.nextLine();
        
        daftarKontak.add(new kontak(nama, nomor));
        System.out.println("KONTAK" + nama + "BERHASIL DITAMBAHKAN 0-0! ");
    }
    
    static void cariKontak(){
        System.out.println("=== CARI KONTAK ===");
        System.out.println("Masukkan Nama Kontak yang Dicari : ");
        String keyword = scan.nextLine().toLowerCase();
        boolean ditemukan = false;
        for (kontak k:daftarKontak){
            if (k.getNama().toLowerCase().contains(keyword)){
                System.out.println("Kontak DITEMUKAN !");
                k.tampilInfo();
                ditemukan = true;
            }
        }
        if (!ditemukan){
            System.out.println("KONTAK DENGAN NAMA " + keyword + "TIDAK DITEMUKAN.");
        }
        System.out.println();
    }
    static void hapusKontak(){
        System.out.println("=== HAPUS KONTAK === ");
        System.out.println("Masukkan Nama Kontak yang ingin dihapus :");
        String keyword = scan.nextLine().toLowerCase();
        boolean ditemukan = false;
        for(int i=0; i<daftarKontak.size(); i++){
            if (daftarKontak.get(i).getNama().toLowerCase().equals(keyword)){
                System.out.println("KONTAK" + daftarKontak.get(i).getNama() + "BERHASIL DITEMUKAN");
                daftarKontak.remove(i);
                ditemukan = true;
                break;
            }
        }
        if (!ditemukan){
            System.out.println("KONTAK DENGAN NAMA" +keyword+ "TIDAK DITEMUKAN");
        }
        System.out.println();
    }
    static void tampilSemuaKontak(){
        System.out.println("=== DAFTAR SELURUH KONTAK ===");
        if (daftarKontak.isEmpty()){
            System.out.println("BELUM ADA KONTAK TERSIMPAN");
            return;
        }
        System.out.println("Total Kontak : "+daftarKontak.size());
        System.out.println("-------------------------------------");
        for(int i=0; i<daftarKontak.size(); i++){
            System.out.println("KONTAK KE-"+(i+1)+":");
            daftarKontak.get(i).tampilInfo();
            System.out.println("-----------------------------------");
    }
        System.out.println();
    }
}
