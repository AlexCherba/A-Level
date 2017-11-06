package HomeWork.Done;

import java.util.Scanner;

/*В переменной n хранится натуральное двузначное число. Создайте программу,
вычисляющую и выводящую на экран сумму цифр числа n (n – вводит
пользователь).*/

public class SumN {
    static int n;

    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        n = myScanner.nextInt();
        int sumFirstAndSecond = n / 10 + n % 10;
        System.out.println("Sum first and second numeral: " + sumFirstAndSecond);

    }
}
