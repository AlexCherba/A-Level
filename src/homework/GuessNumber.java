package HomeWork.Done;

import java.util.Scanner;

/*Игра “угадай число”. Пользователь вводит число от 1 до 10. Программа сама
выбирает число и выводит угадал пользователь или нет(почитать про генерацию
псевдослучайных чисел в java)*/

public class GuessNumber {
    public static void main(String[] args) {
        int minNumber = 1;
        int maxNumber = 9;

        System.out.print("Input a number from 1 to 10: ");
        Scanner myScanner = new Scanner(System.in);
        int userNumber = myScanner.nextInt();
        int computerNumber = (int) (Math.random() * maxNumber) + minNumber; // Генерация числа

        System.out.println(userNumber == computerNumber ? "You have guessed" : "You haven't guessed. My number is " + computerNumber);
    }
}
