//
// This is only a SKELETON file for the 'Clock' exercise. It's been provided as a
// convenience to get you started writing code faster.
//

export class Clock {
  constructor(hours, minutes=0) {
    this.d = new Date(2020, 11, 11, hours, minutes, 0, 0)
  }

  padded(int) {
    return ('' + int).length == 2 ? '' + int : '0' + int;
  }

  toString() {
    var h = this.padded(this.d.getHours());
    var m = this.padded(this.d.getMinutes());
    return `${h}:${m}`
  }

  plus(int) {
    // this.d = new Date(this.d.getTime() + int*60000);
    // return this.d
    // return this.d.setMinutes((this.d.getMinutes() + int)) ;
  }

  minus() {
    throw new Error('Remove this statement and implement this function');
  }

  equals() {
    throw new Error('Remove this statement and implement this function');
  }
}
