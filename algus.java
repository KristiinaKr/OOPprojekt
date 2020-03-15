package OOPprojekt;

import javax.swing.*;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class algus {

    public static void main(String[] args) {

        ÜL1 ülesanne1 = new ÜL1 (ThreadLocalRandom.current().nextDouble(0.5,1), 0.3, 0.3);

        ülesanne1.lahendus();

        double a = Math.round(Math.random()*10)/10.0;

        double katkineEsimesest = ThreadLocalRandom.current().nextDouble(0.5,1);



    }
}