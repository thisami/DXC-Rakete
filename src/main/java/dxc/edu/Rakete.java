package dxc.edu;

public class Rakete {


    private double treibstoffZustand;
    private String farbe;
    private String name;
    private int personenKapazitaet;
    private String hersteller;
    private boolean nuklearAntrieb = false;
    private int geschwindigkeit = 0;
    private boolean motorenLaufen = false;

    public void  motorenStarten(){
        motorenLaufen = true;
    }
}
