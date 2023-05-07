package src.Homework;

import java.util.Scanner;

public class wewfpi {
    public static void main(String[] args) {
        Scanner scan;
        scan = new Scanner (System.in);

        public static double addition (double operand1, double operand2) {
            return operand1 + operand2;
        }

        public static double subtraction(double operand1, double operand2) {
            return operand1 - operand2;
        }

        public static double multiplication(double operand1, double operand2) {
            return operand1 * operand2;
        }

        public static double division(double operand1, double operand2) {
            if (operand2 == 0) {
                throw new IllegalArgumentException("Cannot divide by zero!");
            }
            return operand1 / operand2;
        }

        public static double calculate(String operation, double operand1, double operand2) {
            if (int operation.equals("addition")) {
               int result = addition(operand1, operand2);
            } else if (operation.equals("subtraction")) {
                int result = subtraction(operand1, operand2);
            } else if (operation.equals("multiplication")) {
                int result =  multiplication(operand1, operand2);
            } else if (operation.equals("division")) {
                int result =   division(operand1, operand2);
            }
        }
    }
}
