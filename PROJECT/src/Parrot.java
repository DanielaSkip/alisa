public class Parrot extends Pet{
    private int lengh;
    public Parrot(String name, int age, int weight, boolean health, String species,int lengh) {
        super(name, age, weight,health, species);
        this.lengh = lengh;
    }
    public String toString() {
        return ("Pet's name: " + getName() + "\nPet's age: " + getAge() + "\nPet's weight: "
                + getWeight() + "kg" + "\nHealth: " + isHealth() + "\nspecies: " + getSpecies());
    }
    public int getLengh() {
        return lengh;
    }
    public void setLengh(int lengh) {
        this.lengh = lengh;
    }
}