package dxc.edu;

public  class Astronaut extends Person {

    private boolean nuechtern;
    private Erfahrung erfahrungsLevel;
    private String countdownRede;
    private String nationalitaet;

    public Astronaut(String name, String uniqueZitat, boolean nuechtern, Erfahrung erfahrungsLevel, String countdownRede, String nationalitaet) {
        super(name, uniqueZitat);
        this.nuechtern = nuechtern;
        this.erfahrungsLevel = erfahrungsLevel;
        this.countdownRede = countdownRede;
        this.nationalitaet = nationalitaet;
    }

    public boolean isNuechtern() {
        return nuechtern;
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

    public void countdownRedeHalten() {
        System.out.println(getCountdownRede());
    }
}
