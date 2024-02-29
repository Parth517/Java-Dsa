public class MissingNo {
    
        public static int findMissing(int[] arr){
            int n= arr.length+1;
            int sum=n*(n+1)/2;
            for(int num:arr){
                sum=sum-num;
            }
            return sum;
        }
      
    

    public static void main(String[] args) {
        int[] arr = { 1,2,3,5 };
        int k=findMissing(arr);
        System.out.println(k);
 
    }
}
