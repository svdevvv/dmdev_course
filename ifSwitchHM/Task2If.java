package com.dmdev.cs.homework.ifSwitchHM;

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

import java.util.Scanner;

public class Task2If {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double operand1 = scanner.nextDouble();
        double operand2 = scanner.nextDouble();
        char operation = '*';
        System.out.println(operation(operand1,operand2,operation));
    }

    public static double operation(double operand1, double operand2, char operation) {
        double result = 0;
        if (operation == '+') {
           result = operand1 + operand2;
        } else if (operation == '-') {
            result = operand1 - operand2;
        } else if (operation == '*') {
            result = operand1 * operand2;
        } else if (operation == '/') {
            result = operand1 / operand2;
        } else if (operation == '%') {
            result = operand1 % operand2;
        }else{
            System.out.println("Invalid char");
        }
        return result;
    }
}
