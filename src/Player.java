public class Player {
    private int number;
    private String name;

    public Player(int number, String name) {
        this.number = number;
        this.name = name;
    }
    @Override
    public String toString() {
        return "Player{" +
                "number=" + number +
                ", name='" + name + '\'' +
                '}';
    }

    public int getNumber() {
        return number;
    }

    public String getName() {
        return name;
    }
}
