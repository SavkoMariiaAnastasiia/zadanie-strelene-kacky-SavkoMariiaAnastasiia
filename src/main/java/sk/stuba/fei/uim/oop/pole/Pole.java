package sk.stuba.fei.uim.oop.pole;
import java.util.Random;
import sk.stuba.fei.uim.oop.hrac.Hrac;
import sk.stuba.fei.uim.oop.utility.ZKlavesnice;

public class Pole {
    Random random = new Random();
    public int k;
    private int i;
    public int h;

    public int getK() {
        return k;
    }

    public void setK(int k) {
        this.k = k;
    }

    public Pole(){

        Hrac hrac = new Hrac();
        k = ZKlavesnice.readInt(" ");
        hrac.setHraci(k);
        h = ((hrac.getHraci()+1)*5);
        String[] PolePreRandom = new String[h];// pole pre random na ribnicek
        for (i=0;i < 5;i++){
            PolePreRandom[i] = "Voda";
        }
        for (i=5;i < 10;i++){
            PolePreRandom[i] = "Kacka1";
        }
        for (i=10;i < 15;i++){
            PolePreRandom[i] = "Kacka2";
        }
            if((PolePreRandom.length) > 15) {
                for (i = 15; i < 20; i++) {
                    PolePreRandom[i] = "Kacka3";
                }
            }
            if ((PolePreRandom.length) > 20) {
                    for (i = 20; i < 25; i++) {
                        PolePreRandom[i] = "Kacka4";
                    }
            }
            if((PolePreRandom.length) > 25) {
                for (i = 25; i < 30; i++) {
                    PolePreRandom[i] = "Kacka5";
                }
            }
            if((PolePreRandom.length) > 30)
            for (i = 30; i < 35; i++) {
                PolePreRandom[i] = "Kacka6";
            }
        String[] RybnikPreRandom = new String[6];//rybnik 6 poli
        for (i=0;i<6;i++){
          int k = random.nextInt(PolePreRandom.length);
            RybnikPreRandom[i] = PolePreRandom[k];
            System.out.println((i+1)+". "+RybnikPreRandom[i]);
        }
    }
}
