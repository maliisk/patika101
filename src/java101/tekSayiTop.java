package java101;

import java.util.Scanner;

public class tekSayiTop {
    public static void main(String[] args) {
        int num,sum=0;
        Scanner input = new Scanner(System.in);


        for (; ;){
            System.out.println("Değer girişi yapınız : ");
            num=input.nextInt();
            if (num%2!=0){
                System.out.println("Tek sayı girişi yapıldı ! Çıkış Yapıldı !");
                System.exit(1);
            }
            if (num % 4 == 0){
                sum+=num;
            }
            System.out.println("Girdiğiniz sayılardan koşulu sağlayan sayılar toplamı "+ sum);
        }

    }
}
