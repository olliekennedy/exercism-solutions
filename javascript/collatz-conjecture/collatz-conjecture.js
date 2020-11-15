export const steps = (n) => {
  if (n < 1) throw Error('Only positive numbers are allowed');
  for (var i = 0; n != 1; i++) {
    (n % 2 == 0) ? n /= 2 : n = (n * 3) + 1;
  };
  return i;
};
