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

    public static void printGamersRate() {
        for (Gamer gamer : gamerList) {
            System.out.println(gamer.name + " - " + gamer.rate + " грн на " + Race.getHorseNameArray()[gamer.horse - 1]);
        }
    }

    public static void printWinGamers(Race race) {
        int sumRate = 0;
        boolean isWinGamer = false;
        for (Gamer gamer : gamerList) {
            sumRate += gamer.rate;
            if (gamer.horse == race.getWinHorse()) {
                System.out.println("Победил " + gamer.name);
                isWinGamer = true;
            }
        }
        System.out.println(isWinGamer ?
                "Поздравляем победителей с выигранной общей суммой " + sumRate + " грн" :
                "Упс, вся поставленная сумма " + sumRate + " грн остается организаторам скачек");
    }
}
