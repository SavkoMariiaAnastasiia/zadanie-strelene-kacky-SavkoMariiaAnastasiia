package sk.stuba.fei.uim.oop.strelaneKacky;

//import sk.stuba.fei.uim.oop.utility.KeyboardInput;
//import java.util.List;
import sk.stuba.fei.uim.oop.proverka.Proverka;
import sk.stuba.fei.uim.oop.utility.ZKlavesnice;
import sk.stuba.fei.uim.oop.pole.Pole;
import sk.stuba.fei.uim.oop.proverka.Proverka;


import java.util.Random;


public class StrelaneKackyHra {
    private int i;
    private int pocetkart;//pre random
    public int randomcislo;
    public int vyber;
    public String vyber1;

    public StrelaneKackyHra() {
        Pole pole = new Pole();
        Proverka proverka = new Proverka();

        int k = pole.getK();
        Random random = new Random();
        String[] RandomPreKarty = new String[35];
        String[][] Karty = new String[6][3];

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
        for (int j=0;j<k;j++) {
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
        for (int j = 1; j <= k; j++) {
            System.out.println("Chodi hrac"+ j +":");
            for (i = 0; i < 3; i++) {
                System.out.println((i + 1) + ". " + Karty[j-1][i]);
            }
            System.out.println("Napis od 1-3:");
            vyber = ZKlavesnice.readInt(" ");//1
            proverka.setVyber(vyber);
            vyber1 = Karty[j][vyber - 1];
            proverka.setVyber1(vyber1);
        }
    }
}

