import java.util.*;
public class binarySearch {
    public static int binarySearch(int numbers[],int key){
        int start=0,end=numbers.length-1;
        while(start<=end){
            int mid=(start+end)/2;
            if(numbers[mid]==key){
                return mid;
            }
            if(mid<key){
                start=mid+1;
            }else{
                end=mid-1;
            }
        }

        return -1;
    }
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int numbers[]={1,2,3,4,7,8,9,10,11,12,13};
        System.out.print("Enter a number to search: ");
        int key=input.nextInt();
        System.out.print("Your number is at index: " + binarySearch(numbers,key));
    }
}
