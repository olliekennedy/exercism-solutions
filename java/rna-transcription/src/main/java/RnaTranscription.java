import java.util.*;

class RnaTranscription {

    Map<String, String> pairs = Map.of("C","G", "G","C", "T","A", "A","U");

    String transcribe(String dnaStrand) {
      StringBuilder strand = new StringBuilder(dnaStrand);
      for (var i = 0; i < strand.length(); i++) {
        strand.replace(i,i+1,pairs.get(strand.substring(i,i+1)));
      }
      return new String(strand);
    }

}
