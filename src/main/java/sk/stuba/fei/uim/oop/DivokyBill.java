package sk.stuba.fei.uim.oop;

import sk.stuba.fei.uim.oop.utility.ZKlavesnice;

import static sk.stuba.fei.uim.oop.utility.KeyboardInput.readInt;

public class DivokyBill extends AkcneKarty {
    @Override
    public void akcia(Hra hra) {
        int vyberkartu = readInt("Napiste na ake pole strelat Bill od 1-6:");
        if (vyberkartu < 1 || vyberkartu > 6) {
            while (vyberkartu > 6 || vyberkartu < 1) {
                System.out.println("To nie je cislo od 1-6:");
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
