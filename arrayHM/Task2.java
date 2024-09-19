package com.dmdev.cs.homework.arrayHM;

/**
 * Дан одномерный массив символов.
 * Преобразовать его в одномерный массив чисел, где число - это код символа ь
 * (любой символ - это число в памяти компьютера).
 * Например: [‘a’, ‘6’, ‘y’, ‘P’, ‘T’, ‘q’, ‘9’, ‘+’] -> [97, 54, 121, 80, 84, 113, 57, 43]
 * Далее определить среднее арифметическое всех элементов целочисленного массива и
 * вывести на консоль только те элементы, которые больше этого среднего арифметического.
 */

public class Task2 {
    private static final int AVERAGE_VALUE = 81;
    public static void main(String[] args) {
        char[] chars = {'a', '6', 'y', 'P', 'T', 'q', '9', '+'};
//        convertCharToInt(chars);
        System.out.println();
        Task1.printArray(createIntArray(chars));
        System.out.println();
        Task1.printArray(averageValues(createIntArray(chars)));
    }


//    private static void convertCharToInt(char[] array) {
//        int countOfElements = 0;
//        for (char chars : array) {
//            System.out.print((int)chars + " ");
//            countOfElements++;
//        }
//    }
    private static int[] createIntArray(char[]array){
        int arrayLength = 0;
        for (int currentValue = 0; currentValue < array.length; currentValue++) {
            arrayLength++;
        }
        int[] values = new int[arrayLength];
        int index = 0;
        for(int c : array) {
            values[index++] = c;
        }
        return values;
    }
    private static int[] averageValues(int[] array){ // =81.125
     int averageElements = 0;
        for (int currentValue : array) {
            averageElements+= currentValue;
        }
        int average = averageElements / array.length;
        int countAverageNumbers = 0;
        for (int currentValue : array) {
            if(currentValue>average){
            countAverageNumbers++;
            }
        }
        int[]resultArray = new int[countAverageNumbers];
        int index = 0;
        for (int currentValue : array) {
            if (currentValue>average){
                resultArray[index++] = currentValue;
            }

        }
        return resultArray;
        }

}

