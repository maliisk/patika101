package java101;

import java.util.Scanner;

public class hesapMakinesi {
    public static void main(String[] args) {
        Scanner k= new Scanner(System.in);

        int secenek;
        double s1,s2,sonuc = 0;
        System.out.println("Birinci Sayıyı Giriniz : ");
        s1=k.nextDouble();
        System.out.println("İkinci Sayiyi Giriniz :");
        s2=k.nextDouble();
        System.out.println(" Toplama : 1\n Çıkarma : 2\n Çarpma  : 3\n Bölme   : 4");
        System.out.println("Yapmak istediğiniz işlemin numarasını yazınız :");
        secenek=k.nextInt();



        switch (secenek){
            case 1:
                System.out.println("Toplam : " + (s1+s2));
                break;
            case 2:
                System.out.println("Fark : " + (s1-s2));
                break;
            case 3:

                System.out.println("Çapım :" + (s1*s2));
                break;
            case 4:
                System.out.println("Bölüm : " + (s1/s2));
                break;
            default:
                System.out.println("Hatalı Giriş Yaptınız! Tekrar Deneyiniz. ");
        }


    }
}
