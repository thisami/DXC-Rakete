package dxc.edu;

import java.util.HashMap;
import java.util.Map;

public class Daten {

    public static Map<String, Rakete> raketen = new HashMap<>();

    static {
        raketen.put("tilosRakete", new Rakete("Tilos Rakete", "Blau", "Kowalski Indsturies", 8));
        raketen.put("rubensRakete", new Rakete("Rubens Rakete", "Rot", "Schneewittchen Industries", 7));
    }

}
