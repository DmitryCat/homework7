import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        System.out.println("Задание 1");
        int i = 0;
        int sum = 2459000;
        while (sum > 0) {
            sum = sum - 15000;
            i++;
        }
        System.out.println(i);
        System.out.println("Задание 2");
        int a = 0;
        while (a < 10) {
            a++;
            System.out.print(a + " ");
        }
        System.out.println();
        for (; a > 0; a--) {
            System.out.print(a + " ");
        }
        System.out.println();
        System.out.println("Задание 3");
        System.out.println();
        int fertility = 17;
        int mortality = 8;
        int number = 12000000;
        for (int j = 1; j <= 10; j++) {
            number = number + number / 1000 * (fertility - mortality);
            System.out.println("Год " + j + " численность населения равна " + number);
        }
        System.out.println("Задание 4");
        int summ = 15000;
        int month = 0;
        while (summ < 12000000) {
            summ = summ + summ * 7 / 100;
            month++;
            System.out.println("В месяц " + month + " накопления равны " + summ);
        }
        System.out.println("Всего месяцев потребуется " + month);
        System.out.println("Задание 5");
        int summ1 = 15000;
        int month1 = 0;
        while (summ1 < 12000000) {
            summ1 = summ1 + summ1 * 7 / 100;
            month1++;
            if (month1 % 6 == 0) {
                System.out.println("В месяц " + month1 + " накопления равны " + summ1);
            }
        }
        System.out.println("Задание 6");
        int money = 15000;
        int m = 0;
        while (m < 9 * 12) {
            money = money + money * 7 / 100;
            m++;
            if (m % 6 == 0) {
                System.out.println("В месяц " + m + " сумма накоплений равна " + money);
            }
        }
        System.out.println("Задание 7");
        for (int day = 5; day <= 31; day += 7) {
            System.out.println("Сегодня пятница, " + day + "-ое число. Необходимо подготовить отчет.");
        }
        System.out.println("Задание 8");
        int today = 2023;
        int lastYear = today - 200;
        int nextYear = today + 100;
        for (int n = lastYear; n <= nextYear ; n++) {
            if (n%79==0) {
                System.out.println(n);
            }
        }
    }
}




