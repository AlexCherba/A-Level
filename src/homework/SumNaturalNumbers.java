package HomeWork.Done;

/*Для введённого пользователем с клавиатуры натурального числа посчитайте сумму всех его
цифр (заранее не известно сколько цифр будет в числе).*/

import java.util.Scanner;

public class SumNaturalNumbers {
    public static void main(String[] args) {
        String userNumber = inputNumber();
        int sumNumber = sumNumber(userNumber);
        printNumber(sumNumber);
    }

    static String inputNumber() {
        Scanner myScanner = new Scanner(System.in);
        String userNumber = myScanner.next();
        return userNumber;
    }

    static int sumNumber(String userNumber) {
        int sumNumber = 0;
        for (int i = 0; i < userNumber.length(); i++) {
            sumNumber += userNumber.charAt(i) - 48; //48 - смешение юникода цифр в таблице
        }
        return sumNumber;
    }

    static void printNumber(int outNumber) {
        System.out.println("Sum of numbers is " + outNumber);
    }
}
