package sk.stuba.fei.uim.oop.karty.akcna;

import sk.stuba.fei.uim.oop.utility.ZKlavesnice;

public class DivokyBill {
    public int vyberstrelat;
    public int k1;

    public DivokyBill(){
        System.out.println("Napiste na ake pole strelat Bill od 1-6:");
        this.vyberstrelat = ZKlavesnice.readInt(" ");
        if (vyberstrelat < 1 || vyberstrelat > 6) {
            while (vyberstrelat > 6 || vyberstrelat < 1) {
                System.out.println("To nie je cislo od 1-6:");
                this.vyberstrelat = ZKlavesnice.readInt(" ");
            }
        }
    }
    public int getVyberstrelat() {
        return vyberstrelat;
    }

}
