package chapterOne;

import java.util.HashMap;
import java.util.Map;

public class MyTry {
   public Map<Character, Integer> count(String str){
       Map<Character, Integer> result = new HashMap<>();
       for(char ch : str.toCharArray()){
           result.compute(ch, (k, v) -> (v == null) ? 1 : ++v);
       }
       return result;
   }

   public Map<Character, Integer> count2(String str){
       Map<Character, Integer> result = new HashMap<>();
       for (int i = 0; i < str.length(); i++) {
           char ch = str.charAt(i);
           result.compute(ch , (q, w) -> (w == null) ? 1 : ++w);
       }
       return result;
   }

}
