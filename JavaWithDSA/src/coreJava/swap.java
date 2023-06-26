package coreJava;

import java.util.Scanner;

public class swap {
    public static void main(String[] args) {
        int [] array = new int[100] ;
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the size of array:");
        int n = in.nextInt();

        System.out.println("Enter values in array:");

        for (int i =0; i<n; i++){
            array[i] = in.nextInt();
        }

        System.out.println("Enter indexes to swap;");
        int i = in.nextInt();
        int j = in.nextInt();

        swapping (array,i,j);

        for (int f = 0; f<n; f++){
            System.out.print(array[f]+ " ");
        }

    }
    static void swapping(int[]arr,int index1,int index2){
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2]= temp;
    }
}
