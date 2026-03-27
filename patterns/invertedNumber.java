package patterns;
import java.util.*;
public class invertedNumber {
    public static void invertedNumber(int n){
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n-i+1; j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter number N: ");
        int n=input.nextInt();
        invertedNumber(n);
    }
}
