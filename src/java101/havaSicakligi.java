package java101;

import java.util.Scanner;

public class havaSicakligi {
    public static void main(String[] args) {
        int sicaklik;
        Scanner k= new Scanner(System.in);
        System.out.println("Hava Sıcaklığı Giriniz :");
        sicaklik=k.nextInt();

        if (sicaklik<5){
            System.out.println("Kayak Yapabilirsin");
        }if (sicaklik<=25){
            if (sicaklik<=15){
                System.out.println("Sinemaya Gidebilirsin");
            }if (sicaklik>=10){
                System.out.println("Piknik Yapabilirsin ");
            }
        }else System.out.println("Yüzmeye Gidebilirsin");
    }
}
