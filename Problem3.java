/*
Ronaldo was getting bored at university so he decided to create and play a game. The game is going to take a 4 digit number as input and he will have 3 lives to win this game. 
First, he is going to get the last digit and check if the number is prime or not. If he finds 3 prime numbers before he loses his 3 lives then he wins. Otherwise, game over and he lost.
*/

import java.util.Scanner;

public class codeforces {

    public static boolean primeCheck(int a){
        for (int i = 2; i * i <= a; i++){
            if (a % i == 0){
                return false;
            }
        }
        return true;
    }

    public static void main (String [] args){
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter a 4-digit number: ");
        int userNum = sc.nextInt();
        int opNum = userNum;
        int LIVE = 3, Found = 0;
        while (opNum > 0 && LIVE > 0 && Found != 3){
            int lastDigit = opNum % 10;
            if (primeCheck(lastDigit)){
                System.out.println(lastDigit + " Is Prime! (" + ++Found + "/3) found.");
            }
            else {
                System.out.println(lastDigit + " Is Not Prime. Lives : " + --LIVE);
            }
            opNum /= 10;
        }
        if (Found == 3){
            System.out.println("Congratulations! You won the game!");
        } else {
            System.out.println("Game over! You lost.");
        }
        sc.close();
    }
}
