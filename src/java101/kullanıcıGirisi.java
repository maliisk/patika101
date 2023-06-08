package java101;

import java.util.Scanner;

public class kullanıcıGirisi {
    public static void main(String[] args) {
        String userName, password,newPassword,cevap;

        Scanner k= new Scanner(System.in);

        System.out.println("Lütfen Kullanıcı Adınızı Giriniz : ");
        userName=k.nextLine();

        System.out.println("Lütfen Şifrenizi Giriniz : ");
        password=k.nextLine();

        if (userName.equals("patika") && password.equals("Patika2023"))
            System.out.println("Tebrikler Giriş Yaptınız !");

        else {
            System.out.println("Hatalı Giriş Yaptınız ! \n Şifrenizi sıfırlamak istiyor musunuz) \n (Evet/Hayır)");
            cevap=k.nextLine();

            switch (cevap){
                case "Evet" :
                    System.out.println("Yeni Şifrenizi Giriniz : ");
                    newPassword=k.nextLine();
                    if (newPassword.equals("Patika2023"))
                        System.out.println("Şifreniz Eski Şifrenizle Aynı Olamaz !");
                    else System.out.println("Yeni Şifreniz Oluşturuldu Tekrardan Giriş Yapınız !");
                    break;

                case "Hayır" :
                    System.out.println("Tekrar Deneyiniz !");
                    break;
            }



        }

    }
}
