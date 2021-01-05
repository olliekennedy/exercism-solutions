import java.util.Arrays;

class DnDCharacter {
  
    int strength, dexterity, constitution, intelligence, wisdom, charisma;

    DnDCharacter() {
      DnDCharCreate creator = new DnDCharCreate();
      creator.create(this);
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

    private int randOneToSix() {
      return (int)Math.ceil(Math.random() * 6);
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

class DnDCharCreate {

  public void create(DnDCharacter newChar) {
    newChar.strength = initialiseAttribute();
    newChar.dexterity = initialiseAttribute();
    newChar.constitution = initialiseAttribute();
    newChar.intelligence = initialiseAttribute();
    newChar.wisdom = initialiseAttribute();
    newChar.charisma = initialiseAttribute();
  }

  private int initialiseAttribute() {
    return sumAllButMin(rolls(4));
  }

  private int[] rolls(int num) {
    Die sixer = new Die(6);
    int[] rolls = new int[num];
    for (int i = 0; i < num; i++) {
      rolls[i] = sixer.roll();
    }
    return rolls;
  }

  private int sumAllButMin(int[] rolls) {
    Arrays.sort(rolls);
    int total = 0;
    for (int i = 1; i < rolls.length; i++) {
      total += rolls[i];
    }
    return total;
  }

}

class Die {

  private int sides;

  Die(int sides) {
    this.sides = sides;
  }

  public int roll() {
    return (int)Math.ceil(Math.random() * sides);
  }

}
