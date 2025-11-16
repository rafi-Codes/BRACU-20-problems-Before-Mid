/*
After working for a year finally Karim got his salary and bonus for Eid 2025, now he decides to do some kind of shopping for his family. His salary is x Tk and he got 75% bonus of his salary.
He decides to spend money on shopping precisely so that everyone gets what they want. He planned to distribute 45% of his total money for his wife and 45% for his son. 
The remaining 10% will be saved for emergency cases. His wife wants a new laptop that costs around 90,000 Tk and his son wants a PS5 that costs about 70,000 Tk with games and an extra controller to play with friends that costs about 7,000 Tk.
Now, take x as input from the user and see if Karim can fully fulfill his families wish, if not possible then see whether he can use remaining budget from son and wife to fulfill each other's wish. The saving part should not be touched by any means.
*/

import java.util.Scanner;

public class codeforces {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int salary = sc.nextInt();
        double totalMoney = salary + (salary * 0.75);
        double wifeBudget = (totalMoney * 0.45);  
        double sonBudget = (totalMoney * 0.45);
        double savings = (totalMoney * 0.10);

        System.out.printf("Amount with Bonus: %.2f\n",totalMoney);
        System.out.printf("Wife Budget: %.2f\n",wifeBudget);
        System.out.printf("Son Budget: %.2f\n",sonBudget);
        System.out.printf("Savings: %.2f\n",savings);  

        if (wifeBudget > 90000 && sonBudget > 77000){
            System.out.println(
                "Shopping Done for Wife with remaining money from Sons budget!\nShopping Done for Son!"
            );
        }
        
        else if (wifeBudget < 90000 && sonBudget > 77000){
            double reaminFromSon = (sonBudget - 77000);
            if ((wifeBudget + reaminFromSon) > 90000){
                System.out.println(
                    "Shopping Done for Wife with remaining money from Sons budget!\nShopping Done for Son!"
                );
            }
            else {
                System.out.println(
                    "Cannot do shopping for wife even with remaining money from his son's budget!\nShopping Done for Son!"
                );
            }
        } 

        else {
            System.out.println(
                "Cannot do shopping for wife even with remaining money from his son's budget!\nShopping Not Done for Son!"
            );
        }

        sc.close();
    }
}
