package DSA_JAVA.array;
import java.util.Scanner;

public class ReverseArray {
    int[] reverseArray(int arr[]) {
        for(int i = 0; i < arr.length/2; i++) {
            int t = arr[i];
            arr[i] = arr[arr.length-i-1];
            arr[arr.length-i-1] = t;
        }

        return arr;
    }

    void display(int[] arr) {
        for(int i: arr){
            System.out.print(i + "\t");
        }
    }
    public static void main(String[] args) {
        ReverseArray obj = new ReverseArray();
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

        int[] reverseArr = obj.reverseArray(arr);
        System.out.println("\nReverse array: ");
        obj.display(reverseArr);

        sc.close();
    }
}
