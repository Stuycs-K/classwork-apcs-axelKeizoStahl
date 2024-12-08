public class Driver {
    public static void main(String[] args) {
        Adventurer w1 = new Warrior("Thor", 25, 12);
        System.out.println(w1.getName() + " is a Warrior with " + w1.getSpecialName() + ".");
        Adventurer w2 = new Warrior("Loki", 25, 12);
        
        System.out.println(w2.attack(w1));
        System.out.println(w2.attack(w1));
        
        System.out.println(w1.support(w2));
        System.out.println(w1.getName() + " is a Warrior with " + w1.getSpecial() + " specials left.");
    }
}

