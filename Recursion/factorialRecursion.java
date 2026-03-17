import java.util.*;
public class factorialRecursion {
    public static int factorial(int n){
        if(n==0){
            return 1;
        }
        int fnm1=factorial(n-1);
        int fn=n*fnm1;
        return fn;
    }
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter number to calculate factorial: ");
        int n=input.nextInt();
        System.out.println(factorial(n));
    }
}
