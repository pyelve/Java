import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Age {
    /*
     * Ask the age of user and decided wether they are adult or not
     */
    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter your Age:- ");
        int age = Integer.parseInt(br.readLine());
        if (age >= 18) {
            System.out.println("You are Adult!");
        } else {
            System.out.println("Your are not Adult!");
        }

    }
}