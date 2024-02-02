package dxc.edu;

public class Astronaut extends Person {

    private boolean nuechtern = true;

    private Erfahrung erfahrungsLevel;

    private String nationalitaet;

    private String countdownRede;

    public Astronaut(String name, String uniqueZitat, Erfahrung erfahrungsLevel, String countdownRede, String nationalitaet) {
        super(name, uniqueZitat);

        this.erfahrungsLevel = erfahrungsLevel;
        this.countdownRede = countdownRede;
        this.nationalitaet = nationalitaet;
    }

    public void countdownRedeHalten() {
        System.out.println(countdownRede);
    }

    public boolean isNuechtern() {
        return nuechtern;
    }

    public void setNuechtern(boolean nuechtern) {
        this.nuechtern = nuechtern;
    }

    public Erfahrung getErfahrungsLevel() {
        return erfahrungsLevel;
    }

    public String getCountdownRede() {
        return countdownRede;
    }

    public String getNationalitaet() {
        return nationalitaet;
    }

}
