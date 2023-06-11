package java101;

import java.util.Scanner;

public class kuvvetler {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Bir sayı değeri giriniz : ");
        int value=input.nextInt();

        System.out.println("4ün Katları şunlardır :");
        for (int i=1;i<=value;i*=4){
            System.out.print(i + ",");
        }
        System.out.println();
        System.out.println("5in Katları Şunlardır :");
        for (int j=1; j<value;j*=5){
            System.out.print(j+",");
        }
    }
}
