export const toRna = (dna) => {
  var rna = []
  dna.split('').forEach(char => {
    rna.push(COMPS[char])
  })
  return rna.join('')
};

export const COMPS = { 'G':'C', 'C':'G', 'T':'A', 'A':'U' }
