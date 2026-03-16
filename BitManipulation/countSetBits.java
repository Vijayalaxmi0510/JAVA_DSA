import java.util.*;
public class countSetBits {
    public static int countSetBits(int n){
        int count=0;
        while(n>0) {
            if ((n & 1) != 0) {
                count = count + 1;
            }
            n = n >> 1;
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter number to check how many set bits are there: ");
        int n=input.nextInt();
        System.out.println(countSetBits(n));
    }
}
