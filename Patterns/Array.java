package Patterns;

public class Array {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7};

        for(int i:arr){
            System.out.println(i);
        }
        String s= "Praveen";
        String[] ans = s.split("");
        for(int i=0;i<ans.length/2;i++){
            System.out.println(ans[i]);
        }

        System.out.println(ans);
    }
}
