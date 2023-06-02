import java.util.Scanner;

public class notOrtalamaHesaplama {
    public static void main(String[] args) {
        Scanner k= new Scanner(System.in);

        double mat,fiz,kim,tur,tar,muz;
        double ort=0;

        /** Kullanıcıdan ders verileri alma */


        System.out.println("Lütfen Ders Notlarınızı Giriniz: ");

        System.out.println("Matematik Dersi Notunuzu Giriniz : ");
        mat=k.nextInt();
        System.out.println("Fizik Dersi Notunuzu Giriniz : ");
        fiz=k.nextInt();
        System.out.println("Kimya Dersi Notunuzu Giriniz : ");
        kim=k.nextInt();
        System.out.println("Türkçe Dersi Notunuzu Giriniz : ");
        tur=k.nextInt();
        System.out.println("Tarih Dersi Notunuzu Giriniz : ");
        tar=k.nextInt();
        System.out.println("Müzik Dersi Notunuzu Giriniz : ");
        muz=k.nextInt();

        ort=(mat+fiz+kim+tur+tar+muz)/6;
        System.out.println("Derslerinizin Ortalaması : " + ort + " 'dir");

    }
}