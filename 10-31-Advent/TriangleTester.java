import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TriangleTester {
  public static void main (String[] args) {
    System.out.println("Number of valid triangles: "+countTrianglesA("inputTri.txt"));
  }

  public static int countTrianglesA(String filename) {
    int count = 0;
    File file = new File (filename);
    try {
      Scanner input = new Scanner (file);
      //each line is processed into a new triangle scanner object
      while (input.hasNextLine()) {
        Scanner triangle = new Scanner(input.nextLine());
        while (triangle.hasNextInt()) {
          //the value of each integer is a side length of the triangle
          int s1 = triangle.nextInt();
          int s2 = triangle.nextInt();
          int s3 = triangle.nextInt();
          //if the sum of any two side lenghts is greater than the third, then it is a triangle
          if ((s1 + s2 > s3) && (s1 + s3 > s2) && (s2 + s3 > s1)) {
            count ++;
          }
        }
        triangle.close();
      }
      input.close();
      //if the file is not found, return 0
    } catch (FileNotFoundException ex) {
      return 0;
    }
    return count;
  }


}
