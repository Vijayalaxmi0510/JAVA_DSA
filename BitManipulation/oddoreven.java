import java.util.*;
public class oddoreven {
    public static void oddOrEven(int number){
        int bitmask=1;
        if((number&bitmask)==0){
            System.out.println("number is even");
        }
        else{
            System.out.println("number is odd");
        }
    }
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter number to check ODD OR EVEN ");
        int number=input.nextInt();
        oddOrEven(number);
    }
}
