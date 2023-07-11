import java.util.Arrays;
import java.util.Scanner;

public class sieveOfEratosthenes {

    static boolean[] sieveOfErastosthenes (int n){
        boolean[] isPrime = new boolean[n+1];

        Arrays.fill(isPrime,true);

        isPrime [0] = false;
        isPrime [1] = false;

        for (int i = 2 ; i * i <= n ; i++){
            for (int j = 2 * i ; j <= n ; j += i){
                isPrime [j] = false;
            }
        }

        return isPrime;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number:");
        int a = sc.nextInt();

        boolean[]  isPrime = sieveOfErastosthenes(a);

        for (int i = 0 ; i <= a ; i++){
            System.out.println(i + " " + isPrime[i]);
        }
    }
}
