package Less_3_6;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Main_3_6_1 {
    
    public static void main(String[] args) {
        int[] sourceArray = {1, 2, 4, 4, 2, 3, 1, 4, 1, 7};
        resultArray(sourceArray);
    }
         public static void resultArray(int[] sourceArray) {

        int x = 4;
        int[] reverseArray = IntStream.range(0, sourceArray.length).map(i -> sourceArray.length - 1 - i)
                .map(i -> sourceArray[i]).takeWhile(i -> i != x).toArray();

        int[] resultArray = IntStream.range(0, reverseArray.length).map(i -> reverseArray.length - 1 - i)
                .map(i -> reverseArray[i]).toArray();
        System.out.println(Arrays.toString(resultArray));

        


    }
}
