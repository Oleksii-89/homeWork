import dayOne.metody.Main02;
import dayOne.tablice.Main01;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] numbers = {0, 0, 1, 1, 1, 1, 2, 3, 4, 4, 5, 6, 6, 6, 6, 7, 8, 8, 9, 9, 1, 9, 0, 0};
        System.out.println(Arrays.toString(numbers));
        int[] result = Main01.returnUnique(numbers);
        System.out.println(Arrays.toString(result));
    }
}
