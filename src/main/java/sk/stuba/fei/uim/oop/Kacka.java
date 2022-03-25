package sk.stuba.fei.uim.oop;

public class Kacka extends HracieKarty {
    public static final String	GREEN	= "\u001B[32m";
    public static final String	YELLOW	= "\u001B[33m";
    private final Hrac hrac;

    public Kacka(Hrac i) {
        this.hrac = i;
    }

    @Override
    public String toString() {
        return "Kacka hraca " +
                YELLOW + hrac + GREEN;
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
