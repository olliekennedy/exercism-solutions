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
    var transpose = this.m[0].map((col, i) => this.m.map(row => row[i]));
    return transpose.rows
  }
}
