package Arrays;

public class LongestNumber {
    public static void main(String[] args) {
        int n=5;
        int[] arr={10,22,34,54,32};
        System.out.println(largest(n,arr));
    }
    public static int largest(int n, int[] arr) {
        int max=0;
        
        for(int i=0;i<arr.length;i++){
            if(max < arr[i]){
               max=arr[i]; 
            }
        }
        return max;
    }
}
