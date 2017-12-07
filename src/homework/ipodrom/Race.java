package homework.ipodrom;

import java.util.ArrayList;
import java.util.List;

public class Race implements Runnable {
    public static final int TRACKS = 6;
    public static final int LENGTH = 1000;
    public static final int MIN_RATE = 100;
    public static final int MAX_RATE = 10000;
    private static String[] horseNameArray = {"Гнедой", "Хромой", "Бухой", "Яблочко", "Ветерок", "Устрица", "Камыш", "Дикий", "Зая", "Гнедой"};
    private int sumRate;
    private int winHorse = 0;
    private List<Horse> horses = new ArrayList<>();
    private List<Thread> threads = new ArrayList<>();


    {
        initialization();
    }

    public void initialization() {
        this.horses.clear();
        this.threads.clear();
        for (int i = 0; i < horseNameArray.length; i++) {
            this.horses.add(new Horse(horseNameArray[i], i + 1));
        }
        for (Horse horse : horses) {
            this.threads.add(new Thread(horse));
            horse.setRace(this);
        }
    }

    public void run() {
        for (Thread thread : threads) {
            thread.start();
        }
        boolean endRace = false;
        while (!endRace) {
            endRace = true;
            for (Thread thread : threads) {
                if (thread.isAlive()) endRace = false;
            }
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void printTracks() {
        for (int i = 0; i < Race.TRACKS; i++) {
            System.out.println("Номер " +
                    this.getHorses().get(i).getNumber() + ": " +
                    this.getHorses().get(i).getName());
        }
    }

    public void incrementSum(int rate) {
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

    public String getWinNameHorse() {
        return this.horseNameArray[this.winHorse - 1];
    }

    public static String[] getHorseNameArray() {
        return horseNameArray;
    }

    public List<Horse> getHorses() {
        return this.horses;
    }
}
