//
// This is only a SKELETON file for the 'Pangram' exercise. It's been provided as a
// convenience to get you started writing code faster.
//

export const isPangram = (str) => {
  var alphabet = 'abcdefghijklmnopqrstuvwxyz'.split('');
  var str_chars = str.toLowerCase().split('');
  alphabet.forEach(char => {
    if (str_chars.includes(char) == false) return false;
  })
  return str_chars.length > 1
};
