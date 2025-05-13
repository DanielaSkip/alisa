public class Main {
    public static void main(String[] args) {
        Pet p1 = new Pet("Boba",10,62,true,"Cat");
        System.out.println( p1.toString());
        Turtle t1 = new Turtle("Avrora",5,10,true,"jogkti","big");
        System.out.println( t1.toString());
        Parrot p2 =new Parrot("Knopa",7,8,true,"io",60);
        System.out.println( p2.toString());
        Cat c1 = new Cat("Artis",6,4,true,"Cat",2);
        System.out.println( c1.toString());
        Dog d1 = new Dog("Rizik",3,9,true,"Dog","small");
        System.out.println( d1.toString());
        Dog f1 = new Dog("Buddy", 10, 15,true, "Dog", "Dog");
        System.out.println( f1.toString());
        Pet.writeFile();
    }}