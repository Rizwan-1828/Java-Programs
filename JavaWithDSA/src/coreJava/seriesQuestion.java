package coreJava;

import java.util.Scanner;

public class seriesQuestion {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int sum , total , a , b , n ;
        System.out.print("Enter number of queries:");
        int q = in.nextInt();
        for(int i = 1; i <= q; i++) {
            sum = 0;
            total = 0;
            System.out.print("Enter value of a:");
            a = in.nextInt();
            System.out.print("Enter value to be multiplied:");
            b = in.nextInt();
            System.out.print("Enter number of elements in series:");
            n = in.nextInt();

            for(int j = 1, k=1; j <= n; j++,k*=2) {
                sum =  sum + (k*b);
                total = a + sum;
                System.out.print(total+" ");
            }
            System.out.println();

        }
    }
}
