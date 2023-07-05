package java101;

import java.util.Scanner;

public class palindrom {

            static boolean isPalindrom(int number){
                int temp = number,invertedNumber=0,lastNumber;
                while (temp !=0)
                {
                    lastNumber= temp %10;
                    invertedNumber = (invertedNumber*10) + lastNumber;
                    temp/=10;

                }
                if (number == invertedNumber) {
                    System.out.println(number + " bir palindrom sayıdır !");
                    return true;
                }
                else {
                    System.out.println(number + " bir palindrom sayı değildir !");
                    return false;
                }
            }

            public static void main (String[] Args) {
                Scanner input = new Scanner(System.in);
                System.out.print("Sayı giriniz :  ");
                int number = input.nextInt();

                System.out.print(isPalindrom(number));

            }
        }


