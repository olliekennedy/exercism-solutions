public class Hamming {
    char[] l, r;
    public Hamming(String leftStrand, String rightStrand) {
      if (leftStrand.length() != rightStrand.length()) {
        if (leftStrand.length() == 0) {
          throw new IllegalArgumentException("left strand must not be empty.");
        } else if (rightStrand.length() == 0) {
          throw new IllegalArgumentException("right strand must not be empty.");
        } else {
        throw new IllegalArgumentException("leftStrand and rightStrand must be of equal length.");
        }
      }
      l = leftStrand.toCharArray();
      r = rightStrand.toCharArray();
    }

    public int getHammingDistance() {
      int total = 0;
      for (int i = 0; i < l.length; i++) {
        if (l[i] != r[i]) {
          total += 1;
        }
      }
      return total;
    }
}
