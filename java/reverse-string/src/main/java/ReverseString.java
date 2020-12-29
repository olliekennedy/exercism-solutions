import java.util.ArrayList;

class ReverseString {

    String reverse(String inputString) {
        var chars = inputString.split("");
        // String reverseChars[] = new String[chars.length];
        // for (int i=reverseChars.length-1;i>0;i--) {
        //   reverseChars[i] = chars[chars.length - i];
        // }
        // var output = String.join("", reverseChars);
        // System.out.println("chickens");
        // return output;
        ArrayList<String> reversed = new ArrayList<String>();
        for (int i = inputString.length() - 1; i > 0; i--) {
          reversed.add(chars[i]);
        }
        return String.join("", reversed);
    }

}
