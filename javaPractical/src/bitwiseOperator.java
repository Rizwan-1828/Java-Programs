import java.util.Scanner;

public class bitwiseOperator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st a number:");
        int a = sc.nextInt();
        System.out.print("Enter 2nd a number:");
        int b = sc.nextInt();

        // Even Odd using bitwise
        if ((a & 1) == 0){
            System.out.println("Number is even.");
        }
        else {
            System.out.println("Number is odd.");
        }

        // Swapping using bitwise operators
        System.out.println("Before swapping: a = "+ a +" b = "+ b);
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;
        System.out.println("After swapping: a = " + a +" b = "+ b);
    }
}
