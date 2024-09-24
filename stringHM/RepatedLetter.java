package com.dmdev.cs.homework.stringHM;

/**
 * Дана строка.
 * Удалить из нее все повторяющиеся символы без учета регистра, если они идут друг за другом.
 * Также удалить пробелы.
 * Результат привести к верхнему регистру.
 * <p>
 * Например:
 * "abc Cpddd Dio OsfWw" -> "ABCPDIOSFW"
 */

public class RepatedLetter {
    public static void main(String[] args) {
        String value = "abc Cpddd Dio OsfWw";
        String result = removeRepeatedLetter(value);
        System.out.println(result);
    }

    private static String removeRepeatedLetter(String value) {
        StringBuilder result = new StringBuilder();
        value = !value.isEmpty() ? value.toLowerCase().replace(" ", "") : "Строка пуста.";
        result.append(value.charAt(0));
        for (int i = 1; i < value.length(); i++) {
            Character currentChar = value.charAt(i);
            Character previousChar = value.charAt(i - 1);
            if (!currentChar.equals(previousChar)) {
                result.append(currentChar);
            }

        }
        return result.toString().toUpperCase();
    }
}
