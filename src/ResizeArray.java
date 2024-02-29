
public class ResizeArray {
    public static int[] resize(int arr[],int cap){
        int[] temp=new int[cap];
        for(int i=0;i<arr.length;i++){
            temp[i]=arr[i];
        }
        return temp;
    } 

    public static void printArray(int arr[]){
        for(int i =0; i<arr.length;i++){
            System.out.print(arr[i]+",");
        }
        System.out.println();
    }

    public static void main(String[] args){
    int[] arr={3,4,5,6};
    int[] n = resize(arr, arr.length*2);
    printArray(n);
    }
}
