package java101;

import java.util.Scanner;

public class ucakBileti {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double km,yas,tip,top,yasInd;
        System.out.println("Sisteme Hoşgeldiniz!\nGideceğiniz Mesafeyi Km Cinsinden Yazın Lütfen :");
        km=input.nextInt();
        System.out.println("Lütfen Yaşınızı Giriniz :");
        yas=input.nextInt();
        System.out.println("Yolculuk Tipiniz Seçiniz\n(Tek Yön => 1 , Gidiş Dönüş => 2)");
        tip=input.nextInt();


            if (km>=0 && yas>=0){
                if (tip==1 || tip==2){
                    km=km*0.1;
                    top=km;
                if (yas<12){
                    yasInd=top*0.5;
                    top=top-yasInd;

                }else if (yas>12 && yas<=24) {
                    yasInd=top*0.1;
                    top=top-yasInd;
                }else if(yas>=65){
                    yasInd=top*0.3;
                    top=top-yasInd;
                }
                if (tip==2){
                    top-=top*0.2;
                    top=top*2;
                }
                System.out.println("Toplam Tutar : "+ top );

            }else {
                System.out.println("Hatalı veri girişi yapıldı !");
            }
        }else {
            System.out.println("Hatalı veri girişi yapıldı !");

        }
    }
}
