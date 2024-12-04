public class ColorDemo {
    public static final String CLEAR_SCREEN = "\u001b[2J";
    public static final String SHOW_CURSOR = "\u001b[?25h";
    public static int RED = 31, GREEN = 32, YELLOW = 33, BLUE = 34, MAGENTA = 35, CYAN = 36, WHITE = 37;
    public static int BLACK = 30;

    public static void color(int foreground, int background) {
        System.out.print("\u001b[" + foreground + ";" + (10 + background) + "m");
    }

    public static void sleep(int milliseconds) {
        try { Thread.sleep(milliseconds); } catch (InterruptedException e) {}
    }

    public static void main(String[] args) {
        String art = 
            ".-\"\"-.\n" +
            "/,..___\\\n" +
            "() {_____}\n" +
            "  (/-@-@-\\)\n" +
            "  {`-=^=-'}\n" +
            "  {  `-'  } Max\n" +
            "   {     }\n" +
            "    `---'\u001b[H";

        int[] colors = {RED, GREEN, YELLOW, BLUE, MAGENTA, CYAN, WHITE};
        
        for (int i = 0; i < 10; i++) {  // Reduced the number of iterations
            System.out.print(CLEAR_SCREEN);
            for (int j = 0; j < colors.length; j++) {
                color(colors[(i + j) % colors.length], BLACK);
                System.out.print(art);  // Print the ASCII art
            }
            System.out.print("\u001b[0m");
            sleep(200);
        }
        System.out.print(SHOW_CURSOR);
    }
}

