import java.util.Scanner;
class Game {
    public static void printStats(Adventurer adv) {
        System.out.println(adv.getName() + " stats:");
        System.out.println("HP: " + adv.getHP() + "/" + adv.getMaxHP());
        System.out.println(adv.getSpecialName() + " capacity: " + adv.special() + "/" + adv.getSpecialMax());
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        Adventurer comp = new CodeWarrior("Computer", 10, "perl");
        Adventurer player = new Warrior("Bob", 10, 10);
    }
}
