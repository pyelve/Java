/*
    * * * * * * * * * *
    * * * *     * * * *
    * * *         * * *
    * *             * *
    *                 *
    *                 *
    * *             * *
    * * *         * * *
    * * * *     * * * *
    * * * * * * * * * *
 */
package Patterns;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Pattern19 {
    public static void main(String args[]) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter number of rows:- ");
        try {
            int num = Integer.parseInt(br.readLine());
            if (num <= 0) {
                System.out.println("Enter valid number of rows!");
            } else {
                printPattern(num);
            }
        } catch (Exception e) {
            System.out.println("You enter invalid number!");
        }
    }

    static void printPattern(int n) {
        printUpper(n);
        printLower(n);
    }

    static void printUpper(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if ((i + j) < n) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            for (int k = 0; k < n; k++) {
                if (k >= i) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    static void printLower(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (j <= i) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            for (int k = 0; k < n; k++) {
                if ((i + k) >= n - 1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
