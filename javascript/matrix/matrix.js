//
// This is only a SKELETON file for the 'Matrix' exercise. It's been provided as a
// convenience to get you started writing code faster.
//

export class Matrix {
  constructor(m) {
    this.m = m.split(/\n/);
  }

  get rows() {
    return this.m.map(row => {return row.split(' ').map(char => {return parseInt(char)})});
  }

  get columns() {
    var output = []
    if (this.m.length === 1) return this.m.forEach(el => output.push([parseInt(el)]))
    for (var i = 0; i < this.m.length; i++) {
      output.push([])
      for (var j = 0; j < this.m.length; j++) {
        output[i].push(this.m[j][i])
      }
    }
    return output

  }
}
