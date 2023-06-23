import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Problem3 {
    /*
     * take the day no (1 to 7) and print the corresponding day
     * for 1 print Monday
     * for 2 print tuesday and so on for 7 print Sunday
     */

    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter any number between 1 to 7 ");
        int day = Integer.parseInt(br.readLine());
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;

            case 2:
                System.out.println("Tuesday");
                break;

            case 3:
                System.out.println("Wednesday");
                break;

            case 4:
                System.out.println("Thursday");
                break;

            case 5:
                System.out.println("Friday");
                break;

            case 6:
                System.out.println("Saturday");
                break;

            case 7:
                System.out.println("Sunday");
                break;

            default:
                System.out.println("you enter invalid number");
                break;

        }
    }
}
