package com.dmdev.cs.homework.arrayHM;

/**
 * Задание 1
 * Дан одномерный массив целых чисел.
 * Написать функцию, удаляющую из него все отрицательные элементы (удалить - значит создать новый массив с только положительными элементами).
 * После удаления - умножить каждый элемент массива на его длину.
 * Например: [3, 5, -6, 3, 2, -9, 0, -123] -> [15, 25, 15, 10, 0]
 */
public class Task1 {
    public static void main(String[] args) {
        int[] values = {3, 5, -6, 3, 2, -9, 0, -123};
        printArray(positiveArray(values));

    }

    private static int[] positiveArray(int[] array) {
        int positiveValues = 0;
        for (int value : array) {
            if (value >= 0) {
                positiveValues++;
            }
        }
        int[] bufferArray = new int[positiveValues];
        int index = 0;
        for (int value : array) {
            if(value>=0){
                bufferArray[index++] = value;
            }
        }
        int length = bufferArray.length;
        int[] positiveArray = new int[length];
        for (int currentValue = 0; currentValue < length; currentValue++) {
            positiveArray[currentValue] = bufferArray[currentValue] * length;
        }
        return positiveArray;
    }

    public static void printArray(int[] array) {
        for (int i : array) {
            System.out.print(i + " ");
        }
    }

}


