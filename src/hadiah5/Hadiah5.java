
package hadiah5;
import java.util.Scanner;

public class Hadiah5 {

    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        //array
        String[] makanan = {"Mie Goreng","Mie Kuah","Nasi Goreng"};
        int [] harga= {7000,8000,10000};
        
        System.out.println("Silahkan datang di The Pir");
        System.out.println("Menu Harga");
        
        //perulangan
        for (int i = 0;i < harga.length; i++ ){
            System.out.println(i+"."+makanan[i]+" => "+ harga[i]);
           
        }
        
        //scanner
        System.out.println("Silahkan pilih menu berikut");
        
        int pilihan = input.nextInt();
        System.out.println("Masukkan pilihan anda: "+makanan[pilihan]);
        
        // percabangan
        System.out.println("Silahkan Masukkan uanga anda: ");
        int uang = input.nextInt();
        
        if (uang > harga[pilihan]){
           System.out.println("Kembalian "+(uang - harga[pilihan]));
       }else if (uang == harga[pilihan]){
           System.out.println("Uang anda pas maka silahkan menikmati makanan anda ");
       }else{
           System.out.println("Uang anda kurang "+(harga[pilihan]-uang));
       }
        
    }
    
}
