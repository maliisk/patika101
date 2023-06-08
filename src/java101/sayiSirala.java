package java101;

import java.util.Scanner;

public class sayiSirala {
    public static void main(String[] args) {
        Scanner inp= new Scanner(System.in);
        
        int s1,s2,s3;
        
        System.out.print("Birinci Sayiyi Giriniz :");
        s1=inp.nextInt();
        
        System.out.print("İkinci Sayiyi Giriniz :");
        s2=inp.nextInt();
        
        System.out.print("Üçüncü Sayiyi Giriniz :");
        s3=inp.nextInt();
        
        if (s1<s2 && s1<s3){
         if (s2>s3){
             System.out.println("s1<s3<s2");
         }else {
             System.out.println("s1<s2<s3");
         }
        } else if (s2<s1 && s2<s3) {
            if (s1>s3){
                System.out.println("s2<s3<s1");
            }else {
                System.out.println("s2<s1<s3");
            }
        }else {
            if (s1>s2){
                System.out.println("s3<s2<s1");
            }else {
                System.out.println("s3<s1<s2");
            }
        }

    }
}
