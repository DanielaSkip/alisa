public class Client {

    private String name;
    private int age;
    private String allergy;


    public Client(String name, int age, String allergy) {
        this.name = name;
        this.age = age;
        this.allergy = allergy;
    }

    public String toString() {
        return "Client: " + name +
                "\nAge: " + age +
                "\nAllergy: " + allergy;
    }

    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }

    public String getAllergy() {
        return allergy;
    }
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setAllergy(String allergy) {
        this.allergy = allergy;
    }
}