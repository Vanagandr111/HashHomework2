import java.util.Collections;
import java.util.HashSet;
import java.util.Locale;

public class WordsChecker {
  String originalText;
  HashSet<String> wordsInText = new HashSet<>();

  public WordsChecker(String text) {
    this.originalText = text;
    Collections.addAll(this.wordsInText, text.toLowerCase(Locale.ENGLISH).split("\\P{IsAlphabetic}+"));
  }

  public boolean hasWord(String word) {
    String lowercaseWord = word.toLowerCase(Locale.ENGLISH);
    return wordsInText.contains(lowercaseWord); //contains() из HashSet
  }
}
