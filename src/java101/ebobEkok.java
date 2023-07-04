package java101;

import java.util.Scanner;

public class ebobEkok {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Küçük olan sayıyı giriniz: ");
        int n1 = input.nextInt();
        System.out.println("Büyük olan sayıyı giriniz: ");
        int n2 = input.nextInt();

        int ebob = 1;
        int ekok = 0;
        int i = 1;
        while (i < n1) {
            if (n1 % i == 0 && n2 % i == 0) {
                ebob = i;
            }
            i++;
        }
        System.out.println("Ebob : "+ ebob);
        i = n1;
        while (++i < (n1 * n2)) {
            if (i % n1 == i % n2) {
                ekok = i;
                break;
            }
        }
        System.out.println("Ekok : " + ekok);

    }
}
