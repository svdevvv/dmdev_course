package com.dmdev.cs.homework.ForWhileHM;

import java.util.Scanner;

/**
 *Дано целое число.
 * Написать функцию, которая принимает целое число, а возвращает целое число обратное этому (не строку!).
 * Результат вывести на консоль.
 * Например: 4508 -> 8054, 4700 -> 74, 1234567 -> 7654321
 * Примечание: для решения может понадобится функция возведение числа в степень: Math.pow(число, степень)
 *
 */

public class Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int value = scanner.nextInt();
        int result = reverseNumber(value);
        System.out.println(result);
    }

    private static int reverseNumber(int value) {
        int result = 0;
        while(value !=0){
            result = result * 10 + value % 10;
            value/=10;
        }
        return result;
        }


    }
