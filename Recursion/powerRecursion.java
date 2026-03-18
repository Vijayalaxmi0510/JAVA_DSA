import java.util.*;
public class powerRecursion {
    public static int power(int x,int n){
        if(n==0){
            return 1;
        }
        int XNM1=power(x,n-1);
        int XN=x*XNM1;
        return XN;
    }
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter number X: ");
        int x=input.nextInt();
        System.out.print("Enter number N: ");
        int n=input.nextInt();
        System.out.print("X power N = "+power(x,n));
    }
}
