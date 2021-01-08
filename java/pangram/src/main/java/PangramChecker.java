public class PangramChecker {

    public boolean isPangram(String input) {
      char[] letters = "abcdefghijklmnopqrstuvwxyz".toCharArray();
      char[] inputChars = input.toCharArray();
      for (int i = 0; i < inputChars.length; i++) {
        for (int j = 0; j < letters.length; j++) {
          if (Character.toLowerCase(inputChars[i]) == letters[j]) {
            letters[j] = '0';
          }
        }
      }
      for (int i = 0; i < letters.length; i++) {
        if (letters[i] != '0') {
          return false;
        }
      }
      return true;
    }

}
