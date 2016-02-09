import java.io.Console;

public class App {
  public static void main(String[] args) {
    Console myConsole = System.console();
    System.out.println("Enter a String you wish to turn into leetspeak.");
    String userString = myConsole.readLine();
    System.out.println(leetspeak(userString));

  }
public static String leetspeak(String normalInput) {
  String[] wordsArray = normalInput.split(" ");
  String newWord = "";
  for (String wordsInArray : wordsArray) {
    wordsInArray = wordsInArray.replaceAll("e", "3");
    wordsInArray = wordsInArray.replaceAll("E", "3");
    wordsInArray = wordsInArray.replaceAll("o", "0");
    wordsInArray = wordsInArray.replaceAll("O", "0");
    wordsInArray = wordsInArray.replaceAll("I", "1");
    if (wordsInArray.startsWith("s")) {
      wordsInArray = wordsInArray.replaceAll("s", "z");
      wordsInArray = wordsInArray.replaceFirst("z", "s");
    } else if (wordsInArray.startsWith("S")) {
      wordsInArray = wordsInArray.replaceAll("S", "Z");
      wordsInArray = wordsInArray.replaceFirst("Z", "S");
      wordsInArray = wordsInArray.replaceAll("s", "z");
    } else {
      wordsInArray = wordsInArray.replaceAll("s", "z");
      wordsInArray = wordsInArray.replaceAll("S", "Z");
      }
      newWord = newWord.concat(" " + wordsInArray);
      newWord = newWord.trim();
    } return newWord;
  }
}
