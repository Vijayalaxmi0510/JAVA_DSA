import java.util.*;
public class sumRecursion {
    public static int sumNaturalNum(int n){
       if(n==1){
           return 1;
       }
        int sumNM1=sumNaturalNum(n-1);
        int sum=n+sumNM1;
        return sum;
    }

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter number to get sum of first n natural numbers: ");
        int n=input.nextInt();
        System.out.println("Sum of first natural numbers= " +sumNaturalNum(n));
    }
}
