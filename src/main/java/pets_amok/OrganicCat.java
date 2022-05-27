package pets_amok;

public class OrganicCat extends OrganicPets {
    private int hunger = 50;
    private int thirst = 50;
    private int waste = 50;
    public int wastTick;

    public OrganicCat(String petName, String type) {
        super(petName, type);
    }

    public int getWastTick() {
        return wastTick;
    }

    public void litterBoxFull(boolean b) {
    }

    public void organicCatTick() {
    }

    public void litterBox(int wasteAmount) {
        return ;
    }

    public void napCat(int boredomAmount) {
        changeBoredom(boredomAmount);
        changeHappiness(boredomAmount);
    }
    @Override
    public void walk(int happinessAmount, int wasteAmount) {

    }
}
