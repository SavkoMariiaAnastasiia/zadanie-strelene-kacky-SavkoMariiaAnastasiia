package sk.stuba.fei.uim.oop;

public class KacaciPochod extends AkcneKarty {
    @Override
    public void akcia(Hra hra) {
        HracieKarty prva = hra.stol.remove(0);
        hra.hraciekarty.add(prva);

        HracieKarty novakarta = hra.hraciekarty.remove(0);
        hra.stol.add(novakarta);

    }
    @Override
    public String toString() {
        return "KacaciPochod";
    }
}
