package homework.ipodrom;

public class Horse {
    private static final int MIN_RUN_LENGTH = 30;
    private static final int MAX_RUN_LENGTH = 50;
    private static final int MIN_SLEEP_TIME = 300;
    private static final int MAX_SLEEP_TIME = 400;
    private String name;
    private int number;
    private int rumLength;
    private int sleepTime;

    public Horse(){
        this("Noname",1);
    }
    public Horse(String name, int number) {
        this.name = name;
        this.number = number;
        this.rumLength = MIN_RUN_LENGTH + (int) (Math.random() * MAX_RUN_LENGTH);
        this.sleepTime = MIN_SLEEP_TIME + (int) (Math.random() * MAX_SLEEP_TIME);
    }

    public String getName() {
        return name;
    }

    public int getNumber() {
        return number;
    }

    public void printSleep() {
        System.out.println("I still ran " + rumLength + "meters and I will sleep  " + sleepTime + "ms");
    }
}
