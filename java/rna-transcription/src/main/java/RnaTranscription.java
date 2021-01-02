import java.util.*;

class RnaTranscription {

    String transcribe(String dnaStrand) {
      Map<Character, Character> pairs = Map.of('C','G', 'G','C', 'T','A', 'A','U');
      char[] output = new char[dnaStrand.length()];
      for (var i = 0; i < dnaStrand.length(); i++) {
        output[i] = pairs.get(dnaStrand.charAt(i));
      }
      return new String(output);
    }

}
