/*
    A
    A B
    A B C
    A B C D
    A B C D E
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Pattern14 {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter natural number:- ");
        int num = Integer.parseInt(br.readLine());
        if (num <= 0) {
            System.out.println("Enter natural number only!");
        } else {
            printPattern(num);
        }
    }

    static void printPattern(int n) {
        for (int i = 0; i < n; i++) {
            char k = 'A';
            for (int j = 0; j <= i; j++) {
                System.out.print(k + " ");
                k++;
            }
            System.out.println();
        }
    }
}
