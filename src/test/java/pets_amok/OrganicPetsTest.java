package pets_amok;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class OrganicPetsTest {

OrganicPets underTest;

    public OrganicPetsTest() {
        underTest = new OrganicPets("name", "organic") {
            @Override
            public void walk(int happinessAmount, int wasteAmount) {

            }
        };
    }

    @Test
    public void shouldBeAbleToFeedOrganicPets() {
        int hunger = underTest.getHunger();
        assertEquals(hunger,50 );
    }
    @Test
    public void petsThirstLevelShouldDecreaseFrom100To50WhenFeeWater() {
        int thirst = underTest.getThirst();
        assertEquals(thirst, 50);
    }


    @Test
    public void petsBoredomLevelShouldDecreaseFrom20To5WhenWalk() {

        int boredom = underTest.getBoredom();
        assertEquals(boredom, 5);
    }

    @Test
    public void petsHappinessShouldIncreaseFrom0To50WhenPlayWith() {
        int happiness = underTest.getHappiness();
        assertEquals(happiness, 0);
    }

    @Test
    public void petsHealthLevelShouldIncreaseFrom5To20WhenShelterCleaned() {
        int health = underTest.getHealth();
        assertEquals(health, 0);
    }

    @Test
    public void shouldBeAbleToFeedAllOrganicPets() {
        int feedAmount = -5;
        underTest.feedOrganicPet(feedAmount);
    }

    @Test
    public void shouldBeAbleToOilAllRoboticPets(){
        VirtualPet.rustLevel = 20;
        assertEquals(20, VirtualPet.rustLevel);
    }


}
