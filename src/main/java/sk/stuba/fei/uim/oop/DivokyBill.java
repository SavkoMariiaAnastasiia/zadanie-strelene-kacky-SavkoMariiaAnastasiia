package sk.stuba.fei.uim.oop;

import sk.stuba.fei.uim.oop.AkcneKarty;
import sk.stuba.fei.uim.oop.Hra;
import sk.stuba.fei.uim.oop.HracieKarty;

import static sk.stuba.fei.uim.oop.utility.KeyboardInput.readInt;

public class DivokyBill extends AkcneKarty {
    @Override
    public void akcia(Hra hra) {
        int vyberkartu = readInt("Ktoru kartu");
        if(vyberkartu > 6){
            System.out.println("error");
        };
        HracieKarty vybranakarta = hra.stol.get(vyberkartu);
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
