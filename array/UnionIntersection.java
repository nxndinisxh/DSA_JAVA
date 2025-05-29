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

    int[] findUnion(int arr1[], int[] arr2) {
        int n = 0;
        int i = 0, j = 0, k=0;
        int[] union = new int[arr1.length + arr2.length];
        while(i < arr1.length && j < arr2.length) {
            if(arr1[i] < arr2[j]) {
                union[k] = arr1[i];
                n++; i++; k++;
            } else if(arr1[i] > arr2[j]) {
                union[k] = arr2[j];
                j++; 
                k++;
                n++;
            } else {
                union[k] = arr1[i];
                n++;
                i++;
                j++;
                k++;                 
            }
        }

        while(j < arr2.length) {
            union[k] = arr2[j];
            j++;
            k++;
            n++;
        }
        
        while(i < arr1.length) {
            union[k] = arr1[i];
            i++;
            k++;
            n++;
        }
        

        int[] Union = new int[n];
        for(int p = 0 ; p < n; p++) 
            Union[p] = union[p];

        return Union;
    }

    int[] findIntersection(int arr1[], int arr2[]) {
        int n = 0;
        int[] intersection = new  int[arr1.length < arr2.length ? arr1.length : arr2.length];
        int  i = 0, j = 0, k = 0;
        while(i < arr1.length && j < arr2.length) {
            if(arr1[i] == arr2[j]) {
                intersection[k] = arr1[i];
                i++; j++; k++; n++;
            } else if(arr1[i] < arr2[j]) {
                i++;
            } else {
                j++;
            }
        }

        int[] Intersection = new int[n];
        for(int p = 0; p < n; p++) {
            Intersection[p] = intersection[p];
        }

        return Intersection;
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

        int[] union = ob.findUnion(arr1, arr2);
        int[] intersection = ob.findIntersection(arr1, arr2);

        System.out.println("\nUnion Array: ");
        ob.display(union);

        System.out.println("\nIntersection Array: ");
        ob.display(intersection);

        sc.close();
    }
}
