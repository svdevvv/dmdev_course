package com.dmdev.cs.homework.ForWhileHM;
/*
 * Программист Ваня сразу после окончания курсов dmdev устроился в IT компанию на позицию
 * Junior Java Developer с зарплатой 600$ в месяц.
 * Ему обещали, что будут поднимать зарплату на 400$ каждые 6 месяцев.
 * 300$ в месяц Ваня тратит на еду и развлечения.
 * 10% от зарплаты Ваня ежемесячно переводит на счет брокера, чтобы инвестировать в акции
 * с доходностью 2% в месяц.
 * Посчитать, сколько Ваня будет иметь средств на своем счету и на счету брокера за 3 года и 2 месяца.
 */

import java.util.Scanner;

public class Task6 {
    private final static int SALARY_INCREASE = 400;
    private final static int MONTH_FOR_SALARY_INCREASE = 6;
    private final static int MONEY_FOR_SPEND = 300;
    private final static double PERCENT_FOR_BROKER = 0.10;
    private final static double PERCENT_FROM_BROKER = 0.02;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double salary = 600.0;
        int workingMonth = scanner.nextInt();
        System.out.println("Общий баланс после вычета расходов = " + getMainBalance(+salary, workingMonth));
        // в общий баланс уже добавлена сумма из баланса брокера
        System.out.println("Баланс на счету брокера = " + balanceAfterBroker(salary, workingMonth));
    }


    private static double totalSalary(double salary, int workingMonth) {
        double newSalary = 0;
        for (int month = 1; month <= workingMonth; month++) {
            newSalary += salary;
            if (month % MONTH_FOR_SALARY_INCREASE == 0) {
                salary += SALARY_INCREASE;
            }
        }
        return newSalary;
    }

    private static double brokerBalance(double salary, int workingMonth) {
        double newBalance = 0;
        for (int month = 1; month <= workingMonth; month++) {
            newBalance += salary * PERCENT_FOR_BROKER;
            if (month % MONTH_FOR_SALARY_INCREASE == 0) {
                salary += SALARY_INCREASE;
            }
        }
        return newBalance;
    }

    private static double balanceAfterBroker(double salary, int workingMonth) {
        double balance = 0;
        double newBalance = 0;
        for (int month = 1; month <= workingMonth; month++) {
            balance += salary * PERCENT_FOR_BROKER;
            newBalance += balance * PERCENT_FROM_BROKER;
            if (month % MONTH_FOR_SALARY_INCREASE == 0) {
                salary += SALARY_INCREASE;
            }
        }
        return newBalance;
    }

    private static double spendBalance(int workingMonth) {
        int spendBalance = 0;
        for (int month = 1; month < workingMonth; month++) {
            spendBalance += MONEY_FOR_SPEND;
        }
        return spendBalance;
    }

    private static double getMainBalance(double salary, int workingMonth) {
        return totalSalary(salary, workingMonth) - spendBalance(workingMonth) -
                brokerBalance(salary, workingMonth) + balanceAfterBroker(salary, workingMonth);
    }
}
