import java.util.*;
public class isPowerOfTwo {
    public static boolean isPowerOfTwo(int n){
        return (n&n-1)==0;
    }
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter number to check that is power of two or not:");
        int n=input.nextInt();
        System.out.println(isPowerOfTwo(n));
    }
}
