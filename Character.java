import java.util.UUID;

public class Character implements IAttacker{
    private String id;
    private String name;
    private int hp;
    private boolean isAlive;

    //CONSTRUCTOR
    public Character(String name, int hp) {
        setId(); //Auto-generated
        setName(name);
        setHp(hp);
        setAlive(true);

    }

    protected int generateRandomHp() {
        return hp;
    }

    //GETTERS & SETTERS
    public String getId() {
        return id;
    }

    public void setId() {this.id= UUID.randomUUID().toString();}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
        if (this.hp <= 0) {
            this.hp = 0;
            this.isAlive = false;
        }
    }

    public boolean isAlive() {
        return isAlive;
    }

    public void setAlive(boolean alive) {
        isAlive = alive;
    }

    @Override
    public void attack(Character character) {}
}
