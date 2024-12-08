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

    @Override
    public String getSpecialName() {
        return "PowerSlash";
    }

    @Override
    public int getSpecial() {
        return special;
    }

    @Override
    public void setSpecial(int n) {
        special = n;
    }

    @Override
    public int getSpecialMax() {
        return maxSpecial;
    }

    @Override
    public String attack(Adventurer other) {
        other.applyDamage(1);
        return getName() + " attacks " + other.getName() + ", boom!";
    }

    @Override
    public String support(Adventurer other) {
        other.setHP(other.getHP() + 1);
        return getName() + " supports " + other.getName() + ", much better!";
    }

    @Override
    public String support() {
        return support(this);
    }

    @Override
    public String specialAttack(Adventurer other) {
        restoreSpecial(-1);
        return getName() + " uses " + getSpecialName() + " on " + other.getName() + ", " + attack(other);
    }
}
