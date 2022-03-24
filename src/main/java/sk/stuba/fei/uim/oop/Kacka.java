package sk.stuba.fei.uim.oop;

public class Kacka extends HracieKarty {
    private final Hrac hrac;

    public Kacka(Hrac i) {
        this.hrac = i;
    }

    @Override
    public String toString() {
        return "Kacka hraca " +
                " \u001B[33m" + hrac+"\u001B[32m";
    }

    @Override
    public void strel() {
        this.hrac.strel();
    }

    @Override
    public void divokybill() {
        this.hrac.divokybill();
    }
}
