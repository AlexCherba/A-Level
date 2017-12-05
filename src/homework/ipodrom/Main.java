package homework.ipodrom;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    private enum persons {Вася, Петрович, Денис, Андрей, Дмитрий, }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Внимание! Начинается заезд! Делайте ставки!");
        System.out.println("Сегодня в забеге участвуют лошади:");

        Race race = new Race();

        System.out.print("Как Вас зовут?");
        scanner.next();
        System.out.print("На какую лошадь делаете ставки (1.." + Race.TRACKS +")?");
        scanner.nextInt();
    }
}
