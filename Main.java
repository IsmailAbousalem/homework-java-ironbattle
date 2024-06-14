public class Main {
    public static void main(String[] args) {
        Warrior warrior = new Warrior("Gladiator", 0, 0, 0);
        Warrior warrior1 = new Warrior ("Spartacus", 0, 0, 0);

        System.out.println("Warrior 0: " + warrior.getName() + " HP: " + warrior.getHp() + " Stamina: " + warrior.getStamina() + " Strength: " + warrior.getStrength());
        System.out.println("Warrior 1: " + warrior1.getName() + " HP: " + warrior1.getHp() + " Stamina: " + warrior1.getStamina() + " Strength: " + warrior1.getStrength());

        while (warrior.getHp() > 0 && warrior1.getHp() > 0) {
            warrior.attack(warrior1);
            System.out.println(warrior1.getName() + " is now at: " + warrior1.getHp() +  "HP");

            if (warrior1.getHp() <= 0) {
                break;
            }

            warrior1.attack(warrior);
            System.out.println(warrior.getName() + " is now at: " + warrior.getHp() +  "HP");

            try {
                Thread.sleep(2000); // Pause for 2 seconds
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        if (warrior.getHp() > 0) {
            System.out.println(warrior.getName() + " wins!");
        } else {
            System.out.println(warrior1.getName() + " wins!");
        }

    }
}
