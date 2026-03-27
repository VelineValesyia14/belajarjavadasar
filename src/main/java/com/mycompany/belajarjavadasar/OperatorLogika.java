package com.mycompany.belajarjavadasar;

import java.util.Scanner;
         
/**
 *
 * @author Hype
 */
public class OperatorLogika {
    public static void main (String[] args){
        Scanner Scan = new Scanner(System.in);
        
        int umur, pengalaman;
        
        System.out.print("Masukkan umur:");
        umur = Scan.nextInt();
        
        System.out.print("Masukkan Lama Pengalaman (Tahun):");
        pengalaman = Scan.nextInt();
        
        //Logika And (&&)
        //Hasil keduanya harus true
        boolean lolos = (umur >= 20) && (pengalaman >= 2);
        
        System.out.println("-------------");
        System.out.println("Status kelulusan :"+lolos);
        
        //Logika OR
        //jika syarat di longgarkan : cukup umur atau pengalaman lama 
        boolean lolosAlternatif = (umur>=30) || (pengalaman >= 5);
        System.out.println("Lolos Alternatif?" + lolosAlternatif);
        
        Scan.close();
       
    }
}
