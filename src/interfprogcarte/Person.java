package interfprogcarte;

public class Person implements Walkable {
    private String name;

    public Person(String name) {
        this.name = name;
    }
    public void walk() {
        System.out.println(name + "  (a person) is walking");
    }
}
