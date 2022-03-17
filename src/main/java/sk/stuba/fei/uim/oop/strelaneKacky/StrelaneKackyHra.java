package sk.stuba.fei.uim.oop.strelaneKacky;

//import sk.stuba.fei.uim.oop.hrac.Hrac;
//import sk.stuba.fei.uim.oop.utility.KeyboardInput;
//import sk.stuba.fei.uim.oop.utility.ZKlavesnice;
//import java.util.List;
//import java.util.Scanner;
import sk.stuba.fei.uim.oop.pole.Pole;
import sk.stuba.fei.uim.oop.utility.ZKlavesnice;

import java.util.Random;


public class StrelaneKackyHra {
    private int i;
    private int pocetkart;//pre random
    public int randomcislo;
    public int vyber;
    public StrelaneKackyHra(){
        Pole pole = new Pole();

        int k = pole.getK();
        Random random = new Random();
        String[] RandomPreKarty = new String[35];
        String[] KartyHraca1 = new String[3];
        String[] KartyHraca2 = new String[3];
        String[] KartyHraca3 = new String[3];
        String[] KartyHraca4 = new String[3];
        String[] KartyHraca5 = new String[3];
        String[] KartyHraca6 = new String[3];
        RandomPreKarty[0] = "TurboKacka";
        RandomPreKarty[1] = "KacaciTanec";
        for (i =2;i<4;i++){
            RandomPreKarty[i] = "Rosambo";
        }
        for (i =4;i<6;i++){
            RandomPreKarty[i] = "DivokyBill";
        }
        for (i =6;i<12;i++){
            RandomPreKarty[i] = "KacaciPohod";
        }
        for (i =12;i<22;i++){
            RandomPreKarty[i] = "ZoomAkcna";
        }
        for (i =22;i<34;i++){
            RandomPreKarty[i] = "Strelat";
        }
        for(i=0;i<3;i++) {
            for (int r=0;RandomPreKarty[r] != null;r++){
                pocetkart = r;
            }
            randomcislo = random.nextInt(pocetkart);
            KartyHraca1[i] = RandomPreKarty[randomcislo];// ------karty pre hraca 1
            for (int m = randomcislo; m < pocetkart +1; m++) {
                RandomPreKarty[m] = RandomPreKarty[m+1];
            }
        }
        for(i=0;i<3;i++){
            for (int r=0;RandomPreKarty[r] != null;r++){
                pocetkart = r;
            }
            randomcislo = random.nextInt(pocetkart);
            KartyHraca2[i] = RandomPreKarty[randomcislo];// ------karty pre hraca 2
            for (int m = randomcislo; m < pocetkart +1; m++) {
                RandomPreKarty[m] = RandomPreKarty[m+1];
            }
        }
        if (k>=3) {
            for (i = 0; i < 3; i++) {
                for (int r = 0; RandomPreKarty[r] != null; r++) {
                    pocetkart = r;
                }
                randomcislo = random.nextInt(pocetkart);
                KartyHraca3[i] = RandomPreKarty[randomcislo];// ------karty pre hraca 3
                for (int m = randomcislo; m < pocetkart + 1; m++) {
                    RandomPreKarty[m] = RandomPreKarty[m + 1];
                }
            }
        }
        if (k>=4) {
            for (i = 0; i < 3; i++) {
                for (int r = 0; RandomPreKarty[r] != null; r++) {
                    pocetkart = r;
                }
                randomcislo = random.nextInt(pocetkart);
                KartyHraca4[i] = RandomPreKarty[randomcislo];// ------karty pre hraca 4
                for (int m = randomcislo; m < pocetkart + 1; m++) {
                    RandomPreKarty[m] = RandomPreKarty[m + 1];
                }
            }
        }
        if(k>=5) {
            for (i = 0; i < 3; i++) {
                for (int r = 0; RandomPreKarty[r] != null; r++) {
                    pocetkart = r;
                }
                randomcislo = random.nextInt(pocetkart);
                KartyHraca5[i] = RandomPreKarty[randomcislo];// ------karty pre hraca 5
                for (int m = randomcislo; m < pocetkart + 1; m++) {
                    RandomPreKarty[m] = RandomPreKarty[m + 1];
                }
            }
        }
        if(k>=6) {
            for (i = 0; i < 3; i++) {
                for (int r = 0; RandomPreKarty[r] != null; r++) {
                    pocetkart = r;
                }
                randomcislo = random.nextInt(pocetkart);
                KartyHraca6[i] = RandomPreKarty[randomcislo];// ------karty pre hraca 6
                for (int m = randomcislo; m < pocetkart + 1; m++) {
                    RandomPreKarty[m] = RandomPreKarty[m + 1];
                }
            }
        }
        System.out.println("Chodi hrac1:");
        for (i=0;i<3;i++){
            System.out.println((i+1) + ". " + KartyHraca1[i]);
        }
        System.out.println("Napis od 1-3:");
        vyber = ZKlavesnice.readInt(" ");//1

        System.out.println("Chodi hrac2:");
        for (i=0;i<3;i++){
            System.out.println((i+1) + ". " + KartyHraca2[i]);
        }
        System.out.println("Napis od 1-3:");
        vyber = ZKlavesnice.readInt(" ");//2
        if(k>=3) {
            System.out.println("Chodi hrac3:");
            for (i = 0; i < 3; i++) {
                System.out.println((i + 1) + ". " + KartyHraca3[i]);
            }
            System.out.println("Napis od 1-3:");
            vyber = ZKlavesnice.readInt(" ");//3
        }
        if(k>=4) {
            System.out.println("Chodi hrac4:");
            for (i = 0; i < 3; i++) {
                System.out.println((i + 1) + ". " + KartyHraca4[i]);
            }
            System.out.println("Napis od 1-3:");
            vyber = ZKlavesnice.readInt(" ");//4
        }
        if(k>=5) {
            System.out.println("Chodi hrac5:");
            for (i = 0; i < 3; i++) {
                System.out.println((i + 1) + ". " + KartyHraca5[i]);
            }
            System.out.println("Napis od 1-3:");
            vyber = ZKlavesnice.readInt(" ");//5
        }
        if(k>=6) {
            System.out.println("Chodi hrac6:");
            for (i = 0; i < 3; i++) {
                System.out.println((i + 1) + ". " + KartyHraca6[i]);
            }
            System.out.println("Napis od 1-3:");
            vyber = ZKlavesnice.readInt(" ");//6
        }
    }
}

