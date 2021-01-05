import java.math.BigInteger;

class Grains {

    BigInteger grainsOnSquare(final int square) {
        if (square < 1 || square > 64) {
          throw new IllegalArgumentException("square must be between 1 and 64");
        }
        BigInteger two = new BigInteger("2");
        return two.pow(square - 1);
    }

    BigInteger grainsOnBoard() {
      BigInteger total = new BigInteger("0");
      for (int i = 1; i < 65; i++) {
        total = total.add(grainsOnSquare(i));
      }
      return total;

      // BigInteger total = grainsOnSquare(65).subtract(new BigInteger("1"));
      // return total;
    }

}
