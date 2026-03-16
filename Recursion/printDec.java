import java.util.*;
public class printDec {
    public static void printDec(int n){
       if(n==1){
           System.out.println(n);
           return;
       }
        System.out.println(n);
        printDec(n-1);
    }
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter number n: ");
        int n=input.nextInt();
        printDec(n);
    }
}
