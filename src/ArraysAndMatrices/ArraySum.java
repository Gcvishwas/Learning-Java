package ArraysAndMatrices;

import java.util.Scanner;

public class ArraySum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elements : ");
        int n = sc.nextInt();
        int sum = 0;
        int arr[] = new int[n];
        System.out.print("Enter " + n + " integers : ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            sum += arr[i];
        }
        System.out.print("Sum of array elements = " + sum);
        sc.close();
    }
}