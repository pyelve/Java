package Patterns;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
    * * * * * * * * *
      * * * * * * *
        * * * * *
          * * *
            *
 */
public class Pattern8 {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Eneter any natural number:- ");
        int num = Integer.parseInt(br.readLine());
        if (num <= 0) {
            System.out.println("Enter natural number only");
        } else {
            for (int i = 0; i < num; i++) {
                for (int j = 0; j < (num + num - 1) - i; j++) {
                    if (j < i) {
                        System.out.print("  ");
                    } else {
                        System.out.print("* ");
                    }
                }
                System.out.println();
            }
        }
    }
}
