package sk.stuba.fei.uim.oop;

import java.util.ArrayList;

public class Hrac {
    private ArrayList<AkcneKarty> karty = new ArrayList<>();
    private String meno;
    private int zivoty;

    public Hrac(String meno) {
        this.meno = meno;
        this.zivoty = 5;
    }

    public int getZivoty() {
        return this.zivoty;
    }

    @Override
    public String toString() {
        return "Hrac{" +
                ", meno='" + meno + '\'' +
                ", zivoty=" + zivoty +
                '}';
    }

    public void strel() {
        this.zivoty--;
    }

    public void dajKartu(AkcneKarty karta) {
        this.karty.add(karta);
    }

    public AkcneKarty vyberKartu(int ktora) {
        return this.karty.remove(ktora);

    }

    public void printKarty() {
        System.out.println("--------------------\n" + this.meno + " karty:");
        for (AkcneKarty karta:this.karty
             ) {
            System.out.println(karta);

        }
    }
}
