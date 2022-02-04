package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        //syntax

        int[] arr = new int[7];


        // input using for loop

        for( int i=0; i<7; i++)
        {
            System.out.print("Enter the " + i +"th element of the array: ");
            arr[i]= input.nextInt();
        }

        for( int i=0; i<7; i++)
        {
            System.out.print("The " + i +"th element of the array is: " + arr[i]);

        }
}