import java.util.HashMap;
import java.util.Map;

public class Anagram {
    public static boolean isAanagram(String str1, String str2) {
        if (str1.length() != str2.length())
            return false;
        Map<Character, Integer> charCount = new HashMap();

        for (char ch : str1.toCharArray()) {
            charCount.put(ch, charCount.getOrDefault(ch, 0) + 1);
        }
        for (char ch : str2.toCharArray()) {
            if (!charCount.containsKey(ch)) {
                return false;
            }

          charCount.put(ch, charCount.get(ch)-1);
          charCount.remove(ch);

        }
        return charCount.isEmpty();
    }

    public static void main(String[] args) {

    }
}
