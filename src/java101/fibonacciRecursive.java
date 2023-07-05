package java101;

public class fibonacciRecursive {

    static int fib(int a){
        if (a==1) return 1;
        if (a==0) return 1;
        return fib(a-1)+fib(a-2);
    }
    public static void main(String[] args) {
        for (int i=0; i<10; i++)
        System.out.println(fib(i));
    }
}
