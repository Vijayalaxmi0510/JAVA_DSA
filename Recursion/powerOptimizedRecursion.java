import java.util.*;
public class powerOptimizedRecursion {
    public static int powerOptimized(int x,int n){
       if(n==0){
           return 1;
       }
        int halfpower=powerOptimized(x,n/2)*powerOptimized(x,n/2);
        if(n%2 !=0){
            halfpower=x*halfpower;
        }
        return halfpower;
    }
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter number X: ");
        int x=input.nextInt();
        System.out.print("Enter number N: ");
        int n=input.nextInt();
        System.out.print("X power N = "+powerOptimized(x,n));
    }
}
