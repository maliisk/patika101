package java101;

import java.util.Scanner;

public class basTopla {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        System.out.println("Sayıyı giriniz : ");
        int sayi=input.nextInt();
        int kalan=1;
        int sonuc=0;
        while(sayi !=0 && kalan !=0)
        {
            kalan=sayi%10;
            sayi=sayi/10;
            System.out.println(sayi +"  "+ kalan);
            sonuc+=kalan;
        }
        System.out.println("Sonuç : " +sonuc);





    }
}
