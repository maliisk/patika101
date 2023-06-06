package java101;

import java.util.Scanner;

public class ucgenAlan {
    public static void main(String[] args) {
        Scanner kenar= new Scanner(System.in);
        int kenar1,kenar2,alan=0;
        double hipotenus;

        System.out.println("Birinci Kenarı Giriniz: ");
        kenar1=kenar.nextInt();
        System.out.println("İkinci Kenarı Giriniz: ");
        kenar2=kenar.nextInt();

        alan+=(kenar1*kenar2)/2;

        hipotenus=Math.sqrt((kenar1*kenar1)+(kenar2*kenar2));

        System.out.println("Girdiğiniz Üçgenin Alanı: "+  alan);
        System.out.println("Girdiğiniz Üçgenin Hipotenüsü: "+ hipotenus);



    }
}
