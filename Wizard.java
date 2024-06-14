import java.util.Random;

public class Wizard extends Character implements Attacker{
    private int mana = new Random().nextInt(51)+ 10;
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

    @Override
    public void attack(){
        if (mana > 0){
        System.out.println("Wizard conjures a spell using Magic");
        }else {
            System.out.println("Out of mana... this Staff shall do: ");
        }
    }

    //Override the attack method
    @Override
    public void attack(Character warrior){
        if(mana > 0){
            damage = this.getIntelligence();
        }else {
            damage = (int) (this.getIntelligence() * 0.5);
        }
    }

    int newHp = warrior.getHp() - damage;
    warrior.setHp(newHp > 0 ? newHp : 0);

    System.out.println("Wizard attacked " + warrior.getName() + ". For " + damage + " damage!" )
}

