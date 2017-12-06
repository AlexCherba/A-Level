package homework.ipodrom;

public class Horse implements Runnable {
    private static final int MIN_RUN_LENGTH = 30;
    private static final int MAX_RUN_LENGTH = 50;
    private static final int MIN_SLEEP_TIME = 300;
    private static final int MAX_SLEEP_TIME = 400;
    private String name;
    private int number;
    private int runLength;
    private int sleepTime;
    private Race race;

    public Horse() {
        this("Noname", 1);
    }

    public Horse(String name, int number) {
        this.name = name;
        this.number = number;
        this.runLength = MIN_RUN_LENGTH + (int) (Math.random() * MAX_RUN_LENGTH);
        this.sleepTime = MIN_SLEEP_TIME + (int) (Math.random() * MAX_SLEEP_TIME);
    }

    public void setRace(Race race) {
        this.race = race;
    }

    public void run() {
        int lenght = 0;
        while (true) {
            if (lenght < Race.LENGTH) {
                lenght += this.runLength;
                printSleep(lenght);
                try {
                    Thread.sleep(this.sleepTime);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            } else {
                if (race.getWinHorse() == 0) {
                    race.setWinHorse(number);
                }
                return;
            }
        }
    }

    public String getName() {
        return name;
    }

    public int getNumber() {
        return number;
    }

    public void printSleep(int lenght) {
        System.out.println(this.name + " пробежал " + runLength + " м (всего " + lenght + " м) и засыпает на " + sleepTime + " мс");
    }
}
