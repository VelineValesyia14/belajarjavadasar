/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.belajarjavadasar.pertemuan14;
import java.util.ArrayList;

/**
 *
 * @author Hype
 */
public class LoopArrayList {
    public static void main (String[]args){
        ArrayList<Integer> angka = new ArrayList<>();
        angka.add(10);
        angka.add(20);
        angka.add(30);
        
        System.out.println("=== LOOPING ANGKA === ");
        for (Integer num : angka){
            System.out.println("Angka :"+num);
        }
    }
}
