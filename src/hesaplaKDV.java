import java.util.Scanner;

public class hesaplaKDV {
    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        double deger,kdvOran=0,kdvTutar, kdvliTutar;

        System.out.println("Para tutarı giriniz : ");
        deger=k.nextDouble();

        kdvOran = deger < 1000 ?  0.18 :  0.8;
        kdvTutar = deger * kdvOran;
        kdvliTutar = deger + kdvTutar;

        System.out.println("KDV'siz Tutar: " + deger);
        System.out.println("KDV Oranı: " + kdvOran);
        System.out.println("KDV Tutarı: " + kdvTutar);
        System.out.println("KDV'li Tutar: " + kdvliTutar);


    }
}
