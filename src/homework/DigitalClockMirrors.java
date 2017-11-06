package HomeWork.Done;

/*Электронные часы показывают время в формате от 00:00 до 23:59. Подсчитать сколько раз за
сутки случается так, что слева от двоеточия показывается симметричная комбинация для той,
что справа от двоеточия (например, 02:20, 11:11 или 15:51).*/

public class DigitalClockMirrors {
    public static void main(String[] args) {
        int luckyCount = 0;

        for (int minHour = 0, maxHour = 23, i = minHour, mirrorMin; i <= maxHour; i++) {
            for (int minMin = 0, maxMin = 59, j = minMin; j <= maxMin; j++) {
                mirrorMin = j % 10 * 10 + j / 10;
                if (mirrorMin == i) {
                    luckyCount++;
                    break;
                }
            }
        }
        System.out.println("Number of mirror time is " + luckyCount); // Итого 16 раз
    }
}
