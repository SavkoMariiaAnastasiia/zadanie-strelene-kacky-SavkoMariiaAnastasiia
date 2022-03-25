package sk.stuba.fei.uim.oop;

import sk.stuba.fei.uim.oop.utility.ZKlavesnice;

import static sk.stuba.fei.uim.oop.utility.KeyboardInput.readInt;

public class Strel extends AkcneKarty {
    public static final String	GREEN	= "\u001B[32m";
    public static final String	YELLOW	= "\u001B[33m";
    private int proverka = 0;
    @Override
    public void akcia(Hra hra) {
        int vyberkartu = readInt("Napiste na ake pole strelat kde je zamierane od 1-6:");
        for (int i = 0; i < 6; i++) {
            if(hra.zamierane.get(i) == YELLOW+"Zamierane"+GREEN){
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
            if (hra.zamierane.get(vyberkartu - 1) != YELLOW+"Zamierane"+GREEN) {
                while (hra.zamierane.get(vyberkartu - 1) != YELLOW+"Zamierane"+GREEN) {
                    vyberkartu = ZKlavesnice.readInt("Toto miesto neni zamierane napiste druhe cislo");
                    if (vyberkartu < 1 || vyberkartu > 6) {
                        while (vyberkartu > 6 || vyberkartu < 1) {
                            vyberkartu = readInt("To nie je cislo od 1-6");
                        }
                    }
                }
            }
            if (hra.zamierane.get(vyberkartu - 1) == YELLOW+"Zamierane"+GREEN) {
                HracieKarty vybranakarta = hra.stol.get(vyberkartu - 1);
                vybranakarta.strel();
                if( hra.stol.get(vyberkartu - 1).toString().equals("Voda") ){
                    hra.hraciekarty.add(new Voda());
                }
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
