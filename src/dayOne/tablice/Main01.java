package dayOne.tablice;

import java.util.Arrays;

public class Main01 {
    public static int[] returnUnique(int[] arr) {

        if(arr == null || arr.length == 0) return arr;
        Arrays.sort(arr);
        int n = 1;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != arr[i-1]) n++;
        }
        int[] res = new int[n];
        n = 1;
        res[0] = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(arr[i] != arr[i-1])
                res[n++] = arr[i];
        }
        return res;
    }
}