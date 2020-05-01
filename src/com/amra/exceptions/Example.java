package com.amra.exceptions;

import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Exmaple {
    public static void main(String[] args) {
        try {
            int result = divide();
            System.out.println(result);
        }
        catch (ArithmeticException e){
            System.out.println(e.toString());
            System.out.println("Unable to perform division,autopilot shutting down:)");
        }
    }

    private static int divide(){
        int x;
        int y;

        try{
            x = getInt();
            y =getInt();
            System.out.println("X is " + x + ", y " + y);
            return x/y;
        }
        catch (NoSuchElementException e){
            throw new ArithmeticException("No suitable input!");
        }
        catch (ArithmeticException e){
            throw  new ArithmeticException("Attempt to divide by 0");
        }

    }

    private static int getInt(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter an integer");
        while(true){
            try{
                return scanner.nextInt();
            }
            catch (InputMismatchException e){
                // go round again .Read past the end of line in the input first
                scanner.nextLine();
                System.out.println("Please enter a number using only 0-9");
            }
        }

    }

}
