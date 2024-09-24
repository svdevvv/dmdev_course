package com.dmdev.cs.homework.stringHM;

/**
 * Дана строка с текстом, в котором есть цифры от 0 до 9.
 * Написать 2 метода:
 * <p>
 * - возвращающий массив цифр из переданной строки
 * - возвращающий сумму цифр из переданного целочисленного массива
 * <p>
 * Посчитать сумму всех чисел из строки
 * <p>
 * Например:
 * “Привет 8, как 1 2 твои дела? Может4, сделать 3 дело?” -> 18 (8+1+2+4+3)
 */

public class SumNumbers {
    public static void main(String[] args) {
        String value = "Привет 8, как 1 2 твои дела? Может4, сделать 3 дело?";
        int[] numArray = createNumArray(value);
        print(numArray);
        System.out.println();
        System.out.println(sum(numArray));

    }
    public static int sum(int[] array){
        int sum = 0;
        for (int i : array) {
            sum+=i;
        }
        return sum;
    }


    public static int[] createNumArray(String value) {
        StringBuilder values = new StringBuilder();
        for (int i = 0; i < value.length(); i++) {
            if (Character.isDigit(value.charAt(i))) {
                values.append(value.charAt(i));
            }
        }
        int[] arrayNum = new int[values.length()];
        for (int i = 0; i < values.length(); i++) {
            arrayNum[i] = Character.getNumericValue(values.charAt(i));
        }
        return arrayNum;
    }
    public static void print(int[] values){
        for (int value : values) {
            System.out.print(value + " ");
        }
    }

}
