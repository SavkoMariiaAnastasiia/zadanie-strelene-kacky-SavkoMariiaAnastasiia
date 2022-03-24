package sk.stuba.fei.uim.oop;

import sk.stuba.fei.uim.oop.utility.ZKlavesnice;

import static sk.stuba.fei.uim.oop.utility.KeyboardInput.readInt;

public class TurboKacka extends AkcneKarty {
    @Override
    public void akcia(Hra hra) {
        int vyberkartu = readInt("\u001B[1mNapiste aka kacicka na akom pole ma turbo od 1-6:\u001B[2m");
        if (vyberkartu < 1 || vyberkartu > 6) {
            while (vyberkartu > 6 || vyberkartu < 1) {
                System.out.println("\u001B[1mTo nie je cislo od 1-6:\u001B[2m");
                vyberkartu = ZKlavesnice.readInt(" ");
            }
        }
        HracieKarty karta = hra.stol.remove(vyberkartu-1);
        hra.stol.add(0,karta);

    }

    @Override
    public String toString() {
        return "TurboKacka";
    }
}
