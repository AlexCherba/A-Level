package homework;

enum Number {
    ONE("Один"), TWO("Два"), THREE("Три"), FOUR("Четыре"), FIVE("Пять"), SIX("Шесть"), SEVEN("Семь"), EIGHT("Восемь"), NINE("Девять"), TEN("Десять");
    String ruTranslation;

    private Number(String ruTranslation) {
        this.ruTranslation = ruTranslation;
    }
}

public class Enums {
    public static void main(String[] args) {
        // Enum.valueof()
        try {
            System.out.println(Number.valueOf("Hello"));
            System.out.println(Number.valueOf("one"));
        } catch (IllegalArgumentException e) {
            System.out.println("Don't have enum Hello");
        }
        System.out.println(Number.valueOf("ONE"));

        // Enum.values()
        for (Number arg : Number.values()) {
            System.out.println(arg);
        }

        for (Number number : Number.values()) {
            System.out.println(number.ruTranslation);
        }
    }
}
