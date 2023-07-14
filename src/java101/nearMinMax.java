package java101;

import java.util.Arrays;
import java.util.Scanner;

public class nearMinMax {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int [] list = {30,124,-53,32,982,-123,4,7,92};
        System.out.print("Enter a number : ");
        int number = input.nextInt();

        Arrays.sort(list);
        int minValue = list[0];
        int maxValue = list[list.length - 1];

        for (int i = 0; i < list.length; i++) {
            if (list[i] < number) {
                if (list[i] > minValue ) {
                    minValue = list[i];
                }
            }
        }
        System.out.println("Little one close :" + minValue);

        for (int j = 0; j < list.length; j++) {
            if (list[j] > number ) {
                if (list[j] < maxValue) {
                    maxValue = list[j];
                }
            }
        }
        System.out.println("Big is close : "+ maxValue);

    }
}
