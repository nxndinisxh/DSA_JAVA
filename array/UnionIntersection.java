package DSA_JAVA.array;

import java.util.Scanner;

public class UnionIntersection {

    void display(int arr[]) {
        for(int i:arr) {
            System.out.print(i + "\t");
        }
        System.out.println();
    }

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

    int[] union(int arr1[], int[] arr2) {
        int n = 0;
        int iterations = arr1.length > arr2.length ? arr1.length : arr2.length;
        for(int  i=0; i < iterations; i++) {
            for(int j = 0; j <  )
        }

        int[] union = new int[n];
        return union;
    }

    public static void main(String[] args) {
        UnionIntersection ob = new UnionIntersection();
        Scanner sc = new Scanner(System.in);

        //Array 1
        System.out.println("Enter the number of elements of array 1: ");
        int n = sc.nextInt();
        int[] arr1 = new int[n];

        System.out.println("Enter the elements of the array 2: ");
        for(int i = 0; i < arr1.length; i++) {
            arr1[i] = sc.nextInt();
        }

        //Array 2
        System.out.println("Enter the number of elements of array 2: ");
        n = sc.nextInt();
        int[] arr2 = new int[n];

        System.out.println("Enter the elements of the array 2: ");
        for(int i = 0; i < arr2.length; i++) {
            arr2[i] = sc.nextInt();
        }

        System.out.println("\nArray 1: ");
        ob.display(arr1);

        System.out.println("\nArray 2: ");
        ob.display(arr2);

        ob.bubbleSort(arr1);
        ob.bubbleSort(arr2);

        int[] union = ob.union(arr1, arr2);
        int[] intersection = ob.intersection(arr1, arr2);

        System.out.println("\nUnion Array: ");
        ob.display(union);

        System.out.println("\nIntersection Array: ");
        ob.display(intersection);
    }
}
