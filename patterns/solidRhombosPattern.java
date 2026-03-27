package patterns;
import java.util.*;
public class solidRhombosPattern {
    public static void solidRhombos(int n) {
        for(int i=1; i<=n; i++){
            //spaces
            for(int j=1; j<=(n-i); j++){
                System.out.print(" ");
            }
            for(int j=1; j<=n; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter number n:");
        int n=input.nextInt();
        solidRhombos(n);
    }
}
