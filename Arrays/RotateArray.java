package Arrays;

public class RotateArray {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        int k=4;
        rotate(arr, 0, arr.length-1);
        rotate(arr, 0, k-1);
        rotate(arr, k, arr.length-1);
        for(int i:arr){
            System.out.print(i+" ");
        }

    }
    public static void rotate(int[] arr,int s,int e){
        while(s<e){
            int temp=arr[s];
            arr[s]=arr[e];
            arr[e]=temp;
            s++;
            e--;
        }
    }
}
