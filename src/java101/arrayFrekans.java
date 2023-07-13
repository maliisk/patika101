package java101;

import java.util.Arrays;

public class arrayFrekans {
    public static void main(String[] args) throws Exception {
        int[] array = {15, 23, 90, 8, 9, 15, 8, 90, 23, 15};

        System.out.println("Dizi: " + Arrays.toString(array));
        System.out.println("Tekrar Sayıları:");
        Arrays.sort(array);

        int count= 1;

        for (int i = 0; i < array.length; i++) {
            if (i == 0) {
                for (int j = 0; j < array.length; j++) {
                    if ((i != j) && (array[i] == array[j])) {
                        count++;
                    }
                }
                System.out.println(array[i] + " sayısı " + count + " kere tekrar edildi.");
            } else if (array[i] != array[i-1]) {
                for (int j = 0; j < array.length; j++) {
                    if ((i != j) && (array[i] == array[j])) {
                        count++;
                    }
                }
                System.out.println(array[i] + " sayısı " + count + " kere tekrar edildi.");
            }
            count= 1;
        }

    }
}
