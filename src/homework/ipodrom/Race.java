package homework.ipodrom;

import java.util.ArrayList;
import java.util.List;

public class Race {
    public static final int TRACKS = 6;
    public static final int LENGTH = 1000;
    public static final int MIN_RATE = 100;
    public static final int MAX_RATE = 10000;
    private static String[] horseNameArray = {"Гнедой", "Хромой", "Бухой", "Яблочко", "Ветерок", "Устрица", "Камыш", "Дикий", "Зая", "Гнедой"};
    private int sumRate;
    private int winHorse;
    private List<Horse> horseList = new ArrayList<>();

    {
        initialization();
    }

    public void initialization() {
        for (int i = 0; i < horseNameArray.length; i++) {
            this.horseList.add(new Horse(horseNameArray[i], i + 1));
        }
    }

    public void increaseSum(int rate) {
        this.sumRate += rate;
    }

    public int getSumRate() {
        return this.sumRate;
    }

    public void setSumRate(int sumRate) {
        this.sumRate = sumRate;
    }

    public int getWinHorse() {
        return this.winHorse;
    }

    public void setWinHorse(int winHorse) {
        this.winHorse = winHorse;
    }

    public static String[] getHorseNameArray() {
        return horseNameArray;
    }

    public List<Horse> getHorseList() {
        return this.horseList;
    }
}
