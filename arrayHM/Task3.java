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

        int[][] result = allArrays(positiveArray(values),oddArray(values),zeroArray(values));
        print2DArray(result,positiveArray(values).length,oddArray(values).length,zeroArray(values).length);
    }

    private static int[][] allArrays(int[] array1, int[] array2, int[] array3) {
        int maxLength = 0;
        if (array1.length > array2.length && array1.length > array3.length) {
            maxLength = array1.length;
        } else if (array2.length > array1.length && array2.length > array3.length) {
            maxLength = array2.length;
        } else if (array3.length > array1.length && array3.length > array2.length) {
            maxLength = array3.length;
        } else if (array1.length == array2.length && array1.length == array3.length) {
            maxLength = array1.length;
        }
        int[][] allArrays = new int[3][maxLength];
        for (int firstArray = 0; firstArray < array1.length; firstArray++) {
            allArrays[0][firstArray] = array1[firstArray];
        }
        for (int secondArray = 0; secondArray < array2.length; secondArray++) {
            allArrays[1][secondArray] = array2[secondArray];
        }
        for (int thirdArray = 0; thirdArray < array3.length; thirdArray++) {
            allArrays[2][thirdArray] = array3[thirdArray];
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

    public static void print2DArray(int[][] array, int length1, int length2, int length3) {
        int[] lengths = {length1, length2, length3};
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < lengths[i]; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }

}
