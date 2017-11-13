import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int i,j;

                for( i=1;i<=n;i++){
                    for( j=1;j<=i;j++){
                        System.out.print("*");

                    }
                    System.out.println();
                }


    }
}
