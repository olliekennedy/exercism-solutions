class Darts {

    double x;
    double y;
    int outerRad = 10;
    int middleRad = 5;
    int innerRad = 1;
    double rad;

    Darts(double x, double y) {
      x = x;
      y = y;
      rad = Math.sqrt((x * x) + (y * y));
    }

    int score() {
      if (rad > outerRad) {
        return 0;
      } else if (rad > middleRad) {
        return 1;
      } else if (rad > innerRad) {
        return 5;
      } else {
        return 10;
      }
    }

}
