/*
 *  UCF COP3330 Fall 2021 Assignment 22 Solution
 *  Copyright 2021 Melanie Ehrlich
 */

import java.util.Scanner;
public class App {
    public static void main(String[] args) {
        double n1, n2, n3, largest = 0;
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        n1 = input.nextDouble();

        System.out.print("Enter the second number: ");
        n2 = input.nextDouble();

        System.out.print("Enter the third number: ");
        n3 = input.nextDouble();

        if (n1 == n2 || n1 == n3 || n2 == n3) {
            return;
        }

        if (n1 > n2 && n1 > n3)
            largest = n1;

        else if (n2 > n1 && n2 > n3)
            largest = n2;
        
        else if (n3 > n1 && n3 > n2)
            largest = n3;

        System.out.printf("The largest number is %f.", largest);
    }
}