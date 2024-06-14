import java.util.Random;

public class Wizard extends Character implements Attacker{
    private int mana = new Random().nextInt(50)+ 1;
    private int intelligence new Random().nextInt(50)+ 1;


    public Wizard(String name, int hp, int mana, boolean isAlive, int intelligence){
        super(name, hp, isAlive);
        this.mana = mana;
        this.intelligence = intelligence;
    }

    //Getter for mana
    public int getMana() {
        return mana;
    }

    //Setter for mana
    public void setMana(int mana) {
        this.mana = mana;
    }

    //getter for intel
    public int getIntelligence() {
        return intelligence;
    }

    //setter for intel
    public void setIntelligence(int intelligence) {
        this.intelligence = intelligence;
    }

    //Override goes here to implement attack()
}

