public class ArrayWrk {
    public static void main(String[] args) {
        int[] testArr = {1, 2, 3, 4}
        System.out.println("[1, 2, 3, 4]".equals(arrayToString(testArr)));
        
        int[] copyTestArr = returnCopy(testArr);
        System.out.println(testArr != copyTestArr && copyTestArr.compare(testArr));

        int[] concated = concatArray(testArr, copyTestArr);
        System.out.println(concated.compare({1,2,3,4,1,2,3,4}));
    }
}
