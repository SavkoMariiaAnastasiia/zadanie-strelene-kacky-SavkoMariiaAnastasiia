package sk.stuba.fei.uim.oop.proverka;

import sk.stuba.fei.uim.oop.karty.akcna.ZoomAkcna;
import sk.stuba.fei.uim.oop.karty.akcna.pohyb.TurboKacka;
import sk.stuba.fei.uim.oop.utility.ZKlavesnice;

public class Proverka {
    public int vyber;
    public String vyber1;
    public int vyber11;
    public int vyberzoom1;
    public Proverka(){
        vyberzoom1 =-1;
    }


    public int getVyber() {
        return vyber;
    }

    public void setVyber(int vyber) {
        if (vyber<1 || vyber>3){
            while (vyber>3 || vyber<1) {
                System.out.println("To nie je cislo od 1-3:");
                vyber = ZKlavesnice.readInt(" ");
            }
        }else {
            System.out.println();
            this.vyber = vyber;

        }
    }

    public void setVyber1(String vyber1) {
        if (vyber1=="TurboKacka"){
            this.vyber11 = 0;
            TurboKacka turboKacka = new TurboKacka();
        }
        if (vyber1=="KacaciTanec"){
            this.vyber11 = 0;
            TurboKacka turboKacka = new TurboKacka();
        }
        if (vyber1=="Rosambo"){
            this.vyber11 = 0;
            TurboKacka turboKacka = new TurboKacka();
        }
        if (vyber1=="DivokyBill"){
            this.vyber11 = 0;
            TurboKacka turboKacka = new TurboKacka();
        }
        if (vyber1=="KacaciPohod"){
            this.vyber11 = 0;
            TurboKacka turboKacka = new TurboKacka();
        }
        if (vyber1=="ZoomAkcna"){
            this.vyber11 = 6;
        }
        if (vyber1=="Strelat"){
            this.vyber11 = 0;
            TurboKacka turboKacka = new TurboKacka();
        }

    }

    public int getVyber1() {
        return vyber11;
    }
}
