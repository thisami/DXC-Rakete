package dxc.edu;

import java.util.HashMap;
import java.util.Map;

public class Bodenstation {

    private Kontaktperson kontaktperson;
    private boolean kommunikationAufgebaut = false;
    private boolean startrampeSicher = false;
    private boolean flugbahnBerechnet = false;

    private Map<String, Flug> fluege = new HashMap<String, Flug>();

    public void flugbahnBerechnen() {
        System.out.println("Flugbahn wurde berechnet! Sie sind in der DB hinterlegt.");
        this.flugbahnBerechnet = true;
    }

    public void flugStarten(String index) throws NullPointerException {
        Flug flug = fluege.get(index);
        if (kommunikationAufgebaut && startrampeSicher && flugbahnBerechnet) {
            if (flug.getRakete != null) {
                flug.getRakete.motorenStarten();
            } else {
                throw new NullPointerException("Es wurde keine Rakete diesen Flug hinzugefügt.");
            }
        } else {
            System.out.println("Es sind noch nicht alle Vorbereitungen getätigt worden um den Flug zu starten.");
        }

        System.out.println("Der Flug wurde gestartet! Über die Reise wird euch " + kontaktperson.getName() + " betreuen. Viel Spaß im All Kameraden!");
    }

    public void kommunikationAufbauen(String index) {
        Flug flug = fluege.get(index);
        flug.setBodenstation(this);
        this.kommunikationAufgebaut = true;
        System.out.println("Kommunikation zu Flug x wurde aufgebaut.");
    }

    public boolean isKommunikationAufgebaut() {
        return kommunikationAufgebaut;
    }

    public boolean isStartrampeSicher() {
        return startrampeSicher;
    }

    public boolean isFlugbahnBerechnet() {
        return flugbahnBerechnet;
    }

}
