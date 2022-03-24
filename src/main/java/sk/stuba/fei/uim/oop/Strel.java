package sk.stuba.fei.uim.oop;

import sk.stuba.fei.uim.oop.utility.ZKlavesnice;

import static sk.stuba.fei.uim.oop.utility.KeyboardInput.readInt;

public class Strel extends AkcneKarty {
    private int proverka = 0;
    @Override
    public void akcia(Hra hra) {
        int vyberkartu = readInt("Ktoru kartu");
        for (int i = 0; i < 6; i++) {
            if(hra.zamierane.get(i) == "Zamierane"){
                proverka++;
            }
        }
        if(proverka==0){
            System.out.println("Ziadne pole neni zamierane mimo!");
        }else {
            if (vyberkartu < 1 || vyberkartu > 6) {
                while (vyberkartu > 6 || vyberkartu < 1) {
                    vyberkartu = readInt("To nie je cislo od 1-6");
                }
            }
            if (hra.zamierane.get(vyberkartu - 1) != "Zamierane") {
                while (hra.zamierane.get(vyberkartu - 1) != "Zamierane") {
                    vyberkartu = ZKlavesnice.readInt("Toto miesto neni zamierane napiste druhe cislo");
                    if (vyberkartu < 1 || vyberkartu > 6) {
                        while (vyberkartu > 6 || vyberkartu < 1) {
                            vyberkartu = readInt("To nie je cislo od 1-6");
                        }
                    }
                }
            }
            if (hra.zamierane.get(vyberkartu - 1) == "Zamierane") {
                HracieKarty vybranakarta = hra.stol.get(vyberkartu - 1);
                vybranakarta.strel();
                hra.stol.remove(vybranakarta);
                HracieKarty novakarta = hra.hraciekarty.remove(0);
                hra.stol.add(novakarta);
                hra.zamierane.set(vyberkartu - 1, "Nezamierane");
            }
        }
    }

    @Override
    public String toString() {
        return "Strel";
    }
}
