package homework.ipodrom;

import java.util.ArrayList;
import java.util.List;

public class Gamer {
    private static String[] gamerNameArray = {"Вася", "Петрович", "Денис", "Андрей", "Дмитрий", "Ken", "Barby"};
    private static List<Gamer> gamerList = new ArrayList<>();
    private String name;
    private int horse;
    private int rate;

    public Gamer(String name) {
        this.name = name;
        this.horse = 1 + (int) (Math.random() * Race.TRACKS);
        this.rate = Race.MIN_RATE + (int) (Math.random() * Race.MAX_RATE);
    }

    public Gamer(String name, int horse, int rate) {
        this.name = name;
        this.horse = horse;
        this.rate = rate;
    }

    public static void initialization() {
        for (String s : gamerNameArray) {
            gamerList.add(new Gamer(s));
        }
    }
    public static void printGamersRate(){
        for (Gamer gamer : gamerList) {
            System.out.println(gamer.name + " - " + gamer.rate + " бакса на " + Race.getHorseNameArray()[gamer.horse]);
        }
    }

    public void setRate(int horse, int rate) {
        this.horse = horse;
        this.rate = rate;
    }

    public String getName() {
        return name;
    }

    public int getHorse() {
        return horse;
    }

    public int getRate() {
        return rate;
    }
}
