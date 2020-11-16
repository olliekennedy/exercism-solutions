export const compute = (l,r) => {
  if (l.length != r.length) {
    if (l.length == 0) throw Error('left strand must not be empty');
    if (r.length == 0) throw Error('right strand must not be empty');
    throw Error('left and right strands must be of equal length');
  }
  var ham = 0
  for (var i = 0; i < l.length; i++) {
    if (l[i] != r[i]) ham++
  }
  return ham
};
