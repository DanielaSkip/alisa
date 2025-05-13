class Client {
    private String name;
    private int age;
    private String allergy;

    public Client(String name, int age, String allergy) {
        this.name = name;
        this.age = age;
        this.allergy = allergy;
    }

    @Override
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
}
