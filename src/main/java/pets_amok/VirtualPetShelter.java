package pets_amok;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class VirtualPetShelter {
    public int litterBoxLevel = 20;
    Map<String, VirtualPet> virtualPets = new HashMap<String, VirtualPet>();

    private int boredom;
    int health;
    int happiness;
    int thirst;
    int hunger;
    public int getHunger() {
        return hunger;
    }

    public int getThirst() {
        return thirst;
    }

    public int getBoredom() {
        return boredom;
    }

    public int getHappiness() {
        return happiness;
    }

    public int getHealth() {

        return health;
    }

    public void getAddVirtualPet(VirtualPet newPet) {
        virtualPets.put(newPet.getPetName(), newPet);
    }


    public void addPet(VirtualPet newPet) {

        virtualPets.put(newPet.getPetName(), newPet);
    }

    public void removePet(String nameOfPet) {

        virtualPets.remove(nameOfPet);
    }

    public int getLitterBoxLevel() {
        return litterBoxLevel;
    }

    public int changeBoredom() {
        return boredom -= 20;
    }

    public Collection<VirtualPet> getAllVirtualPet() {
        return virtualPets.values();
    }

    public void feedAllOrganicPets(int feedAmount) {
        Collection<VirtualPet> allPets = virtualPets.values();
        for (VirtualPet pet : allPets) {
            if (pet instanceof OrganicPets) {
                OrganicPets organicPet = (OrganicPets) pet;
                organicPet.hungerLevel(feedAmount);
            }
        }
    }

    public void waterAllOrganicPets(int waterAmount) {
        Collection<VirtualPet> allPets = virtualPets.values();
        for (VirtualPet pet : allPets) {
            if (pet instanceof OrganicPets) {
                OrganicPets organicPet = (OrganicPets) pet;
                organicPet.thirstLevel(waterAmount);
            }
        }
    }

    public void playWithPets(int boredom) {
        Collection<VirtualPet> allPets = virtualPets.values();
        for (VirtualPet pet : allPets) {
            if (pet instanceof OrganicPets) {
                OrganicPets organicPet = (OrganicPets) pet;
                organicPet.boredemLevel(boredom);
            }
        }
    }

    public void oilAllRoboticPets(int healthAmount, int oilAmount) {
        Collection<VirtualPet> allPets = virtualPets.values();
        for (VirtualPet pet : allPets) {
            if (pet instanceof RoboticPets) {
                RoboticPets roboticPet = (RoboticPets) pet;
                roboticPet.oil(healthAmount, oilAmount);
            }
        }
    }

    public void walkAllDogs() {
        Collection<VirtualPet> allPets = virtualPets.values();
        for (VirtualPet pet : allPets) {
            if (pet instanceof OrganicPets) {
                OrganicDog organicDog = (OrganicDog) pet;
                organicDog.walk(20, -10);

            } else if (pet instanceof RoboticDog) {
                RoboticDog roboticDog = (RoboticDog) pet;
                roboticDog.walk(20);
            }
        }
    }

    public void cleanDogCages() {
        Collection<VirtualPet> allPets = virtualPets.values();
        for (VirtualPet pet : allPets) {
            if (pet instanceof OrganicDog) {
                OrganicDog organicDog = (OrganicDog) pet;
                organicDog.cleanAllCage(-20);
            }
        }
    }

    public void cleanLitterBox(int waste) {
        Collection<VirtualPet> allPets = virtualPets.values();
        for (VirtualPet pet : allPets) {
            if (pet instanceof OrganicCat) {
                OrganicCat organicCat = (OrganicCat) pet;
                organicCat.litterBox(-10);
            }
        }
    }

    public void napAllCats() {
        Collection<VirtualPet> allPets = virtualPets.values();
        for (VirtualPet pet : allPets) {
            if (pet instanceof OrganicCat) {
                OrganicCat organicCat = (OrganicCat) pet;
                organicCat.napCat(-20);
            }
        }
    }

    public void nameOfAllPets() {
        Collection<VirtualPet> allPets = virtualPets.values();
        for (VirtualPet pet : allPets) {
            System.out.println(pet.nameType());
        }

    }

    public void allPetShelterTick() {
        Collection<VirtualPet> getAllVirtual = virtualPets.values();
        for (VirtualPet pet : getAllVirtual) {
            if (pet instanceof OrganicCat) {
                OrganicCat organicCat = (OrganicCat) pet;
                litterBoxLevel += organicCat.getWastTick();
            }
        }
        for (VirtualPet pet : getAllVirtual) {
            if (pet instanceof OrganicPets) {
                if (pet instanceof OrganicCat) {
                    OrganicCat organicCat = (OrganicCat) pet;
                    if (litterBoxLevel > 50) {
                        organicCat.litterBoxFull(true);
                    }
                    organicCat.organicCatTick();
                }
                if (pet instanceof OrganicDog) {
                    OrganicDog organicDog = (OrganicDog) pet;
                    organicDog.organicDogTick();
                }
            } else {
                RoboticPets roboticPets = (RoboticPets) pet;
                roboticPets.roboticTick();
            }
        }
    }

    public void showPetStatus() {
        Collection<VirtualPet> allPets = virtualPets.values();
        System.out.println("Organic pets status:");
        System.out.println("Name\t|Type\t\t\t|Hunger\t|Thirst\t|Boredom\t|Happiness\t|Health");
        System.out.println("|-------|---------------|-------|-------|-----------|-----------|------|");
        for (VirtualPet pet : allPets) {
            if (pet instanceof OrganicPets) {

                System.out.println(pet.getPetName() + " :" + "\t" + pet.type()
                        + " \t " + ((OrganicPets) pet).getHunger() + "  \t " + ((OrganicPets) pet).getThirst() + "  \t " + pet.getBoredom() + "  \t  " + pet.getHappiness() + "   \t  " + pet.getHealth());
            }
        }
        System.out.println("");
        System.out.println("");
        System.out.println("Robotic pets status:");
        System.out.println("Name\t|Type\t\t|Boredom\t|Happiness\t|Health");
        System.out.println("|-------|-----------|-----------|-----------|------|");
        for (VirtualPet pet : allPets) {
            if (pet instanceof RoboticPets) {

                System.out.println(pet.getPetName() + " :" + "\t" + pet.type()
                        + " \t " + pet.getBoredom() + " \t " + pet.getHappiness() + " \t " + pet.getHealth());
            }
        }
        System.out.println("");
        System.out.println("LitterBox Status : " + litterBoxLevel);

    }

}
