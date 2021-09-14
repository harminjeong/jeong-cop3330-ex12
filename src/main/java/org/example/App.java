/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Harmin Jeong
 */
package org.example;
import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the principal: ");
        double principal = input.nextDouble();
        System.out.print("Enter the rate of interest: ");
        double interest = input.nextDouble();
        System.out.print("Enter the number of years: ");
        double years = input.nextDouble();

        double total = Math.round(principal*(1+((interest/100)*years))*100.0)/100.0;

        System.out.println("After "+years+" years at "+interest+"%, the investment will be worth $"+total+".");
    }
}
