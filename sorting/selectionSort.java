public class selectionSort {
    public static void selectionSort(int arr[]) {
        for(int i=0; i<arr.length; i++) {
            int minPos = i;
           for(int j=i+1; j<arr.length; j++) {
               if (arr[minPos] > arr[j]) {
                   minPos = j;
               }
           }
            int temp = arr[minPos];
            arr[minPos]=arr[i];
            arr[i]=temp;
        }
    }

    public static void printArr(int arr[]) {
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        int arr[]={5,3,2,4,1,7,9,6};
        selectionSort(arr);
        printArr(arr);
    }
}
