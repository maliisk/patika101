package java101;

import java.util.Arrays;

public class repeatingEvenNumbers {
    public static void main(String[] args) {
        int[] numbers = {12,512,234,56,6764,23,2,6,5,5,5,12,54,234,47};
        Arrays.sort(numbers);
        System.out.println("Sıralı Halde Dizi : " + Arrays.toString(numbers));

        int count=0;
        for(int i=0; i < numbers.length-1; i++){
            if(numbers[i] == numbers[i+1]){
                int evenNumber = numbers[i];
                if(evenNumber % 2 == 0){
                    count++;
                    System.out.print(evenNumber + " ");
                }
            }
        }
        if(count == 0){
            System.out.println("Kurala uygun çift sayı yok.");
        }
    }
}
