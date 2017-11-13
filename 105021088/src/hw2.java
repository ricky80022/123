import java.util.Scanner;

public class hw2 {
    public static void main(String[] args) {
        // write your code here
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int i, j, k;

        for (i = 1; i <= n; i++) {
            for (j = 1; j <= n-i; j++) {
                System.out.print(" ");
            }
            for (k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
