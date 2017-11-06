package HomeWork.Done;

/*Cоздать двумерный массив из 7 строк по 4 столбца в каждой из случайных целых чисел из
отрезка [-5;5]. Вывести массив на экран. Определить и вывести на экран индекс строки с
наибольшим по модулю произведением элементов. Если таких строк несколько, то вывести
индекс первой встретившейся из них.*/

import java.util.Arrays;

public class TwoModulArray {
    public static void main(String[] args) {
        int maxIndex = 0;
        int maxMulti = 0;
        int currentMulti;
        int[][] myArray = new int[7][4];
        for (int i = 0; i < myArray.length; i++) {
            currentMulti = 1;
            for (int j = 0; j < myArray[0].length; j++) {
                myArray[i][j] = (int) (Math.random() * 11) - 5;
                currentMulti *= Math.abs(myArray[i][j]);
            }
            if (maxMulti < currentMulti) {
                maxMulti = currentMulti;
                maxIndex = i;
            }
            System.out.println(Arrays.toString(myArray[i]));
            //System.out.println(maxIndex + " "+ maxMulti);
        }
        System.out.println("Max index array is " + maxIndex);
    }
}
