package dxc.edu;

public abstract class Person {

    private String name;
    private String uniqueZitat;

    public Person(String name, String uniqueZitat) {
        this.name = name;
        this.uniqueZitat = uniqueZitat;
    }

    public String getName() {
        return name;
    }

    public String getUniqueZitat() {
        return uniqueZitat;
    }

    public void uniqueZitatSagen() {

        System.out.println(getUniqueZitat());
    }
}
