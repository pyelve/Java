package Patterns;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
    1
    2 2
    3 3 3
    4 4 4 4
    5 5 5 5 5
 */
public class Pattern4 {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter any natural number:- ");
        int num = Integer.parseInt(br.readLine());
        if (num <= 0) {
            System.out.println("Please enter any natural number ");
        } else {
            for (int i = 1; i <= num; i++) {
                for (int j = 1; j <= i; j++) {
                    System.out.print(i + " ");
                }
                System.out.println();
            }
        }
    }
}
