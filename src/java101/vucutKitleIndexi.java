package java101;

import java.util.Scanner;

public class vucutKitleIndexi {
    public static void main(String[] args) {
        double boy,kilo,index=0;
        Scanner inp = new Scanner(System.in);
        System.out.println("Lütfen boyunuzu metre cinsinde giriniz : ");
        boy=inp.nextDouble();
        System.out.println("Lütfen kilonuzu giriniz : ");
        kilo=inp.nextDouble();

        index+=kilo/(boy*boy);

        System.out.println("Vücut Kitle İndeksiniz : "+ index +"'dir");
    }
}
