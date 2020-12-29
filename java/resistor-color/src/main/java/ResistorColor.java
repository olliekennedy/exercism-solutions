class ResistorColor {
    int colorCode(String color) {
        for (var i = 0; i < colors().length; i++) {
          if (colors()[i] == color) {
            return i;
          }
        }
        return 100;
    }

    String[] colors() {
        String[] arr = {"black", "brown", "red", "orange", "yellow", "green", "blue", "violet", "grey", "white"};
        return arr;
    }
}
