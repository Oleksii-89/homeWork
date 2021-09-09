package chapterOne;

import java.util.HashMap;
import java.util.Map;

//Написать программу для подсчета повторений символов в заданной строке.

public class CountingRepeatedCharacters {
    public Map<Character, Integer> countDuplicateCharacters(String str) {
        Map<Character, Integer> result = new HashMap<>();
        for (char ch : str.toCharArray()) {
            result.compute(ch, (k, v) -> (v == null) ? 1 : ++v);
        }
        return result;
    }

    public Map<Character, Integer> countDuplicateCharacters2(String str) {
        Map<Character, Integer> result = new HashMap<>();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            result.compute(ch, (k, v) -> (v == null) ? 1 : ++v);
        }
        return result;
    }
}

