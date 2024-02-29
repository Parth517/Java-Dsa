public class MoveZero {
    public static void revArr(int[] arr,int st,int end){
        int j=0;
        for(int i =0;i<arr.length;i++){
            if(arr[i]!=0 && arr[j]==0){
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
            if(arr[j]!=0){
                j++;
            }
        }

    }
    public static void printArray(int[] arr){
        for( int i=0;i<arr.length;i++){
            System.out.print(arr[i]+",");
        }
        System.out.println();
    }
    public static void main(String[] args){
        int[] arr={0,1,0,4,1,2};
        printArray(arr);
        revArr(arr, 0, arr.length-1);
        printArray(arr);
    }
}
