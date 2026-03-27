package patterns;
import java.util.*;
public class hollowRectangle {
    public static void hollowRectangle(int rows,int cols){
        for(int i=1;i<=rows; i++){
            for(int j=1; j<=cols; j++){
                if(i==1 || i==rows || j==1 || j==cols){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int rows=input.nextInt();
        System.out.print("Enter number of columns: ");
        int cols=input.nextInt();
        hollowRectangle(rows,cols);
    }

}
