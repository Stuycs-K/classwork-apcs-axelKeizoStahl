import java.util.Scanner;
import java.util.Random;

class Game {
    
    public static void printStats(Adventurer adv) {
        System.out.println(adv.getName() + " stats:");
        System.out.println("HP: " + adv.getHP() + "/" + adv.getmaxHP());
        System.out.println(adv.getSpecialName() + " capacity: " + adv.getSpecial() + "/" + adv.getSpecialMax());
    }
    
    public static String getUserAction(Scanner userInput) {
        String choice;
        while (true) {
            System.out.println("Your turn! Type: (a)ttack / (sp)ecial / (su)pport / quit");
            System.out.print("Choice: ");
            choice = userInput.nextLine().toLowerCase();
            
            if (choice.equals("a") || choice.equals("sp") || choice.equals("su") || choice.equals("quit")) {
                break; // Valid input, exit the loop
            } else {
                System.out.println("Invalid choice. Please type: (a)ttack / (sp)ecial / (su)pport / quit");
            }
        }
        return choice;
    }

    public static void performPlayerAction(Adventurer player, Adventurer comp, String choice) {
        if (choice.equals("a")) {
            System.out.println(player.attack(comp));
        } else if (choice.equals("sp")) {
            System.out.println(player.specialAttack(comp));
        } else if (choice.equals("su")) {
            System.out.println(player.support());
        }
    }

    public static void performComputerAction(Adventurer player, Adventurer comp, Random random) {
        int actionChoice = random.nextInt(3);
        if (actionChoice == 0) {
            System.out.println(player.attack(comp));
        } else if (actionChoice == 1) {
            System.out.println(player.specialAttack(comp));
        } else if (actionChoice == 2) {
            System.out.println(player.support());
        }
    }

    public static void printEndMessage(Adventurer player, Adventurer comp) {
        if (comp.getHP() <= 0) {
            System.out.println("Congratulations, " + player.getName() + " wins!");
        } else if (player.getHP() <= 0) {
            System.out.println(comp.getName() + " wins!");
        }
    }

    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        Random random = new Random();

        Adventurer comp = new CodeWarrior("Computer", 10, "perl");
        Adventurer player = new Warrior("Bob", 10, 10);

        printStats(comp);
        System.out.println();
        printStats(player);
        System.out.println();

        while (comp.getHP() > 0 && player.getHP() > 0) {
            String choice = getUserAction(userInput);

            if (choice.equals("quit")) {
                System.out.println("Exiting game...");
                break;
            }

            performPlayerAction(player, comp, choice);

            printStats(comp);
            printStats(player);
            System.out.println();

            if (comp.getHP() > 0) {
                performComputerAction(player, comp, random);

                printStats(comp);
                printStats(player);
                System.out.println();
            }
        }

        printEndMessage(player, comp);

        userInput.close();
    }
}

