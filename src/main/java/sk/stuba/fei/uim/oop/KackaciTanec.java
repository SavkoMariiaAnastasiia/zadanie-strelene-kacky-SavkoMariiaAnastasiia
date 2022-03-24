package sk.stuba.fei.uim.oop;

public class KackaciTanec extends AkcneKarty {
    @Override
    public void akcia(Hra hra) {
        for (int i = 0; i < 6; i++) {
            HracieKarty karta = hra.stol.remove(0); //vyberieme z stol
            hra.hraciekarty.add(karta); //dame do balika

            HracieKarty novakarta = hra.hraciekarty.remove(0); //vyberieme z balika
            hra.stol.add(novakarta); //dame na stol
        }

    }

    @Override
    public String toString() {
        return "KackaciTanec{}";
    }
}


