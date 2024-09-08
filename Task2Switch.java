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
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double operand1 = scanner.nextDouble();
        double operand2 = scanner.nextDouble();
        System.out.println(operation(operand1,operand2,'*'));

    }

    public static double operation(double operand1, double operand2, char operation) {
        double result = 0;
        switch (operation) {
            case '+' -> result = operand1 + operand2;
            case '-' -> result = operand1 - operand2;
            case '*' -> result = operand1 * operand2;
            case '/' -> result = operand1 / operand2;
            case '%' -> result = operand1 % operand2;
            default -> result = 0;
        }
        return result;
    }
}
