package sk.stuba.fei.uim.oop.karty.akcna;

import sk.stuba.fei.uim.oop.utility.ZKlavesnice;

public class Strelat {
    public int vyberstrelat;
    public int k1;

    public Strelat(){
        System.out.println("Napiste na ake pole strelat kde je zamierane od 1-6:");
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

    public void setK1(int k1) {
        while (vyberstrelat == (k1+1)) {
            System.out.println("Toto miesto neni zamierane napiste druhe cislo:");
            this.vyberstrelat = ZKlavesnice.readInt(" ");
            if (vyberstrelat < 1 || vyberstrelat > 6) {
                while (vyberstrelat > 6 || vyberstrelat < 1) {
                    System.out.println("To nie je cislo od 1-6:");
                    this.vyberstrelat = ZKlavesnice.readInt(" ");
                }
            }
        }
        this.k1 = k1;
    }
}
