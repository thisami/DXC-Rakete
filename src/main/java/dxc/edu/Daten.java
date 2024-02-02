package dxc.edu;

import java.util.HashMap;
import java.util.Map;

public class Daten {

    public static Bodenstation bodenstation = new Bodenstation();

    public static Map<String, Astronaut> astronauten = new HashMap<>();

    public static Map<String, Flug> fluege = new HashMap<>();

    static {
        Rakete tilosRakete = new Rakete("Tilos Rakete", "Blau", "Kowalski Indsturies", 8);
        Rakete rubensRakete = new Rakete("Rubens Rakete", "Rot", "Schneewittchen Industries", 7);

        Flug tilosFlug = new Flug(tilosRakete);

        Astronaut tilo = new Astronaut("Tilo", "So ein Eierkopp", false, Erfahrung.ANFAENGER, "Wo ist mein Gehstock?", "Altenheim Limburg");
        tilosFlug.addAstronaut(tilo);

        Flug rubensFlug = new Flug(rubensRakete);

        Astronaut ruben = new Astronaut("Ruben", "Sauber!", true, Erfahrung.PROFI, "Worum gings gerade?", "Väter unter sich");
        rubensFlug.addAstronaut(ruben);
    }

}
