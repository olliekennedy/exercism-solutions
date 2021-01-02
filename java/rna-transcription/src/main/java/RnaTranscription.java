import java.util.HashMap;

class RnaTranscription {

    String transcribe(String dnaStrand) {
      HashMap<Character, Character> pairs = new HashMap<Character, Character>();
      pairs.put('C', 'G');
      pairs.put('G', 'C');
      pairs.put('T', 'A');
      pairs.put('A', 'U');
      if (dnaStrand.length() == 0) {
        return "";
      }
      char[] nucleotides = dnaStrand.toCharArray();
      char[] output = new char[nucleotides.length];
      for (var i = 0; i < nucleotides.length; i++) {
        output[i] = pairs.get(nucleotides[i]);
      }
      return new String(output);
    }

}
