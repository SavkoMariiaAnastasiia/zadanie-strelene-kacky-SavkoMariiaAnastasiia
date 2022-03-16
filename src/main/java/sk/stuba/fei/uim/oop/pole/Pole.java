package sk.stuba.fei.uim.oop.pole;
import java.util.Random;

public class Pole {
    Random random = new Random();
    public Pole(){
        String[] PolePreRandom = new String[25];// pole pre random na ribnicek
        for (int i=0;i < 5;i++){
            PolePreRandom[i] = "Voda";
        }
        for (int i=5;i < 10;i++){
            PolePreRandom[i] = "Kacka1";
        }
        for (int i=10;i < 15;i++){
            PolePreRandom[i] = "Kacka2";
        }
        if ((PolePreRandom.length) > 15) {
            if((PolePreRandom.length) > 15) {
                for (int i = 15; i < 20; i++) {
                    PolePreRandom[i] = "Kacka3";
                }
            }
            if ((PolePreRandom.length) > 20) {
                    for (int i = 20; i < 25; i++) {
                        PolePreRandom[i] = "Kacka4";
                    }
            }
            if((PolePreRandom.length) > 25) {
                for (int i = 25; i < 30; i++) {
                    PolePreRandom[i] = "Kacka5";
                }
            }
            if((PolePreRandom.length) >= 30)
            for (int i = 30; i < 35; i++) {
                PolePreRandom[i] = "Kacka6";
            }
        }
        String[] RybnikPreRandom = new String[6];//rybnik 6 poli
        for (int i=0;i<6;i++){
          int k = random.nextInt(PolePreRandom.length);
            RybnikPreRandom[i] = PolePreRandom[k];
            System.out.println(RybnikPreRandom[i]);
        }


    }


}
