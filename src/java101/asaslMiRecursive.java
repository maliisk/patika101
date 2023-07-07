package java101;

import java.util.Scanner;

public class asaslMiRecursive {
    static boolean isPrime(int n, int i){
        if(n==0 || n==1){
            return false;
        }
        if(n==2){
            return true;
        }
        else{

            if(n%i==0){
                if(i==1){
                    return isPrime(n,i+1);
                }else if(n==i){
                    return true;
                }else{
                    return false;
                }
            } else{
                return isPrime(n,i+1);
            }
        }
    }
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int n;
        System.out.print("Sayı Giriniz : ");
        n=inp.nextInt();
        if(isPrime(n,1)){
            System.out.println(n + " bir asal sayıdır !");
        }else {
            System.out.println(n + " bir asal sayı değildir !");
        }
}
    }