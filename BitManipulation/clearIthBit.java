import java.util.*;
public class clearIthBit {
    public static int clearIthBit(int n,int i){
        int bitmask=~(1<<i);
        return n&bitmask;
    }
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter n: ");
        int n=input.nextInt();
        System.out.print("Enter i: ");
        int i=input.nextInt();
        System.out.println(clearIthBit(n,i));
    }
}
