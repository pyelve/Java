/*
    1                 1
    1 2             2 1
    1 2 3         3 2 1
    1 2 3 4     4 3 2 1
    1 2 3 4 5 5 4 3 2 1
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Pattern12 {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter any natural number:- ");
        int num = Integer.parseInt(br.readLine());
        if (num <= 0) {
            System.out.println("Please enter natural numbers only !");
        } else {
            printPattern(num);
        }
    }

    static void printPattern(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 2 * n; j++) {
                if (j < n) {
                    if (j <= i) {
                        System.out.print(j + 1 + " ");
                    } else {
                        System.out.print("  ");
                    }
                } else {
                    if ((i + j) >= 2 * n - 1) {
                        System.out.print(2 * n - j + " ");
                    } else {
                        System.out.print("  ");
                    }
                }
            }
            System.out.println();
        }
    }
}
