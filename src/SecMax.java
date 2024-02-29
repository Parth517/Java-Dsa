public class SecMax {

    public static int maxi(int[] arr){
        int max=0;
        int max2=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max2=max;
                max=arr[i];
            }else if(arr[i]>max2 && arr[i] !=max){
                max2=arr[i];
            }
        }
        return max2;
    }
    public static void main(String[] args){
        int[] arr={2,18,3,7,11};
        int m=maxi(arr);
        System.out.println(m);
    }
}
