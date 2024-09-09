package com.dmdev.cs.homework;

import java.util.Scanner;
//Даны 3 переменные:
//
//        - operand1 (double)
//- operand2 (double)
//- operation (char ‘+’, ‘-’, ‘*’, ‘/’, ‘%’)
//
//        Написать функцию, которая принимает в качестве параметров эти три переменные и возвращает результат операции.
//Протестировать функцию в main.
//
//Например:
//Параметры: operand1 = 24.4, operand2 = 10.1, operation = ‘+’
//Результат: 34.5 (24.4 + 10.1)

public class Task2Switch {
    public final static char ADDITION = '+';
    public final static char SUBTRACTION = '-';
    public final static char MULTIPLICATION = '*';
    public final static char DIVISION = '/';
    public final static char MODULUS = '%';
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double operand1 = scanner.nextDouble();
        double operand2 = scanner.nextDouble();
        System.out.println(calculate(operand1,operand2,'+'));

    }
    private static double addition(double operand1, double operand2) {
        return operand1 + operand2;
    }
    private static double subtraction(double operand1, double operand2) {
        return operand1 - operand2;
    }
    private static double multiplication(double operand1, double operand2) {
        return operand1 * operand2;
    }
    private static double division(double operand1, double operand2) {
        return operand1 / operand2;
    }
    private static double modulus(double operand1, double operand2) {
        return operand1 % operand2;
    }

    private static double calculate(double operand1, double operand2, char operation) {
        return switch (operation) {
            case ADDITION -> addition(operand1, operand2);
            case SUBTRACTION -> subtraction(operand1, operand2);
            case MULTIPLICATION -> multiplication(operand1, operand2);
            case DIVISION -> division(operand1, operand2);
            case MODULUS -> modulus(operand1,  operand2);
            default -> throw new IllegalArgumentException("Invalid mathematical operation");
        };
    }
}
