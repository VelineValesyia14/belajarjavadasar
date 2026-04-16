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
public class NilaiMahasiswa {
    public static void main (String[] args){
        Scanner scan = new Scanner (System.in);
        int jumlahMahasiswa = 2;
        int jumlahMapel = 3;
        
        int[][] nilai = new int[jumlahMahasiswa][jumlahMapel];
        for (int i = 0; i < jumlahMahasiswa; i++){
         System.out.println("--- input data mahasiswa ke-" + (i+1)+" ---");
         for (int j = 0; j < jumlahMapel; j++){
             System.out.print("Masukan nilai mapel ke-"+(j+1)+": ");
             nilai[i][j] = scan.nextInt();
         }
        }
        
        System.out.println("\n=========================");
        System.out.println("\n  LAPORAN NILAI SISWA ");
        System.out.println("\n=========================");
        
        for (int i=0; i <jumlahMahasiswa; i++){
            int total = 0;
            System.out.print("Siswa"+(i+1)+": ");
            
            for (int j = 0; j <jumlahMapel; j++){
                System.out.println(nilai[i][j]+ " | ");
                total += nilai[i][j];
            }
            
            double rata = (double) total / jumlahMapel;
            System.out.println("rata-rata : "+ rata);
        }
        
        scan.close();
    }
}
