import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Problem5 {
    /*
     * Given an array A[] of size n. The task is to find the largest element in it.
     */
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the size of array:- ");
        int size = Integer.parseInt(br.readLine());

        int array[] = new int[size];
        System.out.println("Enter the elements:- ");
        for (int i = 0; i < size; i++) {
            array[i] = Integer.parseInt(br.readLine());
        }

        System.out.println(maxNumber(array));
    }

    static int maxNumber(int[] array) {

        int max = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }
}
