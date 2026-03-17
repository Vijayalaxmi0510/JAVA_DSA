import java.util.*;
public class printInc {
    public static void printInc(int n){
       if(n==1){
           System.out.println(n);
           return;
       }
        printInc(n-1);
        System.out.println(n);
    }
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter number: ");
        int n=input.nextInt();
        printInc(n);
    }
}
