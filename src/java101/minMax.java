package java101;

import java.util.Scanner;

public class minMax {
    public static void main(String[] args) {
        int adet, deger, max=0, min=0;
        Scanner input = new Scanner(System.in);
        System.out.print("Kaç adet sayı girişi yapacaksınız :");
        adet = input.nextInt();

        for (int i=1; i<=adet; i++){
            System.out.print(i+ ". sayıyı giriniz :");
            deger=input.nextInt();
            if (deger>=max){
                max=deger;
            }
            else if (deger<=min){
                min=deger;
            }
        }
        System.out.println("En Büyük Sayı : "  + max);
        System.out.println("En Küçük Sayı : "  + min);

    }

}
