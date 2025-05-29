package DSA_JAVA.array;

import java.util.Scanner;

public class SortArray {
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
    
    int[] DNFSort(int arr[]) {
        int low = 0, mid = 0, high = arr.length - 1;
        while(mid <= high) {
            if(arr[mid] == 0) {
                int t = arr[low];
                arr[low] = arr[mid];
                arr[mid] = t;

                mid++;
                low++;
            }

            else if(arr[mid] == 1) {
                mid++;
            }

            else {
                int t = arr[high];
                arr[high] = arr[mid];
                arr[mid] = t;

                high--;
            }
        }

        return arr;
    }
    
    void display(int arr[]) {
        for(int i:arr) {
            System.out.print(i + "\t");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        SortArray obj = new SortArray();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of array elements");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter the elements of the array: ");
        for(int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("\nOriginal array: ");
        obj.display(arr);

        obj.DNFSort(arr);
        System.out.println("\nSorted Array(O(n)): ");
        obj.display(arr);

        sc.close();
    }
}
