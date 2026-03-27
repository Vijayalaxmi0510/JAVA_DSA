package patterns;
import java.util.*;
public class zero_OneTriangle {
    public static void zero_OneTriangle(int n) {
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                if((i+j)%2==0){
                    System.out.print("1");
                }else{
                    System.out.print("0");
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter number N: ");
        int n=input.nextInt();
        zero_OneTriangle(n);
    }
}
