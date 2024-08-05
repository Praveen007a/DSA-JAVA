package Patterns;

public class Test13 {
    public static void main(String[] args) {
        //symmetry
        int n=3;
        int stars;
        for(int i=1;i<=2*n-1;i++){
            stars=i;
            if(stars>n){
                stars=2*n-i;
            }
            for(int j=1;j<=stars;j++){
                System.out.print("*"+" ");
            }
            System.out.println();
        }
    }
}
