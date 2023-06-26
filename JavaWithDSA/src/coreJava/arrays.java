package coreJava;

public class arrays {
    public static void main(String[] args) {

        int i,j;

        int [][] a = {
                {1,3,4,5,6},
                {4,7,5},
                {5}
        };

        for (i = 0; i<a.length; i++)
        {
            for (j = 0; j<a[i].length; j++)
            {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }
}
