/*
            A
          A B A
        A B C B A
      A B C D C B A
    A B C D E D C B A
 */
package Patterns;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Pattern17 {
    public static void main(String args[]) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enetr number of rows:- ");
        try {
            int num = Integer.parseInt(br.readLine());
            if (num <= 0) {
                System.out.println("Enter number grater than 0");
            } else {
                printPattern(num);
            }
        } catch (Exception e) {
            System.out.println("You enter invalid input/number");
        }
    }

    static void printPattern(int n) {
        for (int i = 0; i < n; i++) {
            char c = 'A';
            for (int j = 0; j < n; j++) {
                if ((i + j) < n - 1) {
                    System.out.print("  ");
                } else {
                    System.out.print(c + " ");
                    c++;
                }
            }
            for (int k = 0; k < i; k++) {
                System.out.print((char) (64 + i - k) + " ");
            }
            System.out.println();
        }
    }
}
