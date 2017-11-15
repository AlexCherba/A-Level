package typical_tasks;

/*
2. В целочисленной последовательности есть нулевые элементы. Создать массив из номеров этих элементов
*/

import java.util.Arrays;

public class Task_002 {

    public static void main(String[] args) {
        int[] intArray = createArray();
        int[] numArray = new int[0];

        for (int i = 0; i < intArray.length; i++) {
            if (intArray[i] == 0) {
                int[] tmpArray = new int[numArray.length+1];  // Выделяется память под новый массив нового //размера
                System.arraycopy(numArray, 0, tmpArray, 0, numArray.length); // Копируются данные из старого в новый
                numArray = tmpArray;
                numArray[numArray.length - 1] = i;
            }
        }

        System.out.println("Рандомный массив: " + Arrays.toString(intArray));
        System.out.println("Массив из номеров нулевых элементов выше показанного массива: " + Arrays.toString(numArray));
    }

    public static int[] createArray(){
        int[] intArray = new int[100];
        for (int i = 0; i < intArray.length; i++) {
            intArray[i] = (int) (Math.random() * 100);
        }
        return intArray;
    }
}
