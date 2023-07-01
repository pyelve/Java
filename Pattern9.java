package Patterns;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
        *
       * *
      * * *
     * * * *
    * * * * *
     * * * *
      * * *
       * *
        *
 */
public class Pattern9 {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter natural number:- ");
        int num = Integer.parseInt(br.readLine());
        if (num <= 0) {
            System.out.println("Enter natural number please!");
        } else {
            printUpperDiamond(num);
            printLowerDiamond(num);
        }
    }

    static void printUpperDiamond(int n) {
        if (n % 2 == 0) {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n + i; j++) {
                    if ((i + j) >= n - 1 && (i + j) % 2 != 0) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
        } else {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n + i; j++) {
                    if ((i + j) >= n - 1 && (i + j) % 2 == 0) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
        }
    }

    static void printLowerDiamond(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n + n - 1 - i; j++) {
                if ((i + j) % 2 == 0 && (j >= i)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
