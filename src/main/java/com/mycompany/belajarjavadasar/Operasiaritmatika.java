public class Operasiaritmatika {
    public static void main (String[] args){
        int a = 10;
        int b = 3;
        
        System.out.println("Nilai a ="+a);
        System.out.println("Nilai b ="+b);
        System.out.println("-------------");
        
        //penjumlahan 
        System.out.println("a + b =" + (a+b));
        
        //pengurangan
         System.out.println("a - b =" + (a-b));
         
        //perkalian 
         System.out.println("a * b =" + (a*b));
        
        //pembagian (hasil integer)
         System.out.println("a / b =" + (a/b));
        
        // modulus (sisa bagi)
        System.out.println("a % b =" + (a%b));
        
        // jika ingin hasil pembagian desimal 
        double hasilBagi = (double) a / b; //casting 
        System.out.println("a / b (desimal)=" + hasilBagi);
    }
    
}
