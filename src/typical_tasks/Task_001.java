package typical_tasks;

/*
1. Дан массив натуральных чисел. Найти сумму элементов, кратных данному K
*/

import java.util.Scanner;

public class Task_001 {

    public static void main(String[] args) {

        int[] naturalArray = new int[1000];
        for (int i = 0; i < naturalArray.length; i++) {
            naturalArray[i] = i + 1;
        }
        System.out.println("Дан массив натуральных чисел из " + naturalArray.length + " элементов");
        System.out.print("Введите целое число:" );
        Scanner scanner = new Scanner(System.in);
        int k = scanner.nextInt();
        int sumNum = 0;
        for (int i : naturalArray) {
            if (i % k == 0) {
                sumNum += i;
                System.out.println(sumNum);
            }
        }
        System.out.println("Сумма элементов, кратных данному числу равна " + sumNum);
    }
}
