package java101;

import java.util.Scanner;

public class taksimetre {
    public static void main(String[] args) {
        double mesafe, top=10;


        Scanner k = new Scanner(System.in);
        System.out.println("Km değeri giriniz: ");
        mesafe=k.nextDouble();

        mesafe=mesafe*(2.20);
        top=top+mesafe;

        top=(top<20) ? 20:top;

        System.out.println("Toplam Ödenecek Tutar : "+ top);

    }
}
