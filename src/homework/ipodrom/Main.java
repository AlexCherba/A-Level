package homework.ipodrom;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Внимание! Начинается заезд! Делайте ставки!");
        System.out.println("Сегодня в забеге на " + Race.LENGTH + "m участвуют лошади:");

        Race race = new Race();

        for (int i = 0; i < Race.TRACKS; i++) {
            System.out.println("Номер " +
                    race.getHorseList().get(i).getNumber() + ": " +
                    race.getHorseList().get(i).getName());
        }
        Gamer.initialization();
        System.out.println("Ставки сделали:");
        Gamer.printGamersRate();

        System.out.println("Гонг!");

    }
}
