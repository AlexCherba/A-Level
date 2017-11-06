package HomeWork.Done;

/*
Дан массив натуральных чисел. Найти сумму элементов, кратных данному K.
*/

public class SumElementMassiveK {
    public static void main(String[] args) {
        int[] arr01 = {5, 3, 5, 8, 1, 10, 4, 15};
        System.out.println(sumArray(3, arr01));
    }

    static int sumArray(int k, int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % k == 0) {
                sum = sum + arr[i];
            }
        }
        return sum;
    }
}
