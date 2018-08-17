package com.mahakagg;

import java.util.Scanner;

class Main {

    private void calculate(){
        Calculator c = new Calculator();
        boolean flag = false;
        Scanner scan = new Scanner(System.in);

        label:
        while (!flag) {
            System.out.println("Enter first number");
            float num1 = scan.nextFloat();
            System.out.println("select from +, -. *, /, %");
            char opType = scan.next().charAt(0);
            System.out.println("Enter second number");
            float num2 = scan.nextFloat();
            switch (opType) {
                case '+':
                    System.out.println("Result = " + c.addition(num1, num2));
                    break;
                case '-':
                    System.out.println("Result = " + c.subtraction(num1, num2));
                    break;
                case '*':
                    System.out.println("Result = " + c.multiplication(num1, num2));
                    break;
                case '/':
                    System.out.println("Result = " + c.division(num1, num2));
                    break;
                case '%':
                    System.out.println("Result = " + c.mod(num1, num2));
                    break;
                default:
                    System.out.println("There was an error");
                    break;

            }
            System.out.println("Would you like to calculate again? Y/N");
            Scanner scan2 = new Scanner(System.in);
            String ans = scan2.nextLine().toUpperCase();

            switch (ans) {
                case "Y":
                    flag = false;
                    break;
                case "N":
                    flag = true;
                    break;
                default:
                    System.out.println("Error; Exited");
                    break label;
            }

        }


    }
    public static void main(String[] args) {
        Main m = new Main();
        m.calculate();
    }
}
