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
public class Pattern10 {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter any natural number:- ");
        int num = Integer.parseInt(br.readLine());
        if (num <= 0) {
            System.out.println("Please enter natural number only!");
        } else {
            printUpper(num);
            printLower(num);
        }
    }

    static void printUpper(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void printLower(int n) {
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
