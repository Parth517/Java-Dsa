public class RevArray {
    public static void revArr(int[] arr,int st,int end){
        while(st<end){
            int temp=arr[st];
            arr[st]=arr[end];
            arr[end]=temp;
            st++;
            end--;
        }
    }
    public static void printArray(int[] arr){
        for( int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
        System.out.println();
    }
    public static void main(String[] args){
        int[] arr={13,22,12,1,3,4};
        printArray(arr);
        revArr(arr, 0, arr.length-1);
        printArray(arr);
    }
}
