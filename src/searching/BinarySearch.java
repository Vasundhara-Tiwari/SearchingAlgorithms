package searching;

import java.util.Scanner;

public class BinarySearch {
    int binarySearch(int arr[], int low, int high, int key)
    {
        if (high >= low) {
            int mid = low + (high - low) / 2;
            if (arr[mid] == key)
                return mid;
            if (arr[mid] > key)
                return binarySearch(arr, low, mid - 1, key);
            return binarySearch(arr, mid + 1, high, key);
        }
        return -1;
    }
    public static void main(String args[])
    {
        Scanner scanner = new Scanner(System.in);
        BinarySearch ob = new BinarySearch();
        int arr[] = new int[5];
        int n = arr.length;
        for(int i=0; i<n; i++){
            arr[i] = scanner.nextInt();
        }
        int num = scanner.nextInt();
        int result = ob.binarySearch(arr, 0, n - 1, num);
        if (result == -1)
            System.out.println("Element not present");
        else
            System.out.println("Element found at index "
                    + result);
    }
}
