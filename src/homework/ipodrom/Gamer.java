package homework.ipodrom;

public class Gamer {

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
