import java.util.Scanner;

public class oddEvenUsingBitOperator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number:");
        int a = sc.nextInt();

        if ((a & 1) == 0){
            System.out.print("Number is even.");
        }
        else {
            System.out.print("Number is odd.");
        }
    }
}
