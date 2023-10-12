/*
 * 	WAP to print 3'rd largest number in array
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Problem_11 {

    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("enter size of array :- ");
        int size = Integer.parseInt(br.readLine());
        int array[] = new int[size];
        System.out.println("Enetr elements of array:- ");
        for (int i = 0; i < size; i++) {
            array[i] = Integer.parseInt(br.readLine());
        }

        // sort the array in Descending order

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (array[i] > array[j]) {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }

        System.out.println("3'rd largest number in array is :- " + array[2]);
    }
}