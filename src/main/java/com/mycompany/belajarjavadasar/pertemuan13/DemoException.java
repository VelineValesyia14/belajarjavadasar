/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.belajarjavadasar.pertemuan13;

/**
 *
 * @author Hype
 */
public class DemoException {
    public static void main(String[]args){
        int a1 = 10;
        int a2 = 0;
        
        System.out.println("Program dimulai...");
        
        try{
            int hasil = a1/a2;
            System.out.println("Hasil Pembagian: "+hasil);
        } catch (ArithmeticException e){
            System.out.println("Error : TIDAK DAPAT MEMBAGI DENGAN ANGKA NOL (0)!");
        }
        System.out.println("PROGRAM SELESAI.");
    }
    
}
