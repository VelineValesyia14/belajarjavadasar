/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.belajarjavadasar;

/**
 *
 * @author Hype
 */
public class RunBank {
    public static void main(String[] args){
        RekeningBank rek = new RekeningBank("2441048", 100000000);
        
        rek.tarik(500000);
        rek.setor(2000000);
        rek.tarik(200000);
        
        System.out.println("Saldo akhir anda :"+rek.getSaldo());
    }
}
