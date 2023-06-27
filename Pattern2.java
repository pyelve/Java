package Patterns;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Pattern2 {
    /*
     * * * *
     * * * *
     * * * *
     * * * *
     */
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter any number:- ");
        int num = Integer.parseInt(br.readLine());
        if (num <= 0) {
            System.out.println("Please enter any natural number ");
        } else {
            for (int i = 0; i < num; i++) {
                for (int j = 0; j < num; j++) {
                    System.out.print("* ");
                }
                System.out.println();
            }
        }
    }
}
