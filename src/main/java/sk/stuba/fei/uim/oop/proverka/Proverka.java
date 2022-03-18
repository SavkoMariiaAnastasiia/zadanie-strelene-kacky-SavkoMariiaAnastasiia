package sk.stuba.fei.uim.oop.proverka;

import sk.stuba.fei.uim.oop.karty.akcna.pohyb.TurboKacka;
import sk.stuba.fei.uim.oop.utility.ZKlavesnice;

public class Proverka {
    public int vyber;
    public String vyber1;

    public void setVyber(int vyber) {
        if (vyber<1 || vyber>3){
            while (vyber>3 || vyber<1) {
                System.out.println("To nie je cislo od 1-3:");
                vyber = ZKlavesnice.readInt(" ");
                this.vyber = vyber;
            }
        }else {
            this.vyber = vyber;

        }
    }

    public String getVyber1() {
        return vyber1;
    }

    public void setVyber1(String vyber1) {
        if (vyber1=="TurboKacka"){
            TurboKacka turboKacka = new TurboKacka();
        }
        if (vyber1=="KacaciTanec"){
            TurboKacka turboKacka = new TurboKacka();
        }
        if (vyber1=="Rosambo"){
            TurboKacka turboKacka = new TurboKacka();
        }
        if (vyber1=="DivokyBill"){
            TurboKacka turboKacka = new TurboKacka();
        }
        if (vyber1=="KacaciPohod"){
            TurboKacka turboKacka = new TurboKacka();
        }
        if (vyber1=="ZoomAkcna"){
            TurboKacka turboKacka = new TurboKacka();
        }
        if (vyber1=="Strelat"){
            TurboKacka turboKacka = new TurboKacka();
        }
        this.vyber1 = vyber1;
    }
}
