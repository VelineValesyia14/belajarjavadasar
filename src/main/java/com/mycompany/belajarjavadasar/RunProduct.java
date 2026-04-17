/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.belajarjavadasar;

/**
 *
 * @author Hype
 */
public class RunProduct {
    public static void main(String[] args){
        Product p1 = new Product("Kimchi Goreng",85000.0, 10);
        System.out.println("==== info produk ====");
        System.out.println("Nama   :"+p1.getNamaProduk());
        System.out.println("Harga  :"+p1.getHarga());
        System.out.println("Stok   :"+p1.getStok());
        
        p1.tambahStok(5);
        System.out.println("Setelah tambah stok 5:"+p1.getStok());
        
        p1.kurangiStok(3);
        System.out.println("Setelah kurangi stok 3: "+p1.getStok());
        
        p1.kurangiStok(20);
        
        p1.setStock(50);
        System.out.println("Setelah setStock(50) : "+ p1.getStok());
    }
}
