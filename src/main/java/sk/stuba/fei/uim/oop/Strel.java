package sk.stuba.fei.uim.oop;

import sk.stuba.fei.uim.oop.utility.ZKlavesnice;

import static sk.stuba.fei.uim.oop.utility.KeyboardInput.readInt;

public class Strel extends AkcneKarty {
    @Override
    public void akcia(Hra hra) {
        int vyberkartu = readInt("Ktoru kartu");
        if (vyberkartu < 1 || vyberkartu > 6) {
            while (vyberkartu > 6 || vyberkartu < 1) {
                vyberkartu = readInt("To nie je cislo od 1-6");
            }
        }
        if(hra.zamierane.get(vyberkartu) =="Zamierane") {
            HracieKarty vybranakarta = hra.stol.get(vyberkartu);
            vybranakarta.strel();
            hra.stol.remove(vybranakarta);
            HracieKarty novakarta = hra.hraciekarty.remove(0);
            hra.stol.add(novakarta);
        }else {
            while (hra.zamierane.get(vyberkartu) !="Zamierane") {
                vyberkartu = ZKlavesnice.readInt("Toto miesto neni zamierane napiste druhe cislo");
                if (vyberkartu < 1 || vyberkartu > 6) {
                    while (vyberkartu > 6 || vyberkartu < 1) {
                        vyberkartu = readInt("To nie je cislo od 1-6");
                    }
                }
            }
        }
        hra.zamierane.set(vyberkartu,"Nezamierane");
    }

    @Override
    public String toString() {
        return "Strel";
    }
}
