package sk.stuba.fei.uim.oop;

import sk.stuba.fei.uim.oop.utility.ZKlavesnice;

import static sk.stuba.fei.uim.oop.utility.KeyboardInput.readInt;

public class Zamierit extends AkcneKarty {
    public static final String	GREEN	= "\u001B[32m";
    public static final String	YELLOW	= "\u001B[33m";

    public Zamierit() {

    }

    @Override
    public void akcia(Hra hra) {
        int vyberkartu = readInt("Napiste na ake pole ide zamierane od 1-6");
        if (vyberkartu < 1 || vyberkartu > 6) {
            while (vyberkartu > 6 || vyberkartu < 1) {
                vyberkartu = ZKlavesnice.readInt("To nie je cislo od 1-6");
            }
        }
        if(hra.zamierane.get(vyberkartu-1) ==YELLOW+"Zamierane"+GREEN){
            while (hra.zamierane.get(vyberkartu-1) ==YELLOW+"Zamierane"+GREEN){
                vyberkartu = readInt("Tu uz je zamierane");
                if (vyberkartu < 1 || vyberkartu > 6) {
                    while (vyberkartu > 6 || vyberkartu < 1) {
                        vyberkartu = readInt("To nie je cislo od 1-6");
                    }
                }
            }
        }
        hra.zamierane.set(vyberkartu-1,YELLOW+"Zamierane"+GREEN);

    }
    @Override
    public String toString() {
        return "Zamierit";
    }
}
