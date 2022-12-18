import java.util.Scanner;

public class Teams {
    public static Player[] hosts = new Player[11];
    public static Player[] guests = new Player[11];

    public static void addPlayer(Player[] team) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < team.length; i++) {

            int playerNumber = getPlayerNumber();
            String playerName = getPlayerName();

            team[i] = new Player(playerNumber, playerName);
            System.out.println("Игрок " + team[i].getName() + " под номером " + team[i].getNumber() + " включен в стартовый состав.");

        }
        System.out.println("Стартовый состав команды заполнен.");
    }

    private static int getPlayerNumber() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите игровой номер:");
        int userNumberInput = scanner.nextInt();
        return userNumberInput;
    }

    private static String getPlayerName() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите имя игрока:");
        String inputPlayerName = scanner.nextLine();
        return inputPlayerName;
    }

    public static void printTeam(Player[] team){
        for (int i = 0; i < team.length; i++){
            System.out.println((i+1) + ". " + team[i].getName());
        }
    }

}
