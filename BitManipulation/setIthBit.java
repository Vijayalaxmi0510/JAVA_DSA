import java.util.*;
public class setIthBit {
    public static int setIthBit(int number,int i){
        int bitmask=1<<i;
        return number|bitmask;
    }
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter number: ");
        int number=input.nextInt();
        System.out.print("Enter i value: ");
        int i=input.nextInt();
        System.out.println( setIthBit(number,i));
    }
}
