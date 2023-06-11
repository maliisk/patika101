package java101;

import java.util.Scanner;

public class usluSayilar {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a,b,top=1;
        System.out.println("a^b formatı için lütfen a sayısını giriniz : ");
        a=input.nextInt();
        System.out.println("a^b formatı için lütfen b sayısını giriniz : ");
        b=input.nextInt();

        for (int i=0 ; i<b ; i++){
            top*=a;
        }
        System.out.println("Üslü İşlem Sonucunuz : " + top);


    }
}
