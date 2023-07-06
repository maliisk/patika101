package java101;

import java.util.Scanner;

public class usAlmaRecursive {

    static int power(int base, int exponent) {
        if (exponent == 0) {
            return 1;
        } else {
            return base * power(base, exponent - 1);
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Taban Değerini Giriniz: ");
        int base=input.nextInt();
        System.out.println("Üs Değerini Giriniz: ");
        int exponent=input.nextInt();
        System.out.println("Sonuç : " + power(base,exponent));
        System.out.println();



    }
}
