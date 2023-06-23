import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Problem2 {
    /*
     * A School has following rule for grading system:
     * Below 25 - F
     * 25 to 44 - E
     * 45 to 49 - D
     * 50 to 59 - C
     * 60 to 79 - B
     * 80 to 100 - A
     * Ask user to enter marks and print the corresponding grade.
     */
    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter your total marks :- ");
        int marks = Integer.parseInt(br.readLine());
        if (marks <= 25) {
            System.out.println("your grade is :- F");
        } else if (marks > 25 && marks <= 44) {
            System.out.println("your grade is :- E");
        } else if (marks > 44 && marks <= 49) {
            System.out.println("your grade is :- D");
        } else if (marks > 49 && marks <= 59) {
            System.out.println("your grade is :- C");
        } else if (marks > 59 && marks <= 79) {
            System.out.println("your grade is :- B");
        } else if (marks >= 80 && marks <= 100) {
            System.out.println("your grade is :- A");
        }
    }
}
