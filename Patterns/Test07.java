package Patterns;

public class Test07 {
    public static void main(String[] args) {
       nStarTriangle(5);
    }
    public static void nStarTriangle(int n) {
        for(int i=0;i<n;i++){
            //space(n-i-1)
            for(int j=0;j<n-i-1;j++){
                System.out.print(" ");
            }
            //star(2*i+1)
            for(int j=0;j<2*i+1;j++){
                System.out.print("*");
            }
            //space(n-i-1)
            for(int j=0;j<n-i-1;j++){
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
