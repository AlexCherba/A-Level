package classroom.tamagochi;

/*
Пример многопоточности
*/
import java.util.Scanner;

public class Tamagochi implements Runnable {
    private int toiletLevel;
    private int playLevel;
    private int eatLevel;
    private int sleepLevel;

    private boolean toiletRipFlag;
    private boolean playRipFlag;
    private boolean eatRipFlag;
    private boolean sleepRipFlag;

    private static final int MAX_TOILET_LEVEL = 100;
    private static final int MAX_PLAY_LEVEL = 100;
    private static final int MAX_EAT_LEVEL = 100;
    private static final int MAX_SLEEP_LEVEL = 100;

    private static final int TOILET_LEVEL_INCREMENT = 30;
    private static final int PLAY_LEVEL_INCREMENT = 20;
    private static final int EAT_LEVEL_INCREMENT = 40;
    private static final int SLEEP_LEVEL_INCREMENT = 10;

    @Override
    public void run() {
        while (true) {
            if (isRip()) {
                RIP();
                return;
            }
            checkLevels();
            incrementLevels();
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        Tamagochi tamagochi = new Tamagochi();
        Thread thread = new Thread(tamagochi);
        thread.start();

        Scanner scanner = new Scanner(System.in);
        System.out.println("1.eat");
        System.out.println("2.play");
        System.out.println("3.toilet");
        System.out.println("4.sleep");

        while (thread.isAlive()) {
            switch (scanner.nextInt()) {
                case 1:
                    tamagochi.setEatLevelLevel();
                    break;
                case 2:
                    tamagochi.setPlayLevelLevel();
                    break;
                case 3:
                    tamagochi.setToiletLevel();
                    break;
                case 4:
                    tamagochi.setSleepLevelLevel();
                    break;
            }
        }
    }

    private void incrementLevels() {
        toiletLevel += TOILET_LEVEL_INCREMENT;
        playLevel += PLAY_LEVEL_INCREMENT;
        eatLevel += EAT_LEVEL_INCREMENT;
        sleepLevel += SLEEP_LEVEL_INCREMENT;

    }

    public void setToiletLevel() {
        this.toiletLevel = 0;
        toiletRipFlag = false;
    }

    public void setPlayLevelLevel() {
        this.playLevel = 0;
        playRipFlag = false;
    }

    public void setSleepLevelLevel() {
        this.sleepLevel = 0;
        sleepRipFlag = false;
    }

    public void setEatLevelLevel() {
        this.eatLevel = 0;
        eatRipFlag = false;
    }

    private void checkLevels() {
        if (toiletLevel > MAX_TOILET_LEVEL) {
            toiletRipFlag = true;
            System.out.println("Tamagochi need a Toilet");
        }
        if (sleepLevel > MAX_SLEEP_LEVEL) {
            sleepRipFlag = true;
            System.out.println("Tamagochi need a Sleep");
        }
        if (eatLevel > MAX_EAT_LEVEL) {
            eatRipFlag = true;
            System.out.println("Tamagochi need a Eat");
        }
        if (playLevel > MAX_PLAY_LEVEL) {
            playRipFlag = true;
            System.out.println("Tamagochi need a Play");
        }

    }

    private boolean isRip() {
        return toiletRipFlag || sleepRipFlag || eatRipFlag || playRipFlag;
    }

    private void RIP() {
        System.out.println("_______");
        System.out.println("|     |");
        System.out.println("| RIP |");
        System.out.println("_______");
    }
}
