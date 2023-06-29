package Patterns;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
    * * * * *
    * * * *
    * * *
    * *
    *
 */
class Pattern6 {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter any natural number only :- ");
        int num = Integer.parseInt(br.readLine());
        if (num <= 0) {
            System.out.println("Enetr natural numbers only ");
        } else {
            for (int i = num; i > 0; i--) {
                for (int j = 0; j <= i; j++) {
                    System.out.print("* ");
                }
                System.out.println();
            }
        }
    }
}
