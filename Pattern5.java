package Patterns;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
    1 2 3 4 5
    1 2 3 4 
    1 2 3
    1 2
    1
 */
class Pattern5 {

    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter any natural number:- ");
        int num = Integer.parseInt(br.readLine());
        if (num <= 0) {
            System.out.println("Enter natural numbers only!");
        } else {
            for (int i = num; i > 0; i--) {
                for (int j = 1; j <= i; j++) {
                    System.out.print(j + " ");
                }
                System.out.println();
            }
        }
    }
}
