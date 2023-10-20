import java.util.Scanner;

public class binaryAddition {
    public static String add(String a, String b)
    {
        StringBuilder sb = new StringBuilder();
        int carry = 0;
        int i = a.length() - 1;
        int j = b.length() - 1;

        while (i >= 0 || j >= 0 || carry == 1)
        {
            if(i >= 0)
                carry += a.charAt(i--) - '0';
            if(j >= 0)
                carry += b.charAt(j--) - '0';
            sb.append(carry % 2);
            carry /= 2;
        }
        return sb.reverse().toString();
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first binary number:");
        String ab = sc.next();
        System.out.print("Enter second binary number:");
        String b = sc.next();

        System.out.println("The addition of first and second binary number is "+add(ab,b));
    }
}
