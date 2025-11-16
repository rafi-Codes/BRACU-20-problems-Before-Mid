/*
A group of astronauts established a space colony on Mars in 1999. Due to the harsh conditions, they must import essential supplies from Earth. 
The cost of these supplies has increased each month due to inflation and rising transportation expenses. 
The price of oxygen cylinders has increased by p% each month based on the previous month's price. The price of water reserves has increased by q% each month based on the previous month's price.
Write a program that takes as input the price of an oxygen cylinder and a unit of water reserve in 1999, along with the values of p and q. 
The program should then calculate and print the current price of both items and determine which item's price has increased more in total over these years.
*/

import java.util.Scanner;

public class codeforces {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the initial price of an oxygen cylinder in 1999: ");
        double initialCylPrice = sc.nextDouble();
        double newCylPrice = initialCylPrice;

        System.out.print("Enter the initial price of a unit of water reserve in 1999: ");
        double initialWatPrice = sc.nextDouble();
        double newWatPrice = initialWatPrice;

        System.out.print("Enter the monthly inflation rate (percentage) for oxygen cylinders: ");
        double cylRate = sc.nextDouble();

        System.out.print("Enter the monthly inflation rate (percentage) for water reserves: ");
        double watRate = sc.nextDouble();

        int months = (2025 - 1999) * 12;

        for (int i = 0; i < months; i++) {
            newCylPrice += newCylPrice * cylRate / 100;
            newWatPrice += newWatPrice * watRate / 100;
        }

 
        System.out.printf("Current price of oxygen cylinder: %.2f\n", newCylPrice);
        System.out.printf("Current price of water reserve: %.2f\n", newWatPrice);

        if (newCylPrice > newWatPrice){
            System.out.println("The price of oxygen cylinders has increased more.");
        } else {
            System.out.println("The price of water reserves has increased more.");
        }

        sc.close();
    }
}
