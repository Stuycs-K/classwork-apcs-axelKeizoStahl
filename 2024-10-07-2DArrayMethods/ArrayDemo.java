import java.util.Arrays;
public class ArrayDemo{
  public static void main(String[] args){
    int[] test1d = new int[]{1, 2, 3, 4};
    int[][] test2d = new int[4][2];
    int[][] test22d = {{1, 2, 3, 4}, {1, 2, 3, 4}, {1, 2, 3, 4}};
    System.out.println("expected: " Arrays.toString(test1d) + "\nresult: " + arrToString(test1d));
    System.out.println("expected: " Arrays.toString(test2d) + "\nresult: " + arrToString(test2d));
    System.out.println("\nexpected: 30\nresult: " + arr2DSum(test22d));
    System.out.println("\nexpected: [[1, 1, 1], [2, 2, 2], [3, 3, 3], [4, 4, 4]]\nresult: " + arrToString(swapRC(test22d)));
  }




  //0. Include your prior methods to help you print a 1D/2D array of ints.
  public static String arrToString(int[] nums) {
    String result = "[";
    for (int i=0; i<nums.length;i++) {
        result += nums[i];
      if (i<nums.length-1) {
      result += ", ";
      }
    }
    return result+"]";
  }

  //The name of different methods can be the same,
  //as long as the parameters are different! (type and/or quantity must be different)
  //Pro tip: you should be using your 1D arrToString in this method!
  public static String arrToString(int[][] ary){
    String result = "[";
    for (int i=0; i<ary.length;i++) {
        result += arrToString(ary[i]);
      if (i<ary.length-1) {
      result += ", ";
      }
    }
    return result+"]";
  }

  //1. Calculate and return how many elements equal zero in the 2D array.
  public static int countZeros2D(int[][] nums){
    return 0;
  }

  //2. Calculate the sum of a 2d array
  /*Return the sum of all of the values in the 2D array
   *Use a nested loop instead of a helper method*/
  public static int arr2DSum(int[][] arr) {
      int sum = 0;
      for (int i = 0; i < arr.length; i++) {
          for (int j = 0; j < arr[i].length; j++) {
              sum += arr[i][j];
          }
      }
      return sum;
  }

  //3. Modify a given 2D array of integer as follows:
  //Replace all the negative values:
  //-When the row number is the same as the column number replace
  //that negative with the value 1
  //-All other negatives replace with 0
  public static void replaceNegative(int[][] vals){

  }

  //4. Make a copy of the given 2d array.
  //When testing : make sure that changing the original does NOT change the copy.
  //DO NOT use any built in methods that "copy" an array.
  //You SHOULD write a helper method for this.
  //If you don't see a good way to do that, you should stop and look at prior methods.
    public static int[] copy(int[] arr) {
        int[] res = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            res[i] = arr[i];
        }
        return res;
    }
    public static int[][] copy(int[][] arr) {
        int[][] res = new int[arr.length][];
        for (int i = 0; i < arr.length; i++) {
            res[i] = copy1D(arr[i]);
        }
        return res;
    }

  //5. Rotate an array by returning a new array with the rows and columns swapped.
  //   You may assume the array is rectangular and neither rows nor cols is 0.
  //   e.g. swapRC({{1,2,3},{4,5,6}}) returns {{1,4},{2,5},{3,6}}
  public static int[][] swapRC(int[][] arr) {
      int[][] res = new int[arr[0].length][arr.length];
      for (int i = 0; i < arr.length; i++) {
          for (int j = 0; j < arr[i].length; j++) {
              res[j][i] = arr[i][j];
          }
      }
      return res;
  }

  //6. Make an HTML table by putting a table tag around the entire 2d array,
  //   tr tags around each row, and td tags around each value.
  //   You may use a helper method
  //   Note there is no whitespace in the string, it all one line with no spaces/tabs.
  //   e.g. htmlTable(new int[][]{{1,2},{3}})  returns:
  // "<table><tr><td>1</td><td>2</td></tr><tr><td>3</td></tr></table>"
  public static String htmlTable(int[][]nums){
    return "";
  }
}
