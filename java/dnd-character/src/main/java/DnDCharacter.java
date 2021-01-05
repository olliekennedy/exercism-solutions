import java.util.Arrays;

class DnDCharacter {
    int strength, dexterity, constitution, intelligence, wisdom, charisma;

    DnDCharacter() {
      strength = sumAllButMin(rolls(4));
      dexterity = sumAllButMin(rolls(4));
      constitution = sumAllButMin(rolls(4));
      intelligence = sumAllButMin(rolls(4));
      wisdom = sumAllButMin(rolls(4));
      charisma = sumAllButMin(rolls(4));
    }

    int randOneToSix() {
      return (int)Math.ceil(Math.random() * 6);
    }

    int[] rolls(int num) {
      int[] rolls = new int[num];
      for (int i = 0; i < num; i++) {
        rolls[i] = randOneToSix();
      }
      return rolls;
    }

    int sumAllButMin(int[] rolls) {
      Arrays.sort(rolls);
      int total = 0;
      for (int i = 1; i < rolls.length; i++) {
        total += rolls[i];
      }
      return total;
    }

    int modifier(int input) {
      return (int)Math.floor((double)(input - 10) / 2);
    }

    int getStrength() {
      return strength;
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
      switch (randOneToSix()) {
        case 1:
          return getWisdom();
        case 2:
          return getCharisma();
        case 3:
          return getStrength();
        case 4:
          return getDexterity();
        case 5:
          return getIntelligence();
        default:
          return getConstitution();
      }
    }

    int getHitpoints() {
      return 10 + modifier(getConstitution());
    }

}
