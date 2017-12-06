package homework.ipodrom;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Race race = new Race();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Внимание! Начинается заезд! Делайте ставки!");
        System.out.println("Сегодня в забеге на " + Race.LENGTH + "m участвуют лошади:");
        race.printTracks();

        Gamer.initialization();
        System.out.println("Ставки сделали:");
        Gamer.printGamersRate();

        System.out.println("Гонг!");

        Thread thread = new Thread(race);
        thread.start();

        while (thread.isAlive()){}
        System.out.println("------------------------------------");
        System.out.println("Выиграла лошадь №" + race.getWinHorse() + " - " + race.getWinNameHorse());

        Gamer.printWinGamers(race);

    }
}
