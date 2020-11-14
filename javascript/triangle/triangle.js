export class Triangle {
  constructor(side1, side2, side3) {
    this.sides = [side1, side2, side3];
  }

  isEquilateral() {
    return (this.sides[0] == this.sides[1]) &&
           (this.sides[1] == this.sides[2]) &&
           !this.isNotTriangle();
  }

  isIsosceles() {
    if (this.isNotTriangle()) return false;
    if ((this.sides[0] == this.sides[1]) ||
        (this.sides[1] == this.sides[2]) ||
        (this.sides[0] == this.sides[2]))
        return true;
    return false;
  }

  isScalene() {
    return !this.isNotTriangle() &&
           !this.isIsosceles() &&
           !this.isEquilateral();
  }

  isNotTriangle() {
    return (this.sides[0] == 0) ||
           (this.sides[1] == 0) ||
           (this.sides[2] == 0) ||
          ((this.sides[0] + this.sides[1]) < this.sides[2]) ||
          ((this.sides[1] + this.sides[2]) < this.sides[0]) ||
          ((this.sides[2] + this.sides[0]) < this.sides[1]);
  }
}
