import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Day1 {
    public static void main (String[] args) {
        System.out.println("Number of shortest path: "+day1("input.txt"));
    }

    public static int day1(String filename) {
        File file = new File (filename);
        try {
            Scanner scanner = new Scanner (file);
	    int[] posxy = {0, 0};
	    int[][] directions = {{0, 1}, {1, 0}, {0, -1}, {-1, 0}};
	    int dirIndex = 0;
	    String line = scanner.nextLine();
	    String[] input = line.split(", ");
	    for (int i = 0; i < input.length; i++) {
		if (input[i].charAt(0) == 'R') {
		    dirIndex = (dirIndex + 1)%4;
		} else {
		    dirIndex = (dirIndex + 3)%4;
		}

		int blocks = Integer.parseInt(input[i].substring(1));

		posxy[0] += directions[dirIndex][0] * blocks;
		posxy[1] += directions[dirIndex][1] * blocks;
	    }
            scanner.close();
	    return Math.abs(posxy[0]) + Math.abs(posxy[1]);
        } catch (FileNotFoundException ex) {
            return 0;
        }
    }

}
