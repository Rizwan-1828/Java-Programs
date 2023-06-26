import java.util.Scanner;

    public class countNum {
        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);

//            System.out.print("Enter a number:");
//            int n = in.nextInt();
//
//            System.out.print("Enter a number to count:");
//            int c = in.nextInt();
//
//            int count=0;
//
//            while (n>0)
//            {
//                int rem = n % 10;
//                if (rem==c)
//                {
//                    count++;
//                }
//                n /=10;
//            }
//            System.out.println("The number "+c+" occurred "+count+" times.");

            // Reversing the number :

            System.out.print("Enter the number:");
            int n = in.nextInt();

            int temp = n;
            int result = 0;

            while(n>0)
            {
                int rem = n%10;
                result = result * 10 + rem;
                n /= 10;
            }

            System.out.print("The reverse of number "+temp+" is "+result);
        }
    }

