class ResistorColorDuo {
    int value(String[] colors) {
        String[] codes = new String[2];
        for (var i = 0; i < 2; i++) {
            for (var j = 0; j < colors().length; j++) {
                if (colors[i] == colors()[j]) {
                  codes[i] = String.valueOf(j);
                }
            }
        }
        String code = String.join("", codes);
        return Integer.valueOf(code);
    }

    String[] colors() {
        String[] arr = {"black", "brown", "red", "orange", "yellow", "green", "blue", "violet", "grey", "white"};
        return arr;
    }
}
