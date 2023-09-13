import java.util.HashMap;
import java.util.Map;

public class WordCounter {
    
    public static Map<String, Integer> count_words(String sentence) {
        String[] words = sentence.split("\\W+");
        Map<String, Integer> wordCount = new HashMap<>();
        for (String word : words) {
            word = word.toLowerCase();
            wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
        }
        return wordCount;
    }

    public static void main(String[] args) {
        System.out.println(count_words("This is a test. This is only a test."));
    }
}
