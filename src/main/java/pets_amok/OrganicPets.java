package pets_amok;

public abstract class OrganicPets extends VirtualPet {

    private int hunger = 50;
    private int thirst = 50;
    private int waste = 50;

    public OrganicPets(String petName, String type) {
        super(petName, type);
    }



    public int getHunger() {
        return hunger;
    }

    public int getThirst() {
        return thirst;
    }

    public int getWaste() {
        return waste;
    }

    public void thirstLevel(int waterAmount) {
        thirst -= waterAmount;
        if (thirst < 0) {
            thirst = 0;
        }
    }

    public void hungerLevel(int feedAmount) {
        hunger -= feedAmount;
        if (hunger < 0) {
            hunger = 0;
        }
    }

    public int wastLevel(int wasteAmount) {
        return waste;
    }

    public String getAddVirtualPet() {
        return getAddVirtualPet();
    }

    @Override
    public void boredemLevel(int boredom) {

    }

    public abstract void walk(int happinessAmount, int wasteAmount);
}

