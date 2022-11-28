public class Main {
    public static void main(String[] args) {
        Fish fish = new Fish();
        fish.setName("mintai");
        fish.setAge(2);
        fish.setColor("series");
        System.out.println(fish);
        Doc doc = new Doc();
        doc.setName("reks");
        doc.setAge(1);
        doc.setColor("black");
        System.out.println(doc);
        Cat cat = new Cat();
        cat.setName("tom");
        cat.setAge(7);
        cat.setColor("while");
        System.out.println(cat);
        Parrot parrot = new Parrot();
        parrot.setName("kukushka");
        parrot.setAge(1);
        parrot.setColor("red");
        System.out.println(parrot);
    }
}