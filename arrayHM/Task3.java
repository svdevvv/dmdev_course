package com.dmdev.cs.homework.arrayHM;

/**
 * Дан одномерный массив целых чисел.
 * Написать функцию, которая принимает этот массив и разбивает на 3 других:
 * с только отрицательными числами, только положительными и только нули.
 * Если для какого-то из массивов не будет значений, то должен быть создан пустой массив.
 * Возвращает функция эти три массива в виде одного двумерного.
 * Пример:
 * [-4, 0, 1, 9, 0, -18, 3] -> [0, 0], [-4, -18], [1, 9, 3]
 */
public class Task3 {
    public static void main(String[] args) {
        int[] values = {-4, 0, 1, 9, 0, -18, 3};
        Task1.printArray(positiveArray(values));
        System.out.println();
        Task1.printArray(oddArray(values));
        System.out.println();
        Task1.printArray(zeroArray(values));
        System.out.println();
        System.out.println((allArrays(positiveArray(values),oddArray(values),zeroArray(values))));
    }

    private static int[][] allArrays(int[] array1, int[] array2, int[] array3) {
        int firstArray = 0;
        for (int currentValue : array1) {
            firstArray++;
        }
        int secondArray = 0;
        for (int currentValue : array2) {
            secondArray++;
        }
        int thirdArray = 0;
        for (int currentValue : array3) {
            thirdArray++;
        }
        int[][] allArrays = new int[firstArray][secondArray];
        int firstIndex = 0;
        int secondIndex = 0;
        for (int countFirst : array1) {
            for (int countSecond : array2) {
                allArrays[firstIndex++][countSecond] = countFirst;
                allArrays[firstIndex][secondIndex++] = countFirst;
            }
        }
        return allArrays;
    }

    private static int[] positiveArray(int[] array) {
        int countPositiveNumbers = 0;
        for (int currentValue : array) {
            if (currentValue > 0) {
                countPositiveNumbers++;
            }
        }
        int[] bufferArray = new int[countPositiveNumbers];
        int index = 0;
        for (int currentValue : array) {
            if (currentValue > 0) {
                bufferArray[index++] = currentValue;
            }
        }
        int length = bufferArray.length;
        int[] positiveArray = new int[length];
        for (int currentValue = 0; currentValue < positiveArray.length; currentValue++) {
            positiveArray[currentValue] = bufferArray[currentValue];
        }
        return positiveArray;
    }

    private static int[] oddArray(int[] array) {
        int countOddNumbers = 0;
        for (int currentValue : array) {
            if (currentValue < 0) {
                countOddNumbers++;
            }
        }
        int[] bufferArray = new int[countOddNumbers];
        int index = 0;
        for (int currentValue : array) {
            if (currentValue < 0) {
                bufferArray[index++] = currentValue;
            }
        }
        int length = bufferArray.length;
        int[] oddArray = new int[length];
        for (int currentValue = 0; currentValue < oddArray.length; currentValue++) {
            oddArray[currentValue] = bufferArray[currentValue];
        }
        return oddArray;
    }

    private static int[] zeroArray(int[] array) {
        int counterZeroNumbers = 0;
        for (int currentValue : array) {
            if (currentValue == 0) {
                counterZeroNumbers++;
            }
        }
        int[] bufferArray = new int[counterZeroNumbers];
        int index = 0;
        for (int currentValue : array) {
            if (currentValue == 0) {
                bufferArray[index++] = currentValue;
            }
        }
        int length = bufferArray.length;
        int[] zeroArray = new int[length];
        for (int currentValue = 0; currentValue < zeroArray.length; currentValue++) {
            zeroArray[currentValue] = bufferArray[currentValue];
        }
        return zeroArray;
    }

}
