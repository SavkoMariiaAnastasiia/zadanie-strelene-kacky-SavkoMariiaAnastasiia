package sk.stuba.fei.uim.oop.karty.akcna.pohyb;

import sk.stuba.fei.uim.oop.utility.ZKlavesnice;

public class TurboKacka {
    public int vyberturbo;
    public int k2;

    public TurboKacka(){
        System.out.println("Napiste aka kacicka na akom pole ma turbo od 1-6:");
        this.vyberturbo = ZKlavesnice.readInt(" ");
        if (vyberturbo < 1 || vyberturbo > 6) {
            while (vyberturbo > 6 || vyberturbo < 1) {
                System.out.println("To nie je cislo od 1-6:");
                this.vyberturbo = ZKlavesnice.readInt(" ");
            }
        }
    }

    public int getVyberturbo() {
        return vyberturbo;
    }

    public void setK2(int k2) {
        while (vyberturbo == (k2+1)) {
            System.out.println("Toto miesto neni kacka napiste druhe:");
            this.vyberturbo = ZKlavesnice.readInt(" ");
            if (vyberturbo < 1 || vyberturbo > 6) {
                while (vyberturbo > 6 || vyberturbo < 1) {
                    System.out.println("To nie je cislo od 1-6:");
                    this.vyberturbo = ZKlavesnice.readInt(" ");
                }
            }
        }
        this.k2 = k2;
    }
}
