package DSA_JAVA.array;

import java.util.Scanner;

public class NegPos {
    void display(int arr[]) {
        for(int i:arr) {
            System.out.print(i + "\t");
        }
        System.out.println();
    }

    void shift(int arr[]) {
        int low = 0, mid = 0, high = arr.length-1;
        while(mid <= high) {
            if(arr[mid] < 0) {
                int t = arr[mid];
                arr[mid] = arr[low];
                arr[low] = t;

                mid++;
                low++;
            }
            else {
                int t = arr[mid];
                arr[mid] = arr[high];
                arr[high] = t;

                high--;
            }
        }
    }
    public static void main(String[] args) {
        NegPos ob = new NegPos();
        
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

        ob.shift(arr);
        System.out.println("\nShifted array: ");
        ob.display(arr);
        sc.close();
    }
}
