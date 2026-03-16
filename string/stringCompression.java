import java.util.*;
public class stringCompression {
    public static String compressString(String str){
        String newstr="";
        for(int i=0; i<str.length(); i++){
           Integer count=1;
           while(i<str.length()-1 && str.charAt(i)==str.charAt(i+1)){
               count++;
               i++;
           }
           newstr=newstr+str.charAt(i);
           if(count>1){
               newstr=newstr+(count.toString());
           }
        }
        return newstr;
    }
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter your string to compress:");
        String str=input.next();
        System.out.println(compressString(str));
    }
}
