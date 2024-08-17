package Arrays;

public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] arr={1,1,2,2,3,3,3};
        int i=0;
        for(int j=0;j<arr.length;j++){
            if(arr[j]!=arr[i]){
                arr[i+1]=arr[j];
                i++;
            }
        }
        System.out.print(i+1);
    }
}
