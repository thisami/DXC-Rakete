package dxc.edu;

import java.util.HashMap;
import java.util.Map;

public class Daten {

    public static Bodenstation bodenstation = new Bodenstation();

    public static Map<String, Astronaut> astronauten = new HashMap<>();

    public static Map<String, Flug> fluege = new HashMap<>();

    static {
        Astronaut tilo = new Astronaut("Tilo", "So ein Eierkopp", Erfahrung.PROFI, "Wo ist mein Gehstock?", "Altenheim Limburg");
        Astronaut ruben = new Astronaut("Ruben", "Sauber!", Erfahrung.ANFAENGER, "Worum gings gerade?", "Väter unter sich");

        Rakete tilosRakete = new Rakete("Tilos Rakete", "Blau", "Kowalski Indsturies", 8);
        Rakete rubensRakete = new Rakete("Rubens Rakete", "Rot", "Schneewittchen Industries", 7);

        Flug tilosFlug = new Flug(tilosRakete);
        Flug rubensFlug = new Flug(rubensRakete);

        astronauten.put("tilo", tilo);
        astronauten.put("ruben", ruben);

        tilosFlug.getAstronauten().add(astronauten.get("tilo"));
        rubensFlug.getAstronauten().add(astronauten.get("ruben"));

        fluege.put("tilosFlug", tilosFlug);
        fluege.put("rubensFlug", rubensFlug);
    }

}
