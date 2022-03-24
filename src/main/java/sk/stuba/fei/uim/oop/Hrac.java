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
    }//-------------need-urobit-pre pripad ak hracov >6 a turbokacka neni na vodu_______________ada pre cvet

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
        System.out.println("\u001B[33m///////////////////////////////\u001B[32m" +
                "\n"+"Hrac '" + this.meno +"' ma "+zivoty+" kacicek a tieto karty:");
        int i = 0;
        for (AkcneKarty karta:this.karty
             ) {
            i++;
            System.out.println("\u001B[33m"+i+". \u001B[32m"+karta);

        }
    }
}
