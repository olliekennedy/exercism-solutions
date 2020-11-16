export class Clock {
  constructor(hours, minutes=0) {
    this.d = new Date((hours*60 + minutes) * 60000)
  }

  toString() {
    return this.d.toISOString().substr(11, 5);
  }

  plus(int) {
    this.d = new Date(this.d.getTime() + int*60000);
    return this;
  }

  minus(int) {
    this.d = new Date(this.d.getTime() - int*60000);
    return this;
  }

  equals(clock) {
    return this.toString() == clock.toString();
  }
}
