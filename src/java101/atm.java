package java101;

import java.util.Scanner;

public class atm {
    public static void main(String[] args) {

                Scanner input = new Scanner(System.in);
                String userName, password;
                int islem,bakiye=1000,paraCek,paraYatir;

                System.out.println("Kullanıcı Adınızı Giriniz : ");
                userName = input.nextLine();
                System.out.println("Şifrenizi Giriniz :");
                password = input.nextLine();
                for (; ;){
                    for (int i=1; i<3;i++){

                        if (userName.equals("patika") && password.equals("patika123")){
                            break;

                        }else {
                            System.out.println("Tekrar deneyiniz");
                            System.out.println();
                            System.out.println("Kullanıcı Adınızı Giriniz : ");
                            userName = input.nextLine();
                            System.out.println("Şifrenizi Giriniz :");
                            password = input.nextLine();
                            if (i==2){
                                System.out.println("Hesabınız Bloke oldu ");
                                System.exit(1);
                            }
                        }
                    }

                    System.out.println("Yapmak İstediğiniz İşlemi Seçiniz : ");
                    System.out.println("Bakiye Sorgulama : 1 ");
                    System.out.println("Para Çek : 2 ");
                    System.out.println("Para Yatır : 3 ");
                    System.out.println("Çıkış Yap : 4 ");
                    islem=input.nextInt();
                    if (islem==1){
                        System.out.println("Güncel Bakiyeniz : "+ bakiye + " TL");
                    }
                    else if (islem==2){
                        System.out.println("Ne kadar Çekmek istiyorsunuz ?");
                        paraCek=input.nextInt();
                        bakiye=bakiye-paraCek;
                        System.out.println("İşlem Gerçekleştirildi !\nGüncel Bakiyeniz : " + bakiye + " TL");

                    }else if (islem==3){
                        System.out.println("Ne Kadar Yatırmak istiyorsunuz ?");
                        paraYatir=input.nextInt();
                        bakiye=bakiye+paraYatir;
                        System.out.println("İşlem Gerçekleştirildi !\nGüncel Bakiyeniz : " + bakiye + " TL");

                    }
                    else if  (islem==4){
                        System.out.println("Çıkış Yapılıyor ...");
                        System.exit(1);
                    }
                }

    }
}
