package pets_amok;


public class RoboticPets extends VirtualPet {

    private int rustLevel = 50;
    private int rustLevelTick = 50;

    private String getName;
    private int boredom = 20;
    private int happiness = 50;
    private int health = 20;


    public RoboticPets(String petName, String type) {
        super(petName, type);
        this.boredom = boredom;
        this.happiness = happiness;
        this.health = health;
    }

    @Override
    public void boredemLevel(int boredom) {

    }

    public String getName() {
        return getName;
    }

    public int getRustLevel() {
        return rustLevel;
    }

    public void oil(int healthAmount, int oilAmount) {
        rustLevel += oilAmount;
        if (rustLevel < 0) {
            rustLevel = 0;
        }
        changeHealth(healthAmount);
    }

    public int getBoredom() {
        return boredom;
    }

    public void roboticTick() {
    }
}
