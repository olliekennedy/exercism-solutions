class ArmstrongNumbers {

    boolean isArmstrongNumber(int numberToCheck) {

      String[] input = String.valueOf(numberToCheck).split("");
      int sum = 0;
      for (var i = 0; i < input.length; i++) {
        sum = sum + (int)Math.pow(Integer.valueOf(input[i]), input.length);
      }
      if (sum == Integer.valueOf(numberToCheck)) {
        return true;
      } else {
        return false;
      }

    }

}
