package ArraysAndMatrices;

import java.util.Scanner;

public class ArraySort {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elements : ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.print("Enter " + n + " integers");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Ascending sorting using Bubble Sort

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        System.out.println("Sorted array in Ascending order :");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + ",");
        }

        System.out.println();
        // Descending sorting using Bubble Sort

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] < arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        System.out.println("Sorted array in Descending order : ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + ",");
        }
        sc.close();

    }

}