//Jessie Wang jessiew27@nycstudents.net
//Eunice Wong eunicew4@nycstudents.net
//Axel Stahl axels21@nycstudents.net

public class ArrayMethods {
  public static void main(String[] args){
    int[] test1d = new int[]{1, 2, 3, 4};
    int[][] test2d = new int[4][2];
    int[][] test22d = {{1, 2, 3, 4}, {1, 2, 3, 4}, {1, 2, 3, 4}};
    System.out.println("expected: [1, 2, 3, 4]\nresult: " + arrToString(test1d));
    System.out.println("\nexpected: [[0, 0], [0, 0], [0, 0], [0, 0]]\nresult: " + arrToString(test2d));
    System.out.println("\nexpected: 30\nresult: " + arr2DSum(test22d));
    System.out.println("\nexpected: [[1, 1, 1], [2, 2, 2], [3, 3, 3], [4, 4, 4]]\nresult: " + arrToString(swapRC(test22d)));
  }

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

  public static int arr2DSum(int[][] arr) {
      int sum = 0;
      for (int i = 0; i < arr.length; i++) {
          for (int j = 0; j < arr[i].length; j++) {
              sum += arr[i][j];
          }
      }
      return sum;
  }

  public static int[][] swapRC(int[][] arr) {
      int[][] res = new int[arr[0].length][arr.length];
      for (int i = 0; i < arr.length; i++) {
          for (int j = 0; j < arr[i].length; j++) {
              res[j][i] = arr[i][j];
          }
      }
      return res;
  }
    public static int[] copy1D(int[] arr) {
        int[] res = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            res[i] = arr[i];
        }
        return res;
    }
    public static int[][] copyArr(int[][] arr) {
        int[][] res = new int[arr.length][];
        for (int i = 0; i < arr.length; i++) {
            res[i] = copy1D(arr[i]);
        }
        return res;
    }
}
