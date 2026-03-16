import java.util.*;
public class getIthBit {
    public static int getIthBit(int number,int i){
        int bitmask=1<<i;
        if((number & bitmask)==0){
            return 0;
        }else{
            return 1;
        }
    }
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter your number to get ith bit");
        int number=input.nextInt();
        System.out.print("Enter ith value:");
        int i=input.nextInt();
        System.out.println(getIthBit(number,i));
    }
}
