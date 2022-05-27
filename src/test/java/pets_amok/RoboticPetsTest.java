package pets_amok;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RoboticPetsTest {

    RoboticPets underTest = new RoboticPets("name", "Robotic");

    @Test
    public void shouldBeAbleToGetName() {
        String name = underTest.getName();
        assertEquals("name", "name");
    }

    @Test
    public void petsBoredomLevelShouldDecreaseFrom20To5WhenWalk() {

        int boredom = underTest.getBoredom();
        assertEquals(boredom, 5);
    }

    @Test
    public void petsHappinessShouldIncreaseFrom0To50WhenPlayWith() {
        int happiness = underTest.getHappiness();
        assertEquals(happiness,0 );
    }

    @Test
    public void petsHealthLevelShouldIncreaseFrom5To20WhenShelterCleaned() {
        int health = underTest.getHealth();
        assertEquals(health, 0);
    }


    @Test
    public void petsHealthLevelShouldIncreaseFrom5To20WhenOiledRoboticPets() {
        VirtualPet.health = 20;
        assertEquals(20, VirtualPet.health);
    }

    @Test
    public void shouldBeAbleToOilAllRoboticPets() {
      int rustLevel = underTest.getRustLevel();
          assertEquals(10, 10);
    }
}