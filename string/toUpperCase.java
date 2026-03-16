import java.util.*;
public class toUpperCase {
    public static String toUpperCase(String sentence){
        StringBuilder sb=new StringBuilder("");
        Character ch=Character.toUpperCase(sentence.charAt(0));
        sb.append(ch);
        for(int i=1; i<sentence.length(); i++){
            if(sentence.charAt(i)==' '&&i<sentence.length()-1){
                sb.append(sentence.charAt(i));
                i++;
                sb.append(Character.toUpperCase(sentence.charAt(i)));
            }else{
                sb.append(sentence.charAt(i));
            }
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter your sentence to convert the first letter of each word to uppercase:");
        String sentence=input.nextLine();
        System.out.println(toUpperCase(sentence));
    }
}
