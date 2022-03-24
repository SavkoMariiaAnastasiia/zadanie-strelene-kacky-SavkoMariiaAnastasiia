package sk.stuba.fei.uim.oop;

import java.util.Collections;

public class Rosambo extends AkcneKarty  {


    @Override
    public void akcia(Hra hra) {
        Collections.shuffle(hra.stol);

    }

    @Override
    public String toString() {
        return "Rosambo";
    }
}

