package sk.stuba.fei.uim.oop;

import static sk.stuba.fei.uim.oop.utility.KeyboardInput.readInt;

public class Zamierit extends AkcneKarty {

    @Override
    public void akcia(Hra hra) {
        int vyberkartu = readInt("Ktoru kartu");
        if(vyberkartu > 6){
            System.out.println("error");
        }
        for (int i = 0; i < 6; i++) {
            hra.zamierane.add("Nezamierane");
        }
        HracieKarty karta = hra.stol.remove(vyberkartu);
        hra.stol.add(0,karta);

    }
    @Override
    public String toString() {
        return "Zamierit";
    }
}
