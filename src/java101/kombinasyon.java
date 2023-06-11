package java101;

import java.util.Scanner;

public class kombinasyon {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("C(n,r) Formatında n sayısını giriniz :");
        int n=input.nextInt();
        System.out.println("C(n,r) Formatında r sayısını giriniz :");
        int r=input.nextInt();

        double faktn=1,faktr=1,faktnr=1,sonuc=0;

        for (int i=1;i<=n;i++){
            faktn*=i;
        }
        for (int j=1;j<=r;j++){
            faktr*=j;
        }
        for (int k=1;k<=(n-r);k++){
            faktnr*=k;
        }
        sonuc+=faktn/(faktr*faktnr);

        System.out.println("Sonuç : " + sonuc);


    }
}
