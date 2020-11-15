export class Triangle {
  constructor(a, b, c) {
    this.s = [a, b, c];
  }

  isEquilateral() {
    return (this.s[0] == this.s[1]) &&
      (this.s[1] == this.s[2]) &&
      this.isTriangle();
  }

  isIsosceles() {
    return this.isTriangle() &&
      ((this.s[0] == this.s[1]) ||
      (this.s[1] == this.s[2]) ||
      (this.s[0] == this.s[2]));
  }

  isScalene() {
    return this.isTriangle() &&
      !this.isIsosceles() &&
      !this.isEquilateral();
  }

  isTriangle() {
    return !([this.s[0], this.s[1], this.s[2]].includes(0) ||
      ((this.s[0] + this.s[1]) < this.s[2]) ||
      ((this.s[1] + this.s[2]) < this.s[0]) ||
      ((this.s[2] + this.s[0]) < this.s[1]));
  }
}
