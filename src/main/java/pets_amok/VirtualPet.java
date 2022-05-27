package pets_amok;

public abstract class VirtualPet {
    public static int rustLevel;
    protected String petName;
    protected String type;

    private int boredom = 50;
    private int happiness = 50;
    private int health = 50;

    private boolean isAlive = true;

   public void VirtualPet(int boredom, int happiness, int health) {

        this.boredom = boredom;
        this.happiness = happiness;
        this.health = health;
    }

    public int getBoredom() {
        return boredom;
    }
    public int getHealth() {
        return health;
    }
    public int getHappiness() {
        return happiness;
    }

    public VirtualPet(String petName, String type) {
        this.petName = petName;
        this.type = type;
    }
    public String type() {
       return type;
    }
    public String getPetName() {
       return petName;
    }

    public void setIsAlive(boolean status) {
       isAlive = status;
    }

    public String nameType() {
       return petName + " : " + type + ".";
    }

    public void feedOrganicPet(int feedAmount) {

    }

    public void changeBoredom(int amount) {
        boredom += amount;
        if (boredom > 100) {
            boredom= 100;
        } else if (health < 0) {
            boredom = 0;
        }
    }
    public void changeHappiness(int amount) {
        happiness += amount;
        if (happiness > 100) {
            happiness = 100;
        } else if (happiness < 0) {
            happiness = 0;
        }
    }

    public void changeHealth(int amount) {
        health += amount;
        if (health > 100) {
            health = 100;
        } else if (health <= 0) {
            isAlive = false;
        }
    }


    public String getVirtualPet() {
       return getVirtualPet();
    }

    public VirtualPet addPet(OrganicCat testOCat) {
       return null;
    }

    public abstract void boredemLevel(int boredom);
}