export const isPangram = (str) => {
  return [...'abcdefghijklmnopqrstuvwxyz'].every(char => str.toLowerCase().includes(char));
};
