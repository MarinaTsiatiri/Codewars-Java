// Count characters in your string

import java.util.Map;
import java.util.HashMap;

public class Chars {
    public static Map<Character, Integer> count(String str) {
      
      Map<Character, Integer> counter = new HashMap<>();
      
      char[] strNew = str.toCharArray();
      for (char c: strNew){
        counter.put(c, counter.getOrDefault(c, 0) + 1);
      }
  
      return counter;
    }
}
