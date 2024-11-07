// First, we tried to use name in the method, but it was a private variable only accessible to the parent class. Then, we tried to use getName(), but that didn't work either.
// Axel Stahl
// Amy Zhou
public class Driver {
    public static void main(String[] args) {
        Animal a1 = new Animal("ying yang", 7, "AZ");
        a1.speak();

        Bird b1 = new Bird("matcha", 18, "AS", 6.3, "green");
        b1.speak();
    }
}
