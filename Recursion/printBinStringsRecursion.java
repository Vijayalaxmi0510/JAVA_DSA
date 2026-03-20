import java.util.*;
public class printBinStringsRecursion {
    public static void printBinStrings(int n,int lastPlace,String str){
        if(n==0){
            System.out.println(str);
            return;
        }
        printBinStrings(n-1,0,str+"0");
        if(lastPlace==0){
            printBinStrings(n-1,1,str+"1");
        }
    }
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter your number N: ");
        int n=input.nextInt();
        printBinStrings(4,0,"");
    }
}
