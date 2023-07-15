package numbersGuessingGame;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class numbersGuessingGame {
    public static void main(String[] args) {
        Random rand= new Random();
        int number = rand.nextInt(100);

        Scanner input = new Scanner(System.in);
        int right=0;
        int selected;
        int [] wrong= new int[5];
        boolean isWin= false;


        while (right<5){
            System.out.print("Please enter your guess : ");
            selected = input.nextInt();
            if (selected<0 || selected>99){
                System.out.println("Please enter a value in the range of 0-100 ! ");
                continue;
            }
            if (selected==number){
                System.out.println("Congrats on the correct guess! " + number);
                isWin= true;
                break;
            }else {
                System.out.println("Your guess is not correct!");
                if (selected>number){
                    System.out.println(selected + " The number is greater than the correct number ! ");
                }else {
                    System.out.println(selected + " The number is smaller than the correct number! ");
                }
                wrong[right++]=selected;
                System.out.println("Remaining right : " + (5-right));
            }
        }
        if (!isWin){
            System.out.println("You Lost !");
            System.out.println("Your guesses are : " + Arrays.toString(wrong));

        }

        System.out.println(number);
    }
}
