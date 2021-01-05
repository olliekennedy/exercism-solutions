import java.util.Arrays;

class DnDCharacter {
  int strength;
  int dexterity;
  int constitution;
  int intelligence;
  int wisdom;
  int charisma;

    DnDCharacter() {
      strength = randomRoll();
      dexterity = randomRoll();
      constitution = randomRoll();
      intelligence = randomRoll();
      wisdom = randomRoll();
      charisma = randomRoll();
    }

    int randomRoll() {
      int[] rolls = new int[4];
      for (int i = 0; i < rolls.length; i++) {
        rolls[i] = (int)Math.ceil(Math.random() * 6);
      }
      Arrays.sort(rolls);
      return rolls[1] + rolls[2] + rolls[3];
    }

    int modifier(int input) {
      System.out.println(input);
      int minus = input - 10;
      System.out.println(minus);
      double divide = (double)minus / 2;
      System.out.println(divide);
      int round;
      round = (int)Math.floor(divide);
      return round;
    }

    int getStrength() {
      return this.strength;
    }

    int getDexterity() {
      return dexterity;
    }

    int getConstitution() {
      return constitution;
    }

    int getIntelligence() {
      return intelligence;
    }

    int getWisdom() {
      return wisdom;
    }

    int getCharisma() {
      return charisma;
    }

    int ability() {
      int rand = (int)Math.ceil(Math.random() * 6);
      if (rand == 1) {
        return getWisdom();
      } else if (rand == 2) {
        return getCharisma();
      } else if (rand == 3) {
        return getStrength();
      } else if (rand == 4) {
        return getDexterity();
      } else if (rand == 5) {
        return getIntelligence();
      } else if (rand == 6) {
        return getConstitution();
      }
      return 0;
    }

    int getHitpoints() {
      return 10 + modifier(getConstitution());
    }

}
