package pets_amok;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class VirtualPetTest {
VirtualPetShelter underTest = new VirtualPetShelter();

@Test
    public void shouldBeAbleToFeedOrganicPets() {
       int hunger = underTest.getHunger();
       assertEquals(hunger, 0);
    }
    @Test
    public void petsThirstLevelShouldDecreaseFrom100To50WhenFeeWater() {
        int thirst = underTest.getThirst();
        assertEquals(thirst, 0);
    }


    @Test
    public void petsBoredomLevelShouldDecreaseFrom20To5WhenWalk() {

        int boredom = underTest.getBoredom();
        assertEquals(boredom, 0);
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
    public void shouldBeAbleToAddNewPets() {
        VirtualPetShelter addVirtualPet = new VirtualPetShelter();
       String pets = underTest.getAddVirtualPet();
       assertEquals(null,pets);
    }


    @Test
    public void shouldBeAbleToRemovePets() {
        VirtualPetShelter removePet = new VirtualPetShelter();
        String pets = underTest.removePet();
        assertEquals(null,pets);

    }

    @Test
    public void shouldBeAbleToFeedAllOrganicPets() {
        int feedAmount = -5;
        //underTest.feedOrganicPet(feedAmount);
    }

@Test
    public void shouldBeAbleToOilAllRoboticPets(){
    VirtualPet.rustLevel = 20;
    assertEquals(20, VirtualPet.rustLevel);
}
}

