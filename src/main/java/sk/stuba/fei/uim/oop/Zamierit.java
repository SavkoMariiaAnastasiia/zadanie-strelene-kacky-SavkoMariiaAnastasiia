package sk.stuba.fei.uim.oop;

import sk.stuba.fei.uim.oop.utility.ZKlavesnice;

import static sk.stuba.fei.uim.oop.utility.KeyboardInput.readInt;

public class Zamierit extends AkcneKarty {

    public Zamierit() {
    }

    @Override
    public void akcia(Hra hra) {
        int vyberkartu = readInt("\u001B[1mNapiste na ake pole ide zamierane od 1-6\u001B[2m");
        if (vyberkartu < 1 || vyberkartu > 6) {
            while (vyberkartu > 6 || vyberkartu < 1) {
                vyberkartu = ZKlavesnice.readInt("\u001B[1mTo nie je cislo od 1-6\u001B[2m");
            }
        }
        if(hra.zamierane.get(vyberkartu-1) =="\u001B[33mZamierane\u001B[32m"){
            while (hra.zamierane.get(vyberkartu-1) =="\u001B[33mZamierane\u001B[32m"){
                vyberkartu = readInt("\u001B[1mTu uz je zamierane\u001B[2m");
                if (vyberkartu < 1 || vyberkartu > 6) {
                    while (vyberkartu > 6 || vyberkartu < 1) {
                        vyberkartu = readInt("To nie je cislo od 1-6");
                    }
                }
            }
        }
        hra.zamierane.set(vyberkartu-1,"\u001B[33mZamierane\u001B[32m");

    }
    @Override
    public String toString() {
        return "Zamierit";
    }
}
