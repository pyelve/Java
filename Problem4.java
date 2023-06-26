/*
 * Input :- 3 -> [1,2,5]
 * Output:- 4 
 * print the maximum difference between numbers 
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Problem4 {
    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the total number of array:-");
        int num = Integer.parseInt(br.readLine());
        int arr[] = new int[num];
        System.out.println("Enter the elements ");
        for (int i = 0; i < num; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        differnece(arr);
    }

    static void differnece(int[] arr) {
        int temp = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] < arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        int maxDiffernece = arr[arr.length - 1] - arr[0];
        System.out.println("Max Difference:- " + maxDiffernece);
    }
}
