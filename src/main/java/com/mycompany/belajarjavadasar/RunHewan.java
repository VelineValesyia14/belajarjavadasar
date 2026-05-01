/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.belajarjavadasar;

/**
 *
 * @author Hype
 */
public class RunHewan {
    public static void main(String[] args){
        Kucing kcg = new Kucing ("Milo");
        Anjing ajg = new Anjing ("Hachiko");
        System.out.println(" Nama :"+kcg.nama);
        kcg.bersuara();
        
        System.out.println("Nama :"+ajg.nama);
        ajg.bersuara();
        
        System.out.println("===== POLIMORFISME ========");
        Hewan[] hewanku = {kcg, ajg};
        for (Hewan h: hewanku){
            System.out.println(h.nama +": ");
            h.bersuara();
        }
    }
    
}
