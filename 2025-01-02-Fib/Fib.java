public class Fib {
    public static void main(String[] args) {
        System.out.println("makeWords(2,\"\",\"abc\"): ");
         makeWords(2,"","abc");
    }
    public static void makeWords(int left, String res, String alphabet) {
        if (left == 0) {
            System.out.println(res);
        } else {
            for (char c: alphabet.toCharArray()) {
                makeWords(left-1, res + c, alphabet);
            }
        }
    }
    public static int fib(int n) {
        if (n < 2) {
            return n;
        } else {
            return fib(n-1) + fib(n-2);
        }
    }
}
