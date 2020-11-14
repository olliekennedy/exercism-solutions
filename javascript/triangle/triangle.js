export class Triangle {
  constructor(side1, side2, side3) {
    this.sides = [side1, side2, side3];
  }

  isEquilateral() {
    if (this.isNotTriangle()) return false
    return (this.sides[0] == this.sides[1]) && (this.sides[1] == this.sides[2]);
  }

  isIsosceles() {
    if (this.isNotTriangle()) return false;
    if ((this.sides[0] == this.sides[1]) || (this.sides[1] == this.sides[2]) || (this.sides[0] == this.sides[2])) return true;
    return false;
  }

  isScalene() {
    return (!(this.isNotTriangle()) && !this.isIsosceles() && !this.isEquilateral());
  }

  isNotTriangle() {
    if (((this.sides[0] + this.sides[1]) < this.sides[2]) || ((this.sides[1] + this.sides[2]) < this.sides[0]) || ((this.sides[2] + this.sides[0]) < this.sides[1])) return true
    return ((this.sides[0] == 0) || (this.sides[1] == 0) || (this.sides[2] == 0));

  }
}
