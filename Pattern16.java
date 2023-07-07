/*
    A
    B B
    C C C
    D D D D
    E E E E E
 */
package Patterns;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Pattern16 {
    public static void main(String args[]) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter number of rows:- ");
        try {
            int num = Integer.parseInt(br.readLine());
            if (num <= 0) {
                System.out.println("Please enter positive number!");
            } else {
                printPattern(num);
            }
        } catch (Exception e) {
            System.out.println("You enter invalid number!");
        }

    }

    static void printPattern(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print((char) (i + 65) + " ");
            }
            System.out.println();
        }
    }
}
