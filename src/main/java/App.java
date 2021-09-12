/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Dave Gershman
 */

import java.util.Scanner;

public class App
{
    public static String GetInput(String request) {
        Scanner scanner = new Scanner(System.in);

        System.out.print(request);
        return scanner.nextLine();
    }

    public enum operation {
        add, subtract, multiply, divide
    }

    public static String EvalMath(String n1, String n2, operation op) {
        double solution = 0;
        String opSymbol = "";

        double num1 = Double.parseDouble(n1);
        double num2 = Double.parseDouble(n2);

        switch (op) {
            case add:
                opSymbol = "+";
                solution = num1 + num2;
                break;
            case subtract:
                opSymbol = "-";
                solution = num1 - num2;
                break;
            case multiply:
                opSymbol = "*";
                solution = num1 * num2;
                break;
            case divide:
                opSymbol = "/";
                solution = num1 / num2;
                break;
        }

        return String.format("%s %s %s = %.0f", n1, opSymbol, n2, solution);
    }

    public static void main( String[] args )
    {
        String num1 = GetInput("What is the first number? ");
        String num2 = GetInput("What is the second number? ");

        String add = EvalMath(num1, num2, operation.add);
        String sub = EvalMath(num1, num2, operation.subtract);
        String mul = EvalMath(num1, num2, operation.multiply);
        String div = EvalMath(num1, num2, operation.divide);

        System.out.print(add + "\n" + sub + "\n" + mul + "\n" + div);
    }
}