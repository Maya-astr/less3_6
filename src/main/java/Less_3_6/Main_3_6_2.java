package Less_3_6;

public class Main_3_7_2 {
    public static boolean checkArray(int[] array, int m1, int m2) {
        int len = array.length;

        String result = "";

        for (int j : array) {
            result += " " + j;
        }

        String replace = result.replace(" " +m1, "");
        String replace2 = replace.replace(" " + m2, "");

        return replace.length() != array.length * 2 && replace2.length() != replace.length() * 2 && replace2.isEmpty();
    }


    public static void main(String[] args) {
        System.out.println(checkArray(new int[] {1, 1, 1, 1}, 1, 4));
        System.out.println(checkArray(new int[] {4, 4, 4, 4}, 1, 4));
        System.out.println(checkArray(new int[] {4, 1, 1, 4}, 1, 4));
        System.out.println(checkArray(new int[] {5, 4, 1, 4}, 1, 4));
    }
}
