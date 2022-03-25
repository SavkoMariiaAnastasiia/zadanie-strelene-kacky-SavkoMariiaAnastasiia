package sk.stuba.fei.uim.oop;

import java.util.ArrayList;

public class Hrac {
    public static final String	GREEN	= "\u001B[32m";
    public static final String	YELLOW	= "\u001B[33m";

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
        return " " + meno;
    }

    public void strel() {
        this.zivoty--;
    }
    public void divokybill() {
        this.zivoty--;
    }

    public void dajKartu(AkcneKarty karta) {
        this.karty.add(karta);
    }

    public AkcneKarty vyberKartu(int ktora) {
        return this.karty.remove(ktora);

    }

    public void printKarty() {
        System.out.println(YELLOW+"///////////////////////////////"+GREEN +
                "\n"+"Hrac " +YELLOW+ this.meno +GREEN+" ma "+YELLOW+zivoty+GREEN+" kacicek a tieto karty:");
        int i = 0;
        for (AkcneKarty karta:this.karty
             ) {
            i++;
            System.out.println(YELLOW+i+". "+GREEN+karta);

        }
    }
}
