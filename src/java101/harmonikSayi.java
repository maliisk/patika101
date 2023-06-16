package java101;

import java.util.Scanner;

public class harmonikSayi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Bir n değeri giriniz : ");
        int  n= input.nextInt();
        double result =0;
        for (double i=1; i<=n;i++) {
            result+=(1/i);
        }
        System.out.println(result);
    }
}
