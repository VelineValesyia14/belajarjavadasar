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
public class DemoArrayList {
    public static void main (String[]args){
        ArrayList<String> namaTeman = new ArrayList<>();
        
        namaTeman.add("Cahya");
        namaTeman.add("Caca");
        namaTeman.add("Fina");
        
        System.out.println("ISI ARRAYLIST :"+namaTeman);
        System.out.println("Data Index 0 :"+namaTeman.get(0));
        System.out.println("Data Index 2 :"+namaTeman.get(2));
        
        namaTeman.set(1, "Vale");
        System.out.println("Setelah diubah : "+ namaTeman);
        namaTeman.remove(0);
        System.out.println("Setelah dihapus: "+namaTeman);
        System.out.println("Jumlah data : "+namaTeman.size());
    }
}
