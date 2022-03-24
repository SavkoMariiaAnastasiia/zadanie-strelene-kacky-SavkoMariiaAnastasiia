package sk.stuba.fei.uim.oop;

import sk.stuba.fei.uim.oop.utility.ZKlavesnice;

import static sk.stuba.fei.uim.oop.utility.KeyboardInput.readInt;

public class Strel extends AkcneKarty {
    private int proverka = 0;
    @Override
    public void akcia(Hra hra) {
        int vyberkartu = readInt("\u001B[1mNapiste na ake pole strelat kde je zamierane od 1-6:\u001B[2m");
        for (int i = 0; i < 6; i++) {
            if(hra.zamierane.get(i) == "\u001B[33mZamierane\u001B[32m"){
                proverka++;
            }
        }
        if(proverka==0){
            System.out.println("\u001B[1mZiadne pole neni zamierane mimo!\u001B[2m");
        }else {
            if (vyberkartu < 1 || vyberkartu > 6) {
                while (vyberkartu > 6 || vyberkartu < 1) {
                    vyberkartu = readInt("\u001B[1mTo nie je cislo od 1-6\u001B[2m");
                }
            }
            if (hra.zamierane.get(vyberkartu - 1) != "\u001B[33mZamierane\u001B[32m") {
                while (hra.zamierane.get(vyberkartu - 1) != "\u001B[33mZamierane\u001B[32m") {
                    vyberkartu = ZKlavesnice.readInt("\u001B[1mToto miesto neni zamierane napiste druhe cislo\u001B[2m");
                    if (vyberkartu < 1 || vyberkartu > 6) {
                        while (vyberkartu > 6 || vyberkartu < 1) {
                            vyberkartu = readInt("\u001B[1mTo nie je cislo od 1-6\u001B[2m");
                        }
                    }
                }
            }
            if (hra.zamierane.get(vyberkartu - 1) == "\u001B[33mZamierane\u001B[32m") {
                HracieKarty vybranakarta = hra.stol.get(vyberkartu - 1);
                vybranakarta.strel();
                hra.stol.remove(vybranakarta);
                HracieKarty novakarta = hra.hraciekarty.remove(0);
                hra.stol.add(novakarta);
                hra.zamierane.set(vyberkartu - 1, "\u001B[33mNezamierane\u001B[32m");
            }
        }
    }

    @Override
    public String toString() {
        return "Strel";
    }
}
