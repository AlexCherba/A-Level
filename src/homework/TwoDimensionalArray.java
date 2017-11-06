package HomeWork.Done;

/*Создать двумерный массив из 8 строк по 5 столбцов в каждой из случайных целых чисел из
отрезка [10;99]. Вывести массив на экран.*/

import java.util.Arrays;

public class TwoDimensionalArray {
    public static void main(String[] args) {
        int [][] myArray = new int[8][5];
        for (int i = 0; i < myArray.length; i++){
            for (int j = 0; j < myArray[0].length; j++){
                myArray[i][j] = (int) (Math.random() * 90) + 10;
            }
            System.out.println(Arrays.toString(myArray[i])); // first print method
        }
        System.out.println(Arrays.deepToString(myArray)); // second print method
    }
}

