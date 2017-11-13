import java.util.Scanner;

public class hw3 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        long n = scn.nextInt();
        int m = 1;
        int count = 0;

        while (n > 0) {
            if (n % 10 == m) {
                count++;
            }
            n = n / 10;
        }
        System.out.println(count);
    }
}

