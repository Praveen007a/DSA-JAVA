package Arrays;

public class SecondLargest2 {
    public static void main(String[] args) {
        int[] arr = {12, 35, 1, 10, 34, 1};
        System.out.println(arr);
    }
    public int print2largest(int[] arr) {
        int large=0;
        int slarge=Integer.MIN_VALUE;
        
        for(int i=0;i<arr.length;i++){
            if(arr[i]>large){
                slarge=large;
                large=arr[i];
            }
            else if(arr[i]<large && arr[i]>slarge){
                slarge=arr[i];
            }
        }
        return slarge;
    }
}
