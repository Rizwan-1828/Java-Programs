import java.util.Scanner;

public class trailingZeros {
    public static int trail (int n){
        int res = 0;
         for (int i = 5 ; i <= n ; i =i * 5){
             res = res + (n/i);
         }
         return res;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number:");
        int a = sc.nextInt();

        System.out.println("Number of trailing zeros in " + a + " is " +trail(a));
    }
}
