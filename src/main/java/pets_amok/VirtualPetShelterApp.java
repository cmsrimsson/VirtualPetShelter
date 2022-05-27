package pets_amok;

import java.util.Scanner;

public class VirtualPetShelterApp {
    public static void main(String[] args) {

        VirtualPetShelter myShelter = new VirtualPetShelter();
        OrganicDog oDog = new OrganicDog("Khandu", "Organic Dog");
        OrganicCat oCat = new OrganicCat("Jerry", "Organic Cat");
        RoboticDog rDog = new RoboticDog("Musk", "Robotic Dog");
        RoboticCat rCat = new RoboticCat("Flux", "Robotic Cat");

        myShelter.addPet(oDog);
        myShelter.addPet(oCat);
        myShelter.addPet(rDog);
        myShelter.addPet(rCat);
        String userChoice;

        Scanner input = new Scanner(System.in);

        System.out.println("Welcome to the Virtual Shelter");
        System.out.println("");

        Boolean activeShelterGame;
        activeShelterGame = true;

        while (activeShelterGame) {
            System.out.println("Pets ( Organic / Robotic ) current Status:");
            System.out.println();
            myShelter.showPetStatus();
            System.out.println();
            System.out.println("What would you like to do today at this Virtual Pet Shelter? (Choose any option below:) ");
            System.out.println();
            System.out.println("1. Feed all organic pets.");
            System.out.println("2. Water all organic pets.");
            System.out.println("3. Play with a pets.");
            System.out.println("4. Oil all robotic pet.");
            System.out.println("5. Take all dogs for a walk.");
            System.out.println("6. Nap all the cats.");
            System.out.println("7. Clean all organic cages");
            System.out.println("8. Clean cat litter box");
            System.out.println("9. Add a new pet at shelter");
            System.out.println("10. Adopt a pet.");
            System.out.println("11. Quit");
            System.out.println();

            userChoice = input.nextLine();

            switch (userChoice) {
                case "1": {
                    System.out.println();
                    myShelter.allPetShelterTick();
                    myShelter.feedAllOrganicPets(20);
                    break;
                }

                case "2": {
                    System.out.println();
                    myShelter.allPetShelterTick();
                    myShelter.waterAllOrganicPets(20);
                    break;
                }

                case "3": {
                    System.out.println();
                    myShelter.allPetShelterTick();
                    myShelter.playWithPets(20);
                    break;
                }

                case "4": {
                    System.out.println();
                    myShelter.allPetShelterTick();
                    myShelter.oilAllRoboticPets(20, 20);
                    break;
                }

                case "5": {
                    System.out.println();
                    myShelter.allPetShelterTick();
                    myShelter.walkAllDogs();
                    break;
                }

                case "6": {
                    System.out.println();
                    myShelter.allPetShelterTick();
                    myShelter.napAllCats();
                    break;
                }

                case "7": {
                    System.out.println();
                    myShelter.allPetShelterTick();
                    myShelter.cleanDogCages();
                    break;
                }

                case "8": {
                    System.out.println();
                    myShelter.allPetShelterTick();
                    myShelter.cleanLitterBox(-5);
                    break;
                }

                case "9": {
                    System.out.println();
                    System.out.println("Please add type(organic cat or dog) or (robotic cat ot dog) of new pet");
                    System.out.println(" 1. Organic dog");
                    System.out.println(" 2. Organic cat");
                    System.out.println(" 3. Robotic dog");
                    System.out.println(" 4. Robotic cat");
                    System.out.println("Please choose above option for type of pet you are going to admit in this Virtual Shelter.");
                    String newPet = input.nextLine();
                    System.out.println("Please enter name of the pet: ");
                    String newPetName = input.nextLine();

                    switch (newPet) {
                        case "1":
                            OrganicDog newOrganicDog = new OrganicDog(newPetName, "Organic Dog");
                            myShelter.addPet(newOrganicDog);
                            System.out.println("We got a new organic dog in the shelter:  " + newOrganicDog.getPetName());
                            break;
                        case "2":
                            OrganicCat newOrganicCat = new OrganicCat(newPetName, "Organic Cat");
                            myShelter.addPet(newOrganicCat);
                            System.out.println("We got a new organic cat in the shelter:  " + newOrganicCat.getPetName());
                            break;
                        case "3":
                            RoboticDog newRoboticDog = new RoboticDog(newPetName, "Robotic Dog");
                            myShelter.addPet(newRoboticDog);
                            System.out.println("We got a new robotic dog in the shelter:  " + newRoboticDog.getPetName());
                            break;
                        case "4":
                            RoboticCat newRoboticCat = new RoboticCat(newPetName, "Robotic Cat");
                            myShelter.addPet(newRoboticCat);
                            System.out.println("We got a new robotic cat in the shelter:  " + newRoboticCat.getPetName());
                            break;
                    }

                    myShelter.allPetShelterTick();
                    break;
                }

                case "10": {
                    System.out.println("Which pet would you like to adopt as new pet?");
                    myShelter.nameOfAllPets();
                    System.out.println();
                    String nameOfThePet = input.next();
                    myShelter.removePet(nameOfThePet);
                    System.out.println("Thank you for adopting this pet.");
                    break;
                }

                case "11": {
                    activeShelterGame = false;
                    System.out.println("");
                }

                default: {
                    System.out.println("Thank you for playing virtual shelter game. See you next time !!!");
                }
            }

            myShelter.allPetShelterTick();
        }
    }
}
