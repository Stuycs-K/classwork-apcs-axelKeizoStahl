import java.util.Random;

public class Driver {
    public static int[] generateRandomNumbers() {
        Random rand = new Random();
        int[] numbers = new int[3];
        for (int i = 0; i < 3; i++) {
            numbers[i] = rand.nextInt(100);
        }
        return numbers;
    }

    public static void printBorder() {
        for (int row = 1; row <= 30; row++) {
            if (row == 1 || row == 30) {
                for (int col = 1; col <= 80; col++) {
                    Text.go(row, col);
                    Text.color(Text.RED, Text.background(Text.WHITE));
                    System.out.print(" ");
                }
            } else {
                Text.go(row, 1);
                Text.color(Text.RED, Text.background(Text.WHITE));
                System.out.print(" ");
                Text.go(row, 80);
                System.out.print(" ");
            }
        }
    }

    public static void printRandomNumbers(int[] numbers) {
        int colStart = 20;  
        for (int i = 0; i < 3; i++) {
            Text.go(2, colStart + (i * 25));  
            if (numbers[i] < 25) {
                Text.color(Text.BRIGHT, Text.RED);
            } else if (numbers[i] > 75) {
                Text.color(Text.BRIGHT, Text.GREEN);
            } else {
                Text.color(Text.WHITE);
            }
            System.out.print(numbers[i]);
        }
    }

    public static void printSeparator() {
        Text.go(3, 1);
        for (int col = 1; col <= 80; col++) {
            Text.color(Text.BLUE);
            System.out.print("-");
        }
    }

    public static void printMiddleContent() {
        Text.go(15, 35);
        Text.color(Text.MAGENTA, Text.background(Text.CYAN), Text.BRIGHT);
        System.out.print("Middle Content Here!");
    }

    public static void main(String[] args) {
       
        System.out.print(Text.CLEAR_SCREEN);
        System.out.print(Text.HIDE_CURSOR);

        
        printBorder();
        
        
        int[] randomNumbers = generateRandomNumbers();
        printRandomNumbers(randomNumbers);

        
        printSeparator();
        
        
        printMiddleContent();
        
        
        Text.go(31, 1);
        
        
        System.out.print(Text.RESET);
        System.out.print(Text.SHOW_CURSOR);
    }
}
