/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.belajarjavadasar;
/**
 *
 * @author Hype
 */
public class RunLaptopn {
    public static void main (String[] args){
        Laptopn laptop1 = new Laptopn("ZenRock", "Rose Gold", 90000000);
        Laptopn laptop2 = new Laptopn("ARock", "Metalic", 89000000);
        
        System.out.println("=== Spek Laptop 1 ===");
        laptop1.tampilSpek();
        
        System.out.println("=== Spek Laptop 2 ===");
        laptop2.tampilSpek();
        
        int hargaDiskon = laptop1.diskon(10);
        System.out.println("Harga"+laptop1.merk+"menjadi"+hargaDiskon+"dengan potongan spesial!");
        
    }
}
