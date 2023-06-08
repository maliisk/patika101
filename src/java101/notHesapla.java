package java101;

import java.util.Scanner;

public class notHesapla {
    public static void main(String[] args) {
        int mat,fiz,tur,kim,muz;


        Scanner input = new Scanner(System.in);

        System.out.println("Lütfen Norlarınızı Giriniz :");


        System.out.println("Matematik Dersi Notunuz :");
        mat=input.nextInt();
        if (mat<0 || mat>100){
            System.out.println("Girdiğiniz Not değeri belirli aralıkta değil. Ortalamaya dahil edilmeyecektir!");
            mat=0;
        }


        System.out.println("Fizik Dersi Notunuz :");
        fiz=input.nextInt();
        if (fiz<0 || fiz>100){
            System.out.println("Girdiğiniz Not değeri belirli aralıkta değil. Ortalamaya dahil edilmeyecektir!");
            fiz=0;
        }


        System.out.println("Türkçe Dersi Notunuz :");
        tur=input.nextInt();
        if (tur<0 || tur>100){
            System.out.println("Girdiğiniz Not değeri belirli aralıkta değil. Ortalamaya dahil edilmeyecektir!");
            tur=0;
        }


        System.out.println("Kimya Dersi Notunuz :");
        kim=input.nextInt();
        if (kim<0 || kim>100){
            System.out.println("Girdiğiniz Not değeri belirli aralıkta değil. Ortalamaya dahil edilmeyecektir!");
            kim=0;
        }


        System.out.println("Müzik Dersi Notunuz :");
        muz=input.nextInt();
        if (muz<0 || muz>100){
            System.out.println("Girdiğiniz Not değeri belirli aralıkta değil. Ortalamaya dahil edilmeyecektir!");
            muz=0;
        }


        // casting 
        double ort=(double) (mat+fiz+tur+kim+muz)/5;
        //Burada derslerin toplamında double yazılmasının sebebi, bir  bölme işlemi olduğundan virgüllü sonuç ihtimali vardır.
        //Bu sebeple casting işlemini yaptık

        System.out.println("Derslerinizin ortalaması : " + ort);
        if (ort>=55){
            System.out.println("Tebrikler Sınıfı Geçtiniz !");
        }else {
            System.out.println("Malesef Sınıfı Geçemediniz !");
        }


    }
}
