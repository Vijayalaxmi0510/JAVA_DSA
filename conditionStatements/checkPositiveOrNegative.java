import java.util.*;
public class checkPositiveOrNegative {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter number: ");
        int number=input.nextInt();
        if(number>0){
            System.out.println("positive");
        }else if(number<0){
            System.out.println("Negative");
        }else{
            System.out.println("Zero");
        }
    }
}
