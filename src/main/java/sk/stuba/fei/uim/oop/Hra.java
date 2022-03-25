package sk.stuba.fei.uim.oop;

import sk.stuba.fei.uim.oop.*;
import sk.stuba.fei.uim.oop.Strel;

import java.util.ArrayList;
import java.util.Collections;

import static sk.stuba.fei.uim.oop.utility.KeyboardInput.readInt;
import static sk.stuba.fei.uim.oop.utility.KeyboardInput.readString;


public class Hra {
    public static final String	GREEN	= "\u001B[32m";
    public static final String	YELLOW	= "\u001B[33m";

    private int pocethracov;
    ArrayList<Hrac> hraci = new ArrayList<>();
    ArrayList<AkcneKarty> akcnekarty = new ArrayList<AkcneKarty>();
    ArrayList<HracieKarty> hraciekarty = new ArrayList<HracieKarty>();
    ArrayList<HracieKarty> stol = new ArrayList<>();
    ArrayList<String> zamierane = new ArrayList<String>();

    public Hra(int pocethracov) {
        this.pocethracov = pocethracov;

        for (int i = 0; i < this.pocethracov; i++) {
            this.hraci.add(new Hrac(readString(GREEN + "Zadaj meno")));

        }

        for (Hrac i: this.hraci
             ) {
            for (int j = 0; j < i.getZivoty(); j++) {
                this.hraciekarty.add(new Kacka(i));
            }
        }

        for (int i = 0; i < 5; i++) {
            this.hraciekarty.add(new Voda());
        }

        for (int i = 0; i < 2; i++) {
            this.akcnekarty.add(new DivokyBill());
        }
        for (int i = 0; i < 2; i++) {
            this.akcnekarty.add(new Rosambo());
        }
        for (int i = 0; i < 6; i++) {
            this.akcnekarty.add(new KacaciPochod());
        }
        for (int i = 0; i < 12; i++) {
            this.akcnekarty.add(new Strel());
        }
        for (int i = 0; i < 10; i++) {
            this.akcnekarty.add(new Zamierit());
        }
        this.akcnekarty.add(new TurboKacka());
        this.akcnekarty.add(new KackaciTanec());

        Collections.shuffle(this.akcnekarty);
        Collections.shuffle(this.hraciekarty);

        for (int i = 0; i < 6; i++) {
            HracieKarty karta = this.hraciekarty.remove(0);
            this.stol.add(karta);

        }
        for (Hrac i :this.hraci) {
            for (int j = 0; j < 3; j++) {
                AkcneKarty karta = this.akcnekarty.remove(0);
                i.dajKartu(karta);
            }
        }
        this.cyklus();
        }


    public void printStol() {
        System.out.println(YELLOW + "///////////////////////////////\n"+GREEN+"Na stole karty:");
        for (int i = 0; i < 6; i++) {
            this.zamierane.add("Nezamierane");
        }
        for (int i=0;i < 6;i++){
            System.out.println(YELLOW+(i+1)+". "+GREEN+this.zamierane.get(i)+" "+ this.stol.get(i));
        }
    }

    public void cyklus(){
        int kolkohracov = 0;
        for (Hrac i:this.hraci
             ) {
            if (i.getZivoty() > 0){
                kolkohracov++;
            }
        }
        while (kolkohracov>1){
            int kolkohracov1 = 0;
            for (Hrac i:this.hraci
            ) {
                if (i.getZivoty() > 0){
                    kolkohracov1++;
                }
            }
            if (kolkohracov1 == 1){
                break;
            }
            for (Hrac aktivnyhrac: this.hraci
                 ) {
                if(aktivnyhrac.getZivoty()>0){
                    this.printStol();
                    aktivnyhrac.printKarty();
                    int vyberkartu = readInt("Ktoru kartu");
                    if(vyberkartu > 4){
                        System.out.println("error");
                    }
                    AkcneKarty vybrata = aktivnyhrac.vyberKartu(vyberkartu-1);
                    vybrata.akcia(this);
                    this.akcnekarty.add(vybrata);
                    aktivnyhrac.dajKartu(akcnekarty.remove(0));
                }
            }
        }
        int i1 = 0;
        for (Hrac i:this.hraci
        ) {
            if (i.getZivoty() > 0){
                System.out.println(YELLOW+"Hrac "+hraci.get(i1)+" Vyhral!!!");
                break;
            }
            i1++;
        }
    }
}


