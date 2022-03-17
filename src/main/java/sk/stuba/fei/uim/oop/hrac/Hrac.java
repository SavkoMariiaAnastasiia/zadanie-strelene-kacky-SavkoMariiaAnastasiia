package sk.stuba.fei.uim.oop.hrac;

//import java.util.ArrayList;
//import java.util.List;
//import java.util.Random;
//import java.util.Scanner;
//import sk.stuba.fei.uim.oop.pole.Pole;
import sk.stuba.fei.uim.oop.utility.ZKlavesnice;

public class Hrac {
    private int hraci;
    public Hrac( ) {
        System.out.println("Napiste pocet hracov od 2 do 6:");
    }

    public int getHraci() {
        return hraci;
    }

    public void setHraci(int hraci) {
        if((hraci<=6) && (hraci>=2)) {
            this.hraci = hraci;
        }else {
            while ((hraci>6) || (hraci<2)) {
                System.out.println("Pocet htacov je vecse ak 6 alebo mense ak 2\n");
                hraci = ZKlavesnice.readInt(" ");
                this.hraci = hraci;
            }
        }
    }

}

