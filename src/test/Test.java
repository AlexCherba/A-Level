package HomeWork;

/*Cоздать двумерный массив из 7 строк по 4 столбца в каждой из случайных целых чисел из
отрезка [-5;5]. Вывести массив на экран. Определить и вывести на экран индекс строки с
наибольшим по модулю произведением элементов. Если таких строк несколько, то вывести
индекс первой встретившейся из них.*/

import java.util.Arrays;

public class Test {
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
            //System.out.println(Arrays.toString(myArray[i]));
            //System.out.println(maxIndex + " "+ maxMulti);
        }
        System.out.println(Arrays.toString(myArray[0]));
        Arrays.sort(myArray[0]);
        System.out.println(Arrays.toString(myArray[0]));
        System.out.println();
        System.out.println(Arrays.toString(myArray[1]));
        Arrays.fill(myArray[1], 555);
        System.out.println(Arrays.toString(myArray[1]));
        System.out.println();
        System.out.println(Arrays.toString(myArray[2]));
        System.out.println(Arrays.equals(myArray[2],myArray[2]));
        System.out.println();


        // initializing unsorted int array
        int intArr[] = {30,20,5,12,55};

        // sorting array
        Arrays.sort(intArr) ;

        // let us print all the elements available in list
        System.out.println("The sorted int array is:") ;
        for (int number : intArr) {
            System.out.println("Number = " + number) ;
        }

        // entering the value to be searched
        int searchVal = 13;

        int retVal = Arrays.binarySearch(intArr,searchVal) ;

        System.out.println("The index of element 12 is : " + retVal) ;
    }
}
