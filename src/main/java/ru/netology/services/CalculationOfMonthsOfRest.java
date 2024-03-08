package ru.netology.services;

public class CalculationOfMonthsOfRest {
    public int calculate(int income, int expenses, int threshold) {
        int count = 0; // счётчик месяцев отдыха
        int money = 0; // количество денег на счету

        for (int month = 1; month <= 12; month++) {
            if (money < threshold) {
                System.out.println(" Месяц " + month + " . " + " Денег " + money + " . " + " Придется работатью Заработал + " + income + " , " + " потратил - " + expenses);
                money = money + income - expenses;
            } else {
                int spendingMore = (money - expenses) - ((money - expenses) / 3);
                System.out.println(" Месяц " + month + " . " + " Денег " + money + " . " + " Буду отдыхать. Потратил - " + expenses + " , " + " затем еще - " + spendingMore);
                money = (money - expenses) / 3;

                count++;

            }
        }

        return count;
    }

}
