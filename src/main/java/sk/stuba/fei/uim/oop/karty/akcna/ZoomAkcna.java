package sk.stuba.fei.uim.oop.karty.akcna;

import sk.stuba.fei.uim.oop.strelaneKackyHra.StrelaneKackyHra;
import sk.stuba.fei.uim.oop.utility.ZKlavesnice;

public class ZoomAkcna {

    public int vyberzoom;
    private int i;
    public int k;


    public ZoomAkcna(){
        System.out.println("Napiste na ake pole ide zoom od 1-6:");
        this.vyberzoom = ZKlavesnice.readInt(" ");
            if (vyberzoom < 1 || vyberzoom > 6) {
                while (vyberzoom > 6 || vyberzoom < 1) {
                    System.out.println("To nie je cislo od 1-6:");
                    this.vyberzoom = ZKlavesnice.readInt(" ");
                }
            }
        }
    public int getVyberzoom() {
        return vyberzoom;
    }

    public void setK(int k) {
    while (vyberzoom == (k+1)) {
        System.out.println("Tu uz je zoom:");
        this.vyberzoom = ZKlavesnice.readInt(" ");
        if (vyberzoom < 1 || vyberzoom > 6) {
            while (vyberzoom > 6 || vyberzoom < 1) {
                System.out.println("To nie je cislo od 1-6:");
                this.vyberzoom = ZKlavesnice.readInt(" ");
            }
        }
    }
      this.k = k;
    }
}
