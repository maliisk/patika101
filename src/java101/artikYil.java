package java101;

import java.util.Scanner;

public class artikYil {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Yıl Giriniz :");
        int year= input.nextInt();

        boolean isError= false;

        if (year%4==0){
            if (year%100==0){
                if (year%400==0){
                   isError=true;
                }
            }else {
                isError=true;
            }
        }
        if (isError) System.out.println(year + " bir artık yıldır !");

        else System.out.println(year + " bir artık yıl değildir !");




    }
}
