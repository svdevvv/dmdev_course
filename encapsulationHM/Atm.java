package com.dmdev.cs.homework.encapsulationHM;

/**
 * Cоздать класс, описывающий банкомат.
 * Банкомат задается тремя свойствами:
 * - количеством купюр номиналом 10, 20 и 50.
 * Создать конструктор с тремя параметрами - количеством купюр каждого номинала.
 * Сделать методы для добавления денег в банкомат.
 * Сделать метод, снимающий деньги: он принимает сумму денег,
 * а возвращает булево значение - успешность выполнения операции.
 * При снятии денег метод должен распечатывать каким количеством купюр какого номинала выдаётся сумма.
 * Сначала банкомат будет пытаться рассчитаться 50, далее добавит недостающие 20, и только затем 10
 * (не нужно рассматривать более сложные варианты выдачи наличных, чтобы не усложнять алгоритм).
 */

public class Atm {
    private static final int BANKNOTE_10 = 10;
    private static final int BANKNOTE_20 = 20;
    private static final int BANKNOTE_50 = 50;


    private int firstTypeBanknote; // 10
    private int secondTypeBanknote; // 20
    private int thirdTypeBanknote; // 50

    public Atm(int firstTypeBanknote, int secondTypeBanknote, int thirdTypeBanknote) {
        this.firstTypeBanknote = firstTypeBanknote;
        this.secondTypeBanknote = secondTypeBanknote;
        this.thirdTypeBanknote = thirdTypeBanknote;
    }

    public void addMoney(int firstTypeBanknote, int secondTypeBanknote, int thirdTypeBanknote) {
        this.firstTypeBanknote += firstTypeBanknote;
        this.secondTypeBanknote += secondTypeBanknote;
        this.thirdTypeBanknote += thirdTypeBanknote;
        System.out.println("Добавлено с помощью:"
                + firstTypeBanknote + " десяток, " +
                secondTypeBanknote + " двадцаток, " +
                thirdTypeBanknote + " пятидесяток.");
    }

    public boolean withdrawMoney(int value) {

        int balance = value;
        int firstTypeBanknotesCount = 0;
        int secondTypeBanknotesCount = 0;
        int thirdTypeBanknotesCount = 0;
        if (value > getTotalMoney()) {
            System.out.println("Недостаточно денег в банкомате");
            return false;
        }
        firstTypeBanknotesCount = Math.min(value / 10, firstTypeBanknote);
        value -= firstTypeBanknotesCount * 10;
        secondTypeBanknotesCount = Math.min(value / 20, secondTypeBanknote);
        value -= secondTypeBanknotesCount * 20;
        thirdTypeBanknotesCount = Math.min(value / 50, thirdTypeBanknote);
        value -= thirdTypeBanknotesCount * 50;

        if (value != 0) {
            System.out.println("Нехватает денег в банкомате!");
            return false;
        }
        firstTypeBanknote -= firstTypeBanknotesCount;
        secondTypeBanknote -= secondTypeBanknotesCount;
        thirdTypeBanknote -= thirdTypeBanknotesCount;


        System.out.println("Снято наличности: " + balance + " с помощью:");
        System.out.println(firstTypeBanknotesCount + " десяток, " +
                secondTypeBanknotesCount + " двадцаток, " +
                thirdTypeBanknotesCount + " пятидесяток.");
        return true;
    }


    public int getTotalMoney() {
        return firstTypeBanknote * BANKNOTE_10 + secondTypeBanknote * BANKNOTE_20 + thirdTypeBanknote * BANKNOTE_50;
    }


}