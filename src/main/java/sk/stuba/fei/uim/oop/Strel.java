package sk.stuba.fei.uim.oop;

import static sk.stuba.fei.uim.oop.utility.KeyboardInput.readInt;

public class Strel extends AkcneKarty {
    @Override
    public void akcia(Hra hra) {
        int vyberkartu = readInt("Ktoru kartu");
        if(vyberkartu > 6){
            System.out.println("error");
        };
        HracieKarty vybranakarta = hra.stol.get(vyberkartu);
        vybranakarta.strel();


    }

    @Override
    public String toString() {
        return "Strel{}";
    }
}