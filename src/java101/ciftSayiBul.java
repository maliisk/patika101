package java101;

import java.util.Scanner;

public class ciftSayiBul {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num,top=0;
        System.out.println("Lütfen bir sayı giriniz : ");
        num=input.nextInt();

        for (int i=0; i<num ;i++){
            if (i%3==0 && i%4==0){
                top+=i;
            }
        }
        System.out.println("Girdiğiniz sayıya kadar 3 ve 4e bölünen sayılar toplamı : " + top);
    }
}
