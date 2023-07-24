package java101;

import java.util.Scanner;

public class palindrome {
    public static boolean isPalindrome(String value) {
        String reverse = "";
        for (int i = value.length() - 1; i >= 0; i--) {
            reverse += (value.charAt(i));
        }
        if (value.equals(reverse)) {
            System.out.println("The input is palindrome");
            return true;
        } else {
            System.out.println("The input is not palindrome");
            return false;
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Value : ");
        String value = input.nextLine();
        System.out.println(isPalindrome(value));
    }
}
