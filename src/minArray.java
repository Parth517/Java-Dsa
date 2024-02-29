public class minArray {
    public static void printArray(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+",");
        }
        System.out.println();
    }
    public static int minArrays(int[] arr){
        int min=arr[0];
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                if(arr[i]>arr[j]){
                    arr[i]=arr[j];
                    min=arr[i];
                }
            }
        }
        return min;
    }
    public static void main(String[] args){
        int[] arr={11,18,3,7,45};
        printArray(arr);
        int a =minArrays(arr);
        System.out.println(a);

    }    
}
