package java101;

import java.util.Scanner;

public class kasaManav {
    public static void main(String[] args) {
        Scanner k=new Scanner(System.in);
        double elma,armut,domates,muz,patlıcan;
        double a=2.14,e=3.67,d=1.11,m=0.95,p=5,top=0;
        System.out.println("Armut kaç Kilo aldınız : ");
        armut=k.nextInt();
        System.out.println("Elma kaç Kilo aldınız : ");
        elma=k.nextInt();
        System.out.println("Domates kaç Kilo aldınız : ");
        domates=k.nextInt();
        System.out.println("Muz kaç Kilo aldınız : ");
        muz=k.nextInt();
        System.out.println("Patlıcan kaç Kilo aldınız : ");
        patlıcan=k.nextInt();

        System.out.println("Armut Kaç Kilo ? : "+ armut);
        System.out.println("Elma Kaç Kilo ? : "+ elma);
        System.out.println("Domates Kaç Kilo ? : "+ domates);
        System.out.println("Muz Kaç Kilo ? : "+ muz);
        System.out.println("Patlıcan Kaç Kilo ? : "+ patlıcan);

        armut=armut*a;
        elma=elma*e;
        domates=domates*d;
        muz=muz*m;
        patlıcan=patlıcan*p;

        top=armut+elma+domates+muz+patlıcan;

        System.out.println("Toplam Tutar : " + top + " TL" );


    }
}
