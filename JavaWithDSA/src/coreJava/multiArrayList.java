package coreJava;

import java.util.ArrayList;
import java.util.Scanner;

public class multiArrayList {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the size of arraylist:");
        int n = in.nextInt();

        ArrayList<ArrayList<Integer>> list = new ArrayList<>(10);


        // Initialisation
        for (int i = 0; i<n; i++){
            list.add(new ArrayList<>());
        }

        // Adding elements into 2d arraylist
        for (int i = 0; i<n; i++){
            for (int j = 0; j<n; j++){
                list.get(i).add(in.nextInt());
            }
        }

        System.out.println(list);

    }
}
