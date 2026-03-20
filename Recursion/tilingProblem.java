import java.util.*;
public class tilingProblem {
    public static int tilingProblem(int n){
        if(n==0||n==1){
            return 1;
        }
        int fnm1=tilingProblem(n-1);
        int fnm2=tilingProblem(n-2);
        int totalways=fnm1+fnm2;
        return totalways;
    }
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter number n:");
        int n=input.nextInt();
        System.out.println("Total ways of setting up tails:"+ tilingProblem(n));
    }
}
