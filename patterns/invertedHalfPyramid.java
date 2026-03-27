package patterns;
import java.util.*;
public class invertedHalfPyramid {
    public static void inverted(int n){
        for(int i=1; i<=n; i++){
            for(int j=1; j<=(n-i+1); j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter number:");
        int n=input.nextInt();
        inverted(n);
    }
}
