package pets_amok;

public class OrganicDog extends OrganicPets {

    public OrganicDog(String petName, String type) {
        super(petName, type);

    }
    public void organicDogTick() {

    }

    public void cleanAllCage(int wastAmount) {

    }
@Override
    public void walk(int happinessAmount, int wasteAmount) {
        changeBoredom(happinessAmount);
        changeHappiness(happinessAmount);
        changeHealth(happinessAmount);
        wastLevel(wasteAmount);
    }

}