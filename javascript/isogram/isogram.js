//
// This is only a SKELETON file for the 'Isogram' exercise. It's been provided as a
// convenience to get you started writing code faster.
//

export const isIsogram = (str) => {
  var used_chars = []
  var clean_str = str.replace(/\W/g, '')
  clean_str.replace(/\W/g, '').split('').forEach(char => {
    if (!used_chars.includes(char.toLowerCase())) {
      used_chars.push(char.toLowerCase())
    }
  })
  return used_chars.length == clean_str.length
};
