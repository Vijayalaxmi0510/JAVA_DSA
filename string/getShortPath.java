import java.util.*;
public class getShortPath {
    public static float getPath(String path){
        int n=path.length();
        int x=0,y=0;
        for(int i=0; i<n; i++){
            if(path.charAt(i)=='E'){
                x=x+1;
            }else if(path.charAt(i)=='W'){
                x=x-1;
            }else if(path.charAt(i)=='N'){
                y=y+1;
            }else if(path.charAt(i)=='S'){
                y=y-1;
            }
        }
        int X2=x*x;
        int Y2=y*y;
        return (float)Math.sqrt(X2+Y2);
    }
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter your path: ");
        String path=input.nextLine();
        System.out.println(getPath(path));
    }
}
