/*
    E
    D E
    C D E
    B C D E
    A B C D E
 */
package Patterns;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Pattern18 {
    public static void main(String args[]) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter number of rows:- ");
        try {
            int num = Integer.parseInt(br.readLine());
            if (num <= 0) {
                System.out.println("Please use common sence and enter proper number of rows!");
            } else {
                printPattern(num);
            }
        } catch (Exception e) {
            System.out.println("You enter invalid input!");
        }
    }

    static void printPattern(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print((char) (64 + n + j - i) + " ");
            }
            System.out.println();
        }
    }
}
