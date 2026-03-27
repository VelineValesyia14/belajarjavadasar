/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.belajarjavadasar;

/**
 *
 * @author Hype
 */
import java.util.Scanner;

public class Belajarjavadasar {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        String nama; 
        String nim;
        double tb;
        double bb;
       
        
        
        System.out.print("Masukkan Nama Anda:");
        nama = input.nextLine();
        
        System.out.print("Masukkan NIM Anda:"); 
        nim = input.nextLine();
        
        System.out.print("Masukkan Tinggi Badan (TB) Anda:");
        tb = input.nextDouble();
        
        System.out.print("Masukkan Berat Badan (BB) Anda:");
        bb = input.nextDouble();
        
        System.out.println("----------------------");
        System.out.println("    HASIL OUTPUT");
        System.out.println("----------------------");
        System.out.println("Nama :"+nama);
        System.out.println("NIM  :"+nim);
        System.out.println("TB   :"+tb);
        System.out.println("BB   :"+bb);
 
    }
} 
