package com.mycompany.belajarjavadasar;

/**
 *
 * @author Hype
 */
public class DemoArray {
    public static void main (String[] args){
        String[] namaBuah ={"Apel","Jeruk", "Mangga"};
        System.out.println("Buah Pertama :" +namaBuah[0]); //Apell
        System.out.println("Buah Kedua   :" +namaBuah[1]); //Jeruk
        System.out.println("Buah ketig   :" +namaBuah[2]); //Mangga
        
        namaBuah[1] = "Nanas"; 
        System.out.println("Buah Kedua (Setelah diubah):"+ namaBuah[1]);
        System.out.println("Jumlah Buah :"+ namaBuah.length); // 
    }
   
}
