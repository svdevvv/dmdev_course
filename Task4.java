package com.dmdev.cs.homework;
/*
 * Посчитать четные и нечетные цифры целого числа и вывести их на консоль.
 * Для решения написать 2 функции, которые будут принимать введенное целое число, а возвращать количество четных цифр (вторая функция - нечетных).
 * Например: если введено число 228910, то у него 4 четные цифры (2, 2, 8, 0) и 2 нечетные (9, 1).
 **/

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int value = scanner.nextInt();

        evenNumbers(value);
        System.out.println();
        oddNumbers(value);

//        printOddNumbers(oddNumbers(value));
    }

    private static void evenNumbers(int value) {
        int totalEvenNumbers = 0;
        for (int currentValue = value; currentValue > 0; currentValue /= 10) {
            if (currentValue % 2 == 0) {
                System.out.println(currentValue%10 + " Even Numbers");
                totalEvenNumbers++;
            }
        }
        System.out.println(totalEvenNumbers + " total even numbers");
    }

    private static void oddNumbers(int value) {
        int totalOddNumbers = 0;
        for (int currentValue = value; currentValue > 0; currentValue /= 10) {
            if (currentValue % 2 != 0) {
                System.out.println(currentValue%10 + " Odd Numbers");
                totalOddNumbers++;
            }
        }
        System.out.println(totalOddNumbers + " total odd numbers");
    }
}
//        private static void printOddNumbers(int value){
//            System.out.print("Odd Numbers = " + oddNumbers(value));
//        }
//
//    }
