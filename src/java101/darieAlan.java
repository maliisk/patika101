package java101;

import java.util.Scanner;

public class darieAlan {
    public static void main(String[] args) {
        int r;double pi=3.14, alan=0, cevre=0;
        Scanner input= new Scanner(System.in);
        System.out.println("Dairenin yarıçapını giriniz : ");
        r=input.nextInt();

        cevre=2*(pi*r);
        alan=pi*(r*r);

        System.out.println("Dairenizin Çevresi : "+ cevre + "'dir ve alanı ise : "+ alan +"'dir.");


    }
}
