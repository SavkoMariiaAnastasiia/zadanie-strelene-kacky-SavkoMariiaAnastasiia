package sk.stuba.fei.uim.oop;

import java.util.ArrayList;
import java.util.Collections;

import static sk.stuba.fei.uim.oop.utility.KeyboardInput.readInt;
import static sk.stuba.fei.uim.oop.utility.KeyboardInput.readString;

public class Hra {
    private int pocethracov;
    ArrayList<Hrac> hraci = new ArrayList<>();
    ArrayList<AkcneKarty> akcnekarty = new ArrayList<AkcneKarty>(); //vsetky akcne
    ArrayList<HracieKarty> hraciekarty = new ArrayList<HracieKarty>(); //vsetky kacky a voda
    ArrayList<HracieKarty> stol = new ArrayList<>(); //iba 6 na stole

    public Hra(int pocethracov) {
        this.pocethracov = pocethracov;

        for (int i = 0; i < this.pocethracov; i++) { //pridavam hracov do hry
            this.hraci.add(new Hrac(readString("Zadaj meno")));

        }

        for (Hrac i: this.hraci //pre kazdy hrac
             ) {
            for (int j = 0; j < i.getZivoty(); j++) {
                this.hraciekarty.add(new Kacka(i)); //prida do balicka kaciek kacky
            }
        }

        for (int i = 0; i < 5; i++) {
            this.hraciekarty.add(new Voda()); //prida 5 vody
        }

        //-------------------------------- //spravime balik akcnych karet
        for (int i = 0; i < 2; i++) {
            this.akcnekarty.add(new Rosambo());
        }
        for (int i = 0; i < 6; i++) {
            this.akcnekarty.add(new KacaciPochod());
        }
        for (int i = 0; i < 12; i++) {
            this.akcnekarty.add(new Strel());
        }
        this.akcnekarty.add(new TurboKacka());
        this.akcnekarty.add(new KackaciTanec());
        //--------------------------------

        Collections.shuffle(this.akcnekarty);
        Collections.shuffle(this.hraciekarty); //pomiesa kacky a vody

        for (int i = 0; i < 6; i++) { //vylozi kacky na stol
            HracieKarty karta = this.hraciekarty.remove(0);
            this.stol.add(karta);

        }

        for (Hrac i :this.hraci) { //da hracom karty
            for (int j = 0; j < 3; j++) {
                AkcneKarty karta = this.akcnekarty.remove(0);
                i.dajKartu(karta);
            }
        }
        this.cyklus(); //zacne hru
        }


    public void printStol() {
        System.out.println("--------------------------\nNa stole karty:");
        for (HracieKarty i :
                this.stol) {
            System.out.println(i);


        }
    }

    public void cyklus(){
        int kolkohracov = 0; //spocitame kolko hracov zije
        for (Hrac i:this.hraci //prejde kazdym hracom
             ) {
            if (i.getZivoty() > 0){ //pozre ci zije
                kolkohracov++;
            }
        }
        while (kolkohracov>1){ //ak viac nez 1 hrac zije
            for (Hrac aktivnyhrac: this.hraci //hrame kazdym hracom
                 ) {
                if(aktivnyhrac.getZivoty()>0){ //iba ten hrac moze hrat ktory ma viac nez 1 kacku
                    this.printStol(); //ukazeme karty na stole
                    aktivnyhrac.printKarty();
                    int vyberkartu = readInt("Ktoru kartu"); //vyberie kartu
                    if(vyberkartu > 3){
                        System.out.println("error");
                    };
                    AkcneKarty vybrata = aktivnyhrac.vyberKartu(vyberkartu); //zoberieme kartu z ruky
                    vybrata.akcia(this); //karta sa aktivuje
                    this.akcnekarty.add(vybrata); //vratime do balika kartu
                    aktivnyhrac.dajKartu(akcnekarty.remove(0)); //dame hracovi novu kartu
                }

            }
        }
    }
}

