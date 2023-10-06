import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
 * 	WAP to find out whether number is Armstrong number
*/
public class Problem10 {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter any number ");
        String str = br.readLine();

        if (str.length() == 1) {
            System.out.println("Given number is an Amstrong Number");
        } else {
            int num = Integer.valueOf(str);
            // System.out.println(num + " " + str.length());
            if (num == amstrong(num, str.length())) {
                System.out.println("Given number is an Amstrong Number");
            } else {
                System.out.println("Given number is not an Amstrong Number");
            }
        }
    }

    static int amstrong(int num, int size) {
        int array[] = new int[size];

        for (int i = 0; num != 0; i++) {
            array[i] = num % 10;
            num = num / 10;
        }

        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            int product = 1;
            for (int j = 0; j < size; j++) {
                product = product * array[i];
            }

            sum = sum + product;
        }

        return sum;
    }
}