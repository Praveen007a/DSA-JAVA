package Patterns;

public class Test05 {
    public static void main(String[] args) {
        seeding(4);
    }   
    public static void seeding(int n) {
        for(int i=n;i>=0;i--){
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
