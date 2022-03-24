package sk.stuba.fei.uim.oop;

import static sk.stuba.fei.uim.oop.utility.KeyboardInput.readInt;

public class Zamierit extends AkcneKarty {

    public Zamierit() {
    }

    @Override
    public void akcia(Hra hra) {
        int vyberkartu = readInt("Ktoru kartu");
        if(vyberkartu > 6){
            System.out.println("error");
        }
        hra.zamierane.set(vyberkartu,"Zamierane");

    }
    @Override
    public String toString() {
        return "Zamierit";
    }
}
