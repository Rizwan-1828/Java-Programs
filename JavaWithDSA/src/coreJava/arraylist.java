package coreJava;

import java.util.ArrayList;
import java.util.Scanner;

public class arraylist {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>(5);

        System.out.print("Enter the size of array:");
        int n = in.nextInt();

        // For taking input
        for (int i = 0; i < n; i++) {
            list.add(in.nextInt());
        }

        // For printing element at given index
        for (int i = 0; i < n; i++) {
            System.out.print(list.get(i) + " ");     // normal syntax arr[index] will not work that is we have to use arr.get() method
        }
    }
}
