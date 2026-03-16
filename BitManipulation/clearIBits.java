import java.util.*;
public class clearIBits {
    public static int clearIBits(int n,int i){
        int bitmask=~0<<i;
        return n&bitmask;
    }
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter number n: ");
        int n=input.nextInt();
        System.out.print("Enter i value: ");
        int i=input.nextInt();
        System.out.println(clearIBits(n,i));
    }
}
