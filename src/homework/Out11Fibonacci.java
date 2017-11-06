package HomeWork.Done;

import java.util.Scanner;

/*Выведите на экран первые 11 членов последовательности Фибоначчи. Напоминаем, что
первый и второй члены последовательности равны единицам, а каждый следующий — сумме
двух предыдущих.*/

public class Out11Fibonacci {
    public static void main(String[] args) {
        int fNumber = 11;
        printFibonacciSeries(fNumber);
    }

    static void printFibonacciSeries(int fNumber) {
        int number1 = 0, number2 = 1, number3;
        System.out.print("Out 11 numbers of Fibonacci: 1"); // 1 1 2 3 5 8 13 21 34 55 89
        for (int i = 0; i < 10; i++) {
            number3 = number1 + number2;
            System.out.print(" " + number3);
            number1 = number2;
            number2 = number3;
        }
    }

}
