package DSA_JAVA.array;

import java.util.Scanner;

public class kthSmallest {
    int[] bubbleSort(int arr[]) {
        for(int i=0; i<arr.length-1; i++) {
            for(int j = i+1; j<arr.length; j++) {
                
                if(arr[i] > arr[j]) {
                    int t = arr[i];
                    arr[i] = arr[j];
                    arr[j] = t;
                }
           }
        }
        return arr;
    }

    int kthSmall(int[] arr, int k) {
        arr = bubbleSort(arr);
        return arr[k-1];
    }

    void display(int arr[]) {
        for(int i:arr) {
            System.out.print(i + "\t");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        kthSmallest ob = new kthSmallest();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of array elements");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter the elements of the array: ");
        for(int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("\nOriginal array: ");
        ob.display(arr);

        System.out.println("Enter k: ");
        int k = sc.nextInt();

        System.out.println(k+ "th smallest element in the given array: " + ob.kthSmall(arr, k));
        sc.close();
    }
}
