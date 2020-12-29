class ReverseString {

    String reverse(String inputString) {
        var chars = inputString.split("");
        String[] reverse = new String[chars.length];
        for (int i = 0; i < chars.length; i++) {
          reverse[i] = chars[chars.length - i - 1];
        }
        return String.join("", reverse);
    }

}
