package pets_amok;

public class RoboticDog extends RoboticPets{

    private String name;
    private String type;

    public RoboticDog(String name, String type) {
        super(name,type);
        this.name = name;
        this.type = type;
    }

    public void walk(int happinessAmount) {
        changeHappiness(happinessAmount);
    }

}
