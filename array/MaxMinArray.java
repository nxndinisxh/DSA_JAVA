package DSA_JAVA.array;

import java.util.Scanner;

public class MaxMinArray {
    void display(int[] arr) {
        for(int i:arr) {
            System.out.print(i + "\t");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MaxMinArray obj = new MaxMinArray();
        System.out.println("Enter the number of array elements");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter the elements of the array: ");
        for(int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("\nOriginal array: ");
        obj.display(arr);

        int min = arr[0];
        int max = arr[0];
        for(int i = 1; i < arr.length; i++) {
            if(arr[i] < min) min = arr[i];
            if(arr[i] > max) max = arr[i];
        }

        System.out.println("Maximum element is: " + max);
        System.out.println("Minimum element is: " + min);
        sc.close();
    }
}
