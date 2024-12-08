public class Warrior extends Adventurer {
    private int special, maxSpecial;
    
    public Warrior(String name) {
        super(name);
        special = 5;
        maxSpecial = 5;
    }

    public Warrior(String name, int hp) {
        this(name, hp, 5);
    }

    public Warrior(String name, int hp, int special) {
        super(name, hp);
        this.special = special;
        maxSpecial = special;
    }

    public String getSpecialName() {
        return "PowerSlash";
    }

    public int getSpecial() {
        return special;
    }

    public void setSpecial(int n) {
        special = n;
    }

    public int getSpecialMax() {
        return maxSpecial;
    }

    public String attack(Adventurer other) {
        other.applyDamage(1);
        return getName() + " attacks " + other.getName() + ", boom!";
    }

    public String support(Adventurer other) {
        other.setHP(other.getHP() + 1);
        return getName() + " supports " + other.getName() + ", much better!";
    }

    public String support() {
        return support(this);
    }

    public String specialAttack(Adventurer other) {
        restoreSpecial(-1);
        return getName() + " uses " + getSpecialName() + " on " + other.getName() + ", " + attack(other);
    }
}
