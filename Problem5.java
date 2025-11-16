/*
Write a Java program that takes two integer numbers: a & b as user inputs and calculates a%b and a/b without using the modulus (%) and division(/) operators respectively.
*/

import java.util.Scanner;

public class codeforces {
    public static void main(String[] args) {

        Scanner sc = new Scanner (System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int temp = a;
        int div = 0;

        while (temp > b){
            temp -= b;
            div++;
        }
        System.out.println("Mod :" + temp + " "+ "Div " + div );

        sc.close();
    }
}
