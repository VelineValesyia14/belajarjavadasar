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
public class InputArray {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Berapa banyak data yang mau disimpan?");
        int jumlah = scan.nextInt();
        
        int[] data = new int[jumlah];
        for (int i=0; i<jumlah; i++){
            System.out.print("masukkan data ke-" + (i + 1) + ":");
            data[i] = scan.nextInt();
        }
        
        System.out.println("\n -- Data yang Tersimpan ---");
        for (int i=0; i < jumlah; i++){
            System.out.println("Data[" +i+"]="+data[i]);
        }
        scan.close();
                
    }
    
    
}
