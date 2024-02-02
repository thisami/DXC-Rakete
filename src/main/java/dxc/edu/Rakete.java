package dxc.edu;

public class Rakete {

    private String name;

    private String farbe;

    private String hersteller;

    private int personenKapazitaet;

    private boolean nuklearAntrieb = false;

    private double treibstoffMenge = 0.0;

    private boolean motorenLaufen = false;

    private int geschwindigkeit = 0;

    public Rakete() {
    }

    public Rakete(String name, String farbe, String hersteller, int personenKapazitaet) {
        this.name = name;
        this.farbe = farbe;
        this.hersteller = hersteller;
        this.personenKapazitaet = personenKapazitaet;
    }

    public void motorenStarten() throws IllegalStateException {
        if (motorenLaufen) {
            throw new IllegalStateException("Motoren laufen bereits");
        } else {
            motorenLaufen = true;
        }
    }

    public boolean isMotorenLaufen() {
        return motorenLaufen;
    }

    public void setGeschwindigkeit(int geschwindigkeit) {
        this.geschwindigkeit = geschwindigkeit;
    }

}
