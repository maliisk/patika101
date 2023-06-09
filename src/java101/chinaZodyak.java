package java101;

import java.util.Scanner;

public class chinaZodyak {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int year,remainder;
        System.out.println("Doğum Yılınızı Giriniz :");
        year = input.nextInt();
        remainder= year%12;

        switch (remainder) {
            case 0 -> System.out.println("Çin Zodyağı Burcunuz : Maymun ");
            case 1 -> System.out.println("Çin Zodyağı Burcunuz : Maymun ");
            case 2 -> System.out.println("Çin Zodyağı Burcunuz : Maymun ");
            case 3 -> System.out.println("Çin Zodyağı Burcunuz : Maymun ");
            case 4 -> System.out.println("Çin Zodyağı Burcunuz : Maymun ");
            case 5 -> System.out.println("Çin Zodyağı Burcunuz : Maymun ");
            case 6 -> System.out.println("Çin Zodyağı Burcunuz : Maymun ");
            case 7 -> System.out.println("Çin Zodyağı Burcunuz : Maymun ");
            case 8 -> System.out.println("Çin Zodyağı Burcunuz : Maymun ");
            case 9 -> System.out.println("Çin Zodyağı Burcunuz : Maymun ");
            case 10 -> System.out.println("Çin Zodyağı Burcunuz : Maymun ");
            case 11 -> System.out.println("Çin Zodyağı Burcunuz : Maymun ");
        }



    }
}
