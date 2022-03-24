package sk.stuba.fei.uim.oop;

import sk.stuba.fei.uim.oop.utility.ZKlavesnice;

import static sk.stuba.fei.uim.oop.utility.KeyboardInput.readInt;

public class Zamierit extends AkcneKarty {

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
        if(hra.zamierane.get(vyberkartu) =="Zamierane"){
            while (hra.zamierane.get(vyberkartu) =="Zamierane"){
                vyberkartu = readInt("Tu uz je zoom");
                if (vyberkartu < 1 || vyberkartu > 6) {
                    while (vyberkartu > 6 || vyberkartu < 1) {
                        vyberkartu = readInt("To nie je cislo od 1-6");
                    }
                }
            }
        }
        hra.zamierane.set(vyberkartu,"Zamierane");

    }
    @Override
    public String toString() {
        return "Zamierit";
    }
}
