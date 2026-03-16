import java.util.*;
public class StringPalindrome {
    public static boolean palindrome(String str){
        int n= str.length();
        for(int i=0; i<n/2; i++){
            if(str.charAt(i) != str.charAt(n-1-i)){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        String str=input.nextLine();
        System.out.println( palindrome(str));
    }
}
