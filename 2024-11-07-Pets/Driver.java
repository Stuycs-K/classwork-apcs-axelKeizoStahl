// First, we tried to use name in the method, but it was a private variable only accessible to the parent class. But it worked when we used the getName method from superClass and it updated the speak method.
// Axel Stahl
// Amy Zhou
public class Driver {
    public static void main(String[] args) {
        Animal a1 = new Animal(...);
        Bird b1 = new Bird(...);
        Bird b2 = new Animal(...);
        Animal a2 = new Bird(...);
        Animal a1 = new Animal("ying yang", 7, "AZ");
        a1.speak();

        Bird b1 = new Bird("matcha", 18, "AS", 6.3, "green");
        b1.speak();
    }
}
