package patterns;
import java.util.*;
public class half_Phyramid{
    public static void halfPhyramid(int n){
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter number:");
        int n=input.nextInt();
        halfPhyramid(n);
    }
}
