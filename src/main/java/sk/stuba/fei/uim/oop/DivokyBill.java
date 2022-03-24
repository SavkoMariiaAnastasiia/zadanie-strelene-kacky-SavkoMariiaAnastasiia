package sk.stuba.fei.uim.oop;

import sk.stuba.fei.uim.oop.AkcneKarty;
import sk.stuba.fei.uim.oop.Hra;
import sk.stuba.fei.uim.oop.HracieKarty;
import sk.stuba.fei.uim.oop.utility.ZKlavesnice;

import static sk.stuba.fei.uim.oop.utility.KeyboardInput.readInt;

public class DivokyBill extends AkcneKarty {
    @Override
    public void akcia(Hra hra) {
        int vyberkartu = readInt("\u001B[1mNapiste na ake pole strelat Bill od 1-6:\u001B[2m");
        if (vyberkartu < 1 || vyberkartu > 6) {
            while (vyberkartu > 6 || vyberkartu < 1) {
                System.out.println("\u001B[1mTo nie je cislo od 1-6:\u001B[2m");
                vyberkartu = ZKlavesnice.readInt(" ");
            }
        }
        HracieKarty vybranakarta = hra.stol.get(vyberkartu-1);
        vybranakarta.strel();
        hra.stol.remove(vybranakarta);
        HracieKarty novakarta = hra.hraciekarty.remove(0);
        hra.stol.add(novakarta);

    }

    @Override
    public String toString() {
        return "DivokyBill";
    }
}
