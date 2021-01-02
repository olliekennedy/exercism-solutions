class ArmstrongNumbers {

    boolean isArmstrongNumber(int numberToCheck) {
      char[] input = String.valueOf(numberToCheck).toCharArray();
      int sum = 0;
      for (int i = 0; i < input.length; i++) {
        sum = sum + (int)Math.pow(Character.getNumericValue(input[i]), input.length);
      }
      return sum == numberToCheck;
    }

}
