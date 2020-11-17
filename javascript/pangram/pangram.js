export const isPangram = (str, char = '') => {
  return 'abcdefghijklmnopqrstuvwxyz'.split('').every(function(char) {return str.toLowerCase().includes(char)}, char)
};
