import java.util.Random;

public class Wizard extends Character {
    private int mana;
    private int intelligence;


    public Wizard(String name, int hp, int mana, int intelligence){
        super(name, generateRandomHp(WIZARD_MIN_HP, WIZARD_MAX_HP));
        this.mana = new Random().nextInt(51)+ 10;
//        this.intelligence = new Random().nextInt(50)+ 1;
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
        return intelligence = new Random().nextInt(50)+ 1;
    }

    //setter for intel
    public void setIntelligence(int intelligence) {
        this.intelligence = intelligence;
    }


    //Override goes here to implement attack()

    @Override
    public void attack(Character target) {
        int damage;
        while (isAlive() && target.isAlive()) {
            if (mana > 0) {
                damage = this.getIntelligence();
                System.out.println("Wizard conjures a spell using Magic");
                mana--;
            } else {
                damage = (int) (this.getIntelligence() * 0.5);
                System.out.println("Out of mana... this Staff shall do: ");
            }
            int newHp = target.getHp() - damage;
            target.setHp(newHp > 0 ? newHp : 0);


            System.out.println("Wizard attacked " + target.getName() + " for " + damage + " damage!");
            System.out.println(target.getName() + " currently has: " + target.getHp() + " remaining!");
        }
            // Check if the target is still alive
            if (target.getHp() <= 0) {
                target.setAlive(false);
                System.out.println(target.getName() + " has been defeated.");
            }
    }
}

