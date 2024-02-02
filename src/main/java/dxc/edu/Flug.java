package dxc.edu;

import java.time.LocalDateTime;

public class Flug {
    private boolean wetterOkay;
    private LocalDateTime geplanteAbflugzeit;
    private boolean kommunikationAufgebaut;
    private boolean flugbahnOkay;
    private Astronaut[] astronaut;
    private Rakete rakete;
    private Bodenstation bodenstation;

    public void flugzeitVerzoegern(int minuten) {
        LocalDateTime zeit = getGeplanteAbflugzeit();
        zeit = zeit.plusMinutes(minuten);
        setGeplanteAbflugzeit(zeit);
    }

    public void astronautAustauschen(String schluesselAlt , String schluesselNeu) {
        //TODO: Map Austausch Astronaut
    }

    public void losfliegen() {
        rakete.setGeschwindigkeit(100);
    }

    public boolean flugbereit() {
        //TODO: nüchtern überprüfen?
        for (Astronaut astro : astronaut) {
            if (!astro.isNuechtern()) {
                return false;
            }
        }

        return bodenstation.isStartrampeSicher() && isWetterOkay() && isFlugbahnOkay() && isKommunikationAufgebaut();
    }

    public boolean isWetterOkay() {
        return wetterOkay;
    }

    public LocalDateTime getGeplanteAbflugzeit() {
        return geplanteAbflugzeit;
    }

    public void setGeplanteAbflugzeit(LocalDateTime geplanteAbflugzeit) {
        this.geplanteAbflugzeit = geplanteAbflugzeit;
    }

    public boolean isKommunikationAufgebaut() {
        return kommunikationAufgebaut;
    }

    public boolean isFlugbahnOkay() {
        return flugbahnOkay;
    }

    public Rakete getRakete() {
        return rakete;
    }

    public void setKommunikationAufgebaut(boolean kommunikationAufgebaut) {
        this.kommunikationAufgebaut = kommunikationAufgebaut;
    }
}
