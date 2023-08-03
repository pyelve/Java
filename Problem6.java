import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * Find the missing number in given array range 1 to n 
 */
public class Problem6 {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter size of array:-");
        int size = Integer.parseInt(br.readLine());
        int array[] = new int[size - 1];
        System.out.println("Enter elements :- ");
        for (int i = 0; i < size - 1; i++) {
            array[i] = Integer.parseInt(br.readLine());
        }

        System.out.println("Missing number is:- " + missingNumber(array, size));
    }

    static int missingNumber(int array[], int n) {
        int actualSum = 0;
        int sum = 0;
        for (int i = 0, j = 1; i < n - 1; i++, j++) {
            sum = sum + array[i];
            actualSum = actualSum + j;
        }
        actualSum = actualSum + n;
        return actualSum - sum;
    }
}
