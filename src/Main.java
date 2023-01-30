/*
Question : Take input from user and print 2d array.
 */
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int a,b;
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER THE ROW LENGTH OF ARRAY :");
        a = sc.nextInt();
        System.out.println("ENTER THE COLUMN LENGTH OF ARRAY :");
        b = sc.nextInt();
        int[][] arr = new int[a][b];
        System.out.println("now printing the two_d_array :");
        for (int i = 0; i < arr.length; i++){
            for (int j = 0; j < b; j++){
                arr[i][j] = sc.nextInt();
                System.out.print(" " + arr[i][j]);
            }
            System.out.println();
        }
    }
}