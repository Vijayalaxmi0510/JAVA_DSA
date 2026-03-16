import java.util.*;
public class subString {
    public static String subString(String str,int si,int ei){
        String subString="";
        for(int i=si; i<ei; i++){
            subString=subString+str.charAt(i);
        }
        return subString;
    }
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.print("enter string to get substring: ");
        String str=input.nextLine();
        System.out.println(subString(str,1,7));
    }
}
