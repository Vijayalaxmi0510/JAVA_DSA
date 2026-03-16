import java.util.*;
public class MinimumInLinearSearch {
    public static int Minimum(int marks[]){
        int minimum=Integer.MAX_VALUE;
        for(int i=0; i<marks.length; i++){
            if(marks[i]<minimum){
                minimum=marks[i];
            }
        }
        return minimum;
    }

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int marks[]={88,87,86,85,89,84,82,93,95};
        System.out.println("Minimum marks is "+ Minimum(marks));
    }
}
