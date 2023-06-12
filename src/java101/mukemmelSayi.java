package java101;

import java.util.Scanner;

public class mukemmelSayi {
    public static void main(String[] args) {
        int top=0;
        Scanner input= new Scanner(System.in);
        System.out.print("Bir sayı giriniz : ");
        int sayi= input.nextInt();

        for (int i=1;i<sayi;i++){
            if (sayi%i==0){
                top+=i;
            }
        }
        if (top==sayi) System.out.println(sayi+" Mükemmel sayıdır !");
        else System.out.println(sayi+" Mükemmel sayı değildir !");
    }
}
