import java.util.*;
public class LargestInLinearSearch {
    public static int Largest(int marks[]){
        int largest=Integer.MIN_VALUE;
        for(int i=0; i<marks.length; i++){
            if(marks[i]>largest){
                largest=marks[i];
            }
        }
        return largest;
    }
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int marks[]={91,93,94,96,98,97,95,99,100};
        System.out.print("Highest marks is "+Largest(marks));
    }
}
