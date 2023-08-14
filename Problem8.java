/*
 * 	WAP to find out whether number is palindrome number
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Problem8 {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter a number:- ");
        String str = br.readLine();

        System.out.println(palindrome(str));
    }

    static String palindrome(String num) {
        char array[] = new char[num.length()];

        array = num.toCharArray();

        if (array.length == 1) {
            return "Given number is Palindrom";
        } else {
            for (int i = 0; i <= (array.length - 1) / 2; i++) {
                if (array[i] != array[(array.length - 1) - i]) {
                    return "Given number is not Palindrom";
                }
            }
        }
        return "Given number is Palindrom";
    }
}
