public class MaxSubarraySum {
    public static void MaxSum(int numbers[]){
        int curr=0;
        int max=Integer.MIN_VALUE;
        for(int i=0; i<numbers.length; i++){
            int start=i;
            for(int j=i; j<numbers.length; j++){
                int end=j;
                curr=0;
                for(int k=start; k<=end; k++){
                    curr=curr+numbers[k];
                }
                System.out.println(curr);
                if(curr>max){
                    max=curr;
                }
            }
        }
        System.out.println("max sum= "+ max);
    }
    public static void main(String[] args) {
        int numbers[]={1,-2,6,-1,3};
        MaxSum(numbers);
    }
}
