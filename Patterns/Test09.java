package Patterns;

public class Test09 {
    //diamond pattern
    public static void main(String[] args) {
        int n=5;
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
        for(int i=0;i<n;i++){
            //space
            for(int j=0;j<i;j++){
                System.out.print(" ");
            }
            //star
            for(int j=0;j<2*n-(2*i+1);j++){
                System.out.print("*");
            }
            //space
            for(int j=0;j<i;j++){
                System.out.print(" ");
            }
            System.out.println();
        }
    }
    

}
