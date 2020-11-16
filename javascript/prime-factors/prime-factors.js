export const primeFactors = (int) => {
  var factors = [];
  var i = 2;
  while (int > 1) {
    if (int % i == 0) {
      factors.push(i);
      int /= i;
    } else {
      i++;
    };
  };
  return factors;
};
