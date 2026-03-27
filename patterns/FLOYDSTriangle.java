package patterns;
import java.util.*;
public class FLOYDSTriangle {
    public static void FLOYDSTriangle(int n) {
        int counter=1;
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print(counter+" ");
                counter++;
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter number n: ");
        int n=input.nextInt();
        FLOYDSTriangle(n);
    }
}
