package Patterns;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
           *
         * * *
       * * * * *
     * * * * * * *
    * * * * * * * * *
 */
public class Pattern7 {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter natural number:- ");
        int num = Integer.parseInt(br.readLine());
        if (num <= 0) {
            System.out.println("Enetr natural number only!");
        } else {
            printPattern(num);
        }
    }

    static void printPattern(int n) {

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n + i; j++) {
                if ((i + j) < n - 1) {
                    System.out.print("  ");
                } else {
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
    }
}
