package sk.stuba.fei.uim.oop;

import static sk.stuba.fei.uim.oop.utility.KeyboardInput.readInt;

public class TurboKacka extends AkcneKarty {
    @Override
    public void akcia(Hra hra) {
        int vyberkartu = readInt("Ktoru kartu");
        if(vyberkartu > 6){
            System.out.println("error");
        };
        HracieKarty karta = hra.stol.remove(vyberkartu);
        hra.stol.add(0,karta);

    }

    @Override
    public String toString() {
        return "TurboKacka{}";
    }
}
