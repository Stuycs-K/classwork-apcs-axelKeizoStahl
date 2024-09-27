public class ArrayWrk {
    public static void main(String[] args) {
        int[] testArr = {1, 2, 3, 4}
        System.out.println("[1, 2, 3, 4]".equals(arrayToString(testArr)));
        
        int[] copyTestArr = returnCopy(testArr);
        System.out.println(testArr != copyTestArr && copyTestArr.compare(testArr));

        int[] concated = concatArray(testArr, copyTestArr);
        System.out.println(concated.compare({1,2,3,4,1,2,3,4}));
    }

    public static String arrayToString(int[] arr) {
        String res = "[";
        for (int i = 0; i < arr.length; i++) {
            res += arr[i];
            if (i < arr.length-1)
                res += ", ";
        }
        return res + "]";
    }

    public static int[] returnCopy(int[] arr) {
        int[] copy = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            copy[i] = arr[i];
        }
        return copy;
    }
}
