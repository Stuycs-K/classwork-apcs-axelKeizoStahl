import java.util.Scanner;
class Game {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        Adventurer comp = new CodeWarrior("Computer", 10, "perl");
        Adventurer player = new Warrior("Bob", 10, 10);
    }
}
