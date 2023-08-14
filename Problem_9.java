/*
WAP to decide bonus salary of an employee base on No of years of experience and designation
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Problem_9 {
    public static void main(String args[]) throws IOException {
        /*
         * BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
         * System.out.println("Enter your experience :- ");
         * int num = Integer.parseInt(br.readLine());
         * 
         * System.out.println("Choose your designation (Developer/Tester):- ");
         * String designation = br.readLine();
         */
        int num = 10;
        String designation = "Developer";
        switch (designation) {

            case "Developer":
                if (num >= 10) {
                    System.out.println("Bonus = 20% of salary");
                } else if (num < 10 && num >= 5) {
                    System.out.println("Bonus = 10% of salary");
                } else {
                    System.out.println("Bonus = 5% of salary");
                }

                break;

            case "Tester":
                if (num >= 10) {
                    System.out.println("Bonus = 10% of salary");
                } else if (num < 10 && num >= 5) {
                    System.out.println("Bonus = 7% of salary");
                } else {
                    System.out.println("Bonus = 5% of salary");
                }

                break;

            default:
                System.out.println("Please enter valid designation");
                break;
        }
    }
}