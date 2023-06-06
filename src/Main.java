import java.util.logging.Logger;

public class Main {

  public static String loremIpsum = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.";
  public static final Logger logger = Logger.getAnonymousLogger();

  public static void main(String[] args) {

    WordsChecker checker = new WordsChecker(loremIpsum);

    boolean searchResult = checker.hasWord("laborum");
    logger.info("Поиск слова \"laborum\" в тексте вернул: " + searchResult);

    boolean searchResult1 = checker.hasWord("bottle");
    logger.info("Поиск слова \"bottle\" в тексте вернул: " + searchResult1);
  }
}