package sk.stuba.fei.uim.oop.strelaneKackyHra;


//import sk.stuba.fei.uim.oop.utility.KeyboardInput;
//import java.util.List;
import sk.stuba.fei.uim.oop.hrac.Hrac;
import sk.stuba.fei.uim.oop.karty.akcna.Strelat;
import sk.stuba.fei.uim.oop.karty.akcna.Zamierit;
import sk.stuba.fei.uim.oop.proverka.Proverka;
import sk.stuba.fei.uim.oop.utility.ZKlavesnice;

import java.util.Random;


public class StrelaneKackyHra {
    Random random = new Random();
    public int pocethracov;
    public int h;
    public int randomcisloprehracov;
    public int akcna;
    public int vyberzoom = -1;
    public int vyberstrelat;
    private int i;
    private int kackyhraca1;
    private int kackyhraca2;
    private int kackyhraca3;
    private int kackyhraca4;
    private int kackyhraca5;
    private int kackyhraca6;//-------------
    private int pocetkart;//pre random
    private int pocetkart1;//pre pole
    public int randomcislo;
    public int vyber;
    public String vyber1;
    String[] Zoom = new String[6];
    String[] RybnikPreRandom = new String[7];//rybnik 6 poli
    String[] RandomPreKarty = new String[35];
    String[][] Karty = new String[6][3];//-----------00

    public StrelaneKackyHra() {
        Proverka proverka = new Proverka();
        Random random = new Random();

        if(pocethracov ==0) {
            Hrac hrac =new Hrac();
            this.pocethracov = ZKlavesnice.readInt(" ");
            hrac.setHraci(pocethracov);
            this.h = ((hrac.getHraci() + 1) * 5);
        }
        for (i=0;i<6;i++){
            Zoom[i] = "Nezamierane";
        }
        String[] PolePreRandom = new String[h+1];// pole pre random na ribnicek
        for (i=0;i < 5;i++){
            PolePreRandom[i] = "Voda";
        }
        for (i=5;i < 10;i++){
            PolePreRandom[i] = "Kacka hraca 1";
        }
        for (i=10;i < 15;i++){
            PolePreRandom[i] = "Kacka hraca 2";
        }
        if(pocethracov > 2) {
            for (i = 15; i < 20; i++) {
                PolePreRandom[i] = "Kacka hraca 3";
            }
        }
        if (pocethracov > 3) {
            for (i = 20; i < 25; i++) {
                PolePreRandom[i] = "Kacka hraca 4";
            }
        }
        if(pocethracov > 4) {
            for (i = 25; i < 30; i++) {
                PolePreRandom[i] = "Kacka hraca 5";
            }
        }
        if(pocethracov > 5)
            for (i = 30; i < 35; i++) {
                PolePreRandom[i] = "Kacka hraca 6";
            }
        for (i=0;i<6;i++){
            for (int r = 0; PolePreRandom[r] != null; r++) {
                pocetkart1 = r;
            }
            randomcisloprehracov = random.nextInt(pocetkart1);
            RybnikPreRandom[i] = PolePreRandom[randomcisloprehracov];
            System.out.println((i+1)+". "+Zoom[i]+"-"+RybnikPreRandom[i]);//----------------------
            for (int m = randomcisloprehracov; m < pocetkart + 1; m++) {
                RybnikPreRandom[m] = RybnikPreRandom[m + 1];
            }
        }

        RandomPreKarty[0] = "TurboKacka";
        RandomPreKarty[1] = "KacaciTanec";
        for (i = 2; i < 4; i++) {
            RandomPreKarty[i] = "Rosambo";
        }
        for (i = 4; i < 6; i++) {
            RandomPreKarty[i] = "DivokyBill";
        }
        for (i = 6; i < 12; i++) {
            RandomPreKarty[i] = "KacaciPohod";
        }
        for (i = 12; i < 22; i++) {
            RandomPreKarty[i] = "ZoomAkcna";
        }
        for (i = 22; i < 34; i++) {
            RandomPreKarty[i] = "Strelat";
        }
        for (int j = 0; j< pocethracov; j++) {
            for (i = 0; i < 3; i++) {
                for (int r = 0; RandomPreKarty[r] != null; r++) {
                    pocetkart = r;
                }
                randomcislo = random.nextInt(pocetkart);
                Karty[j][i] = RandomPreKarty[randomcislo];// ------karty pre hraca 1
                for (int m = randomcislo; m < pocetkart + 1; m++) {
                    RandomPreKarty[m] = RandomPreKarty[m + 1];
                }
            }
        }
        for (int j = 1; j <= pocethracov; j++) {//----------------------------------------------
            System.out.println("Chodi hrac" + j + ":");
            for (i = 0; i < 3; i++) {
                System.out.println((i + 1) + ". " + Karty[j - 1][i]);
            }
            System.out.println("Napis od 1-3:");
            vyber = ZKlavesnice.readInt(" ");//1
            proverka.setVyber(vyber);
            vyber = proverka.getVyber();
            vyber1 = Karty[j-1][vyber-1];
            proverka.setVyber1(vyber1);
            akcna = proverka.getVyber1();
            if(akcna == 6) {
                Zamierit zamierit = new Zamierit();
                vyberzoom = zamierit.getVyberzoom();
                for (i = 0;i<6;i++) {
                    if (Zoom[i] == Zoom[vyberzoom-1] && Zoom[i] == "Zamierene") {
                        zamierit.setK(i);
                    }
                }
                vyberzoom = zamierit.getVyberzoom();
                Zoom[vyberzoom-1] = "Zamierene";
            }
            if(akcna == 7) {
                Strelat strelat = new Strelat();
                vyberstrelat = strelat.getVyberstrelat();
                for (i = 0;i<6;i++) {
                    if (Zoom[i] == Zoom[vyberstrelat - 1] && Zoom[i] == "Zamierene") {
                        randomcisloprehracov = random.nextInt(RybnikPreRandom.length -1);
                        for (int m = vyberstrelat - 1; m < RybnikPreRandom.length -1; m++) {
                            RybnikPreRandom[m] = RybnikPreRandom[m + 1];
                        }
                        RybnikPreRandom[5] = PolePreRandom[randomcisloprehracov];
                        Zoom[i] = "Nezamerane";
                        strelat.setK1(i);
                    }
                }
            }
            for (i=0;i<6;i++){
                System.out.println((i+1)+". "+Zoom[i]+"-"+RybnikPreRandom[i]);//----------------------
            }
        }
    }
}

