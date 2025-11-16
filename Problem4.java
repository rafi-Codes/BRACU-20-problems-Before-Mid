/*
Suppose, you are given the following equation:
7 + 7 - 7 + 7 +  7 - 7 ... upto nTh term
Write a Java program that takes the value of the total number of terms (value of n in the equation above where n > 0) and calculates & displays the value of sum. 
Note that, you are NOT allowed to use any loops to solve the problem.
*/

import java.util.Scanner;

public class codeforces {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int sum = ((num / 3) * 7) + (( num % 3) * 7);
        System.out.println(sum);
        sc.close();
    }
}
