import java.util.*;
public class fibonacciRecursion {
    public static int fibonacciRecursion(int n){
        if(n==0|| n==1){
            return n;
        }
        int fbnm1=fibonacciRecursion(n-1);
        int fbnm2=fibonacciRecursion(n-2);
        int fb=fbnm1+fbnm2;
        return fb;
    }
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter a number to print nth fibonacci number: ");
        int n=input.nextInt();
        System.out.println(fibonacciRecursion(n));
    }
}
