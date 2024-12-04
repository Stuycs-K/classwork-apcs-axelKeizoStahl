import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;

public class Day1 {
    public static void main (String[] args) {
        System.out.println("Bathroom Code: "+partOne("input.txt"));
    }

    public static String partOne(String filename) {
        File file = new File (filename);
        try {
            Scanner scanner = new Scanner (file);
	    String code = "";
	    int[] posxy = {1, 1};
	    int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
	    while (scanner.hasNextLine()) {
		String line = scanner.nextLine();
		for (int i = 0; i < line.length(); i++) {
		    char dir = line.charAt(i);
		    if (dir == 'U' && posxy[1]-1 >= 0) {
			posxy[1]--;
		    } else if (dir == 'D' && posxy[1]+1 < 3) {
			posxy[1]++;
		    } else if (dir == 'R' && posxy[0]+1 < 3) {
			posxy[0]++;
		    } else if (dir == 'L' && posxy[0]-1 >= 0) {
			posxy[0]--;
		    }
		    //System.out.println(dir);
		    //System.out.println(posxy[0] + ", " + posxy[1] + ": " + matrix[posxy[1]][posxy[0]]);
		}
		code += matrix[posxy[1]][posxy[0]];
	    }
	    scanner.close();
	    return code;
        } catch (FileNotFoundException ex) {
            return null;
        }
    }

    public static int partTwo(String filename) {
        File file = new File (filename);
        try {
            Scanner scanner = new Scanner (file);
            ArrayList<int[]> positions = new ArrayList<int[]>();
            int[] posxy = {0, 0};
            int[][] directions = {{0, 1}, {1, 0}, {0, -1}, {-1, 0}};
            int dirIndex = 0;
            String line = scanner.nextLine();
            String[] input = line.split(", ");
	    positions.add(new int[]{0, 0});
            for (int i = 0; i < input.length; i++) {
		System.out.println(Arrays.toString(positions.get(positions.size()-1)));
                if (input[i].charAt(0) == 'R') {
                    dirIndex = (dirIndex + 1)%4;
                } else {
                    dirIndex = (dirIndex + 3)%4;
                }

                int blocks = Integer.parseInt(input[i].substring(1));

		for (int k = 0; k < blocks; k++) {
			posxy[0] += directions[dirIndex][0];
			posxy[1] += directions[dirIndex][1];
			for (int j = 0; j < positions.size(); j++) {
			    if (positions.get(j)[0] == posxy[0] && positions.get(j)[1] == posxy[1]) {
				return Math.abs(positions.get(j)[0]) + Math.abs(positions.get(j)[1]);
			    }
			}
			positions.add(new int[]{posxy[0], posxy[1]});
	    	}

                System.out.println(Arrays.toString(posxy));
            }
            scanner.close();
	    return Math.abs(posxy[0]) + Math.abs(posxy[1]);
        } catch (FileNotFoundException ex) {
            return 0;
        }
    }
}
