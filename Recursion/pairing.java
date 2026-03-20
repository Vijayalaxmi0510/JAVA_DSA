import java.util.*;
public class pairing {
    public static int friendsPairing(int n){
        if(n==0||n==1||n==2){
            return n;
        }
        int fnm1=friendsPairing(n-1);
        int fnm2=friendsPairing(n-2);
        int pairways=(n-1)*fnm2;
        int totalways=fnm1+pairways;
        return totalways;
    }
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter number of friends: ");
        int n=input.nextInt();
        System.out.println(friendsPairing(n));
    }
}
