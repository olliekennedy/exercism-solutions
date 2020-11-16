export const primeFactors = (int) => {
  var lastTest = int < 100000 ? int+1 : Math.pow(Math.sqrt(int), 1.2)
  var factors = []
  var left = int
  var i = 2
  while (i < lastTest) {
    if (left % i == 0) {
      factors.push(i)
      left /= i
    } else {
      i++
    }
  }
  return factors
};

93819012551
