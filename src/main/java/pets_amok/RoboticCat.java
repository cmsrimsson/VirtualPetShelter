package pets_amok;

public class RoboticCat extends RoboticPets{


    private String name;
    private String type;
    private int happiness;
    private int boredom;
    private int health;

    public RoboticCat(String name, String type) {
        super(name,type);
        this.boredom = boredom;
        this.happiness = happiness;
        this.health = health;
    }

}
