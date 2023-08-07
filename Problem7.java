/*
Minimum number of jumps:-

Input:
N = 11 
arr[] = {1, 3, 5, 8, 9, 2, 6, 7, 6, 8, 9} 
Output: 3 
Explanation: 
First jump from 1st element to 2nd 
element with value 3. Now, from here 
we jump to 5th element with value 9, 
and from here we will jump to the last. 
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Problem7 {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the size of array:- ");
        int size = Integer.parseInt(br.readLine());
        int array[] = new int[size];
        System.out.println("Enter elemets of array:- ");
        for (int i = 0; i < size; i++) {
            array[i] = Integer.parseInt(br.readLine());
        }

        int jump = Solution.minimumJump(array);
        System.out.println("Minimum number of jumps are:- " + jump);
    }
}

class Solution {
    static int minimumJump(int array[]) {

        int i = 0;
        int jump = 0;
        while (i < array.length) {
            int num = array[i];
            i = i + num;
            jump++;
        }

        return jump;
    }
}
