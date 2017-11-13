import java.util.Scanner;

public class hw4 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
       int n = scn.nextInt();
        int m = 0;

        while(n>0){
            if(n%10 !=0){
                m=m+n%10;
            }
            n=n/10;
        }
        System.out.println(m);
    }
}

