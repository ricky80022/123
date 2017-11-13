import java.util.Scanner;

public class hw1 {

    public static void main(String[] args) {
    // write your code here
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int i,j;

        for( i=0;i<n;i++){
            for( j=1;j<=n-i;j++){
                System.out.print("*");

            }
            System.out.println();
        }


    }
}