/*
    A B C D E
    A B C D
    A B C
    A B
    A
 */
package Patterns;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Pattern15 {
    public static void main(String args[]) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter nay natural number:- ");
        try {
            int num = Integer.parseInt(br.readLine());
            if (num <= 0) {
                System.out.println("Enter positive natural number Please!");
            } else {
                printPattern(num);
            }
        } catch (Exception e) {
            System.out.println("you enter invalid input/number!");
        }
    }

    static void printPattern(int n) {
        for (int i = 0; i < n; i++) {
            char k = 'A';
            for (int j = 0; j < n - i; j++) {
                System.out.print(k + " ");
                k++;
            }
            System.out.println();
        }
    }
}
